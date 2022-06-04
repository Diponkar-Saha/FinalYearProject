package com.example.hellodoctor.repositort

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.hellodoctor.core.model.User

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.storage.FirebaseStorage
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import java.util.*
import javax.inject.Inject

private const val TAG = "TESTE"
class FirebaseAuthRepository @Inject constructor(
    private val authentication: FirebaseAuth,
    private val db: FirebaseFirestore,
    private val storage: FirebaseStorage,
    private val sharedPref: Preferences,
    @ApplicationContext private val appContext: Context
) {
    var userLiveData: MutableLiveData<FirebaseUser>? = MutableLiveData()
    var loginUserLiveData: MutableLiveData<FirebaseUser>? = MutableLiveData()
    fun getUserDetails() = sharedPref.getUserData()
    private val fileName = UUID.randomUUID().toString()



    suspend fun createUser(
         uid: String, name: String, email: String, password: String,photoUrl: String
    ) = flow<Resource<User>> {
        emit(Resource.Loading())
        val response = authentication.createUserWithEmailAndPassword(email, password).await()
        response.user?.let {
           // val token = getUserFcmToken()
            val user = User(
                uid  = it.uid, userName = name, userEmail = email,photoUrl = photoUrl
            )
           // user.deviceToken = token
            saveUserInFireStore(user)
            sharedPref.saveUserData(user)
            emit(Resource.Success(user))
        } ?: emit(Resource.Error())
    }.catch {
        authentication.signOut()
        emit(Resource.Error(it.message.toString()))
    }




    suspend fun loginUser(email: String, password: String) = flow<Resource<User>> {
        emit(Resource.Loading())
        val response = authentication.signInWithEmailAndPassword(email, password).await()
        response.user?.let {
            val userId = it.uid
            val user = getUserDataFromFireStore(userId)
            sharedPref.saveUserData(user = user.data!!)
            emit(user)
        } ?: emit(Resource.Error())
    }.catch {
        emit(Resource.Error(it.message.toString()))
    }

    suspend fun getUserDataFromFireStore(userId: String): Resource<User> {
        val user =
            db.collection("users").document(userId).get().await().toObject<User>()
        return user?.let {
            Resource.Success(it)
        } ?: Resource.Error()

    }


    private suspend fun saveUserInFireStore(user: User) =
        user.uid?.let { db.collection("users").document(it).set(user).await() }








}









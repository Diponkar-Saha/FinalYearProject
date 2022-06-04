package com.example.hellodoctor.model

import timber.log.Timber

data class User(
    var userName: String? = null,
    var userEmail: String? = null,
    var uid: String? = null,
    var photoUrl: String? = null,
    val cohortsIn: MutableList<String> = mutableListOf() // cohort unique ids
)


fun MutableMap<String?, Any?>.mapToUserObject(): User? {
    return try {
        User(
            uid = this["uid"] as String,
            userName = this["userName"] as String,
            userEmail = this["userEmail"] as String,
            photoUrl = (this["photoUrl"] as? String),
            cohortsIn = (this["cohortsIn"] as? MutableList<String>)?: mutableListOf()
        )
    } catch (ex: Exception) {
        Timber.e(ex, "Error converting map to user object!")
        null
    }
}

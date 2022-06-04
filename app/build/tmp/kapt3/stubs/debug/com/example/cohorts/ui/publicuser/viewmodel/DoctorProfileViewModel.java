package com.example.cohorts.ui.publicuser.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cohorts/ui/publicuser/viewmodel/DoctorProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cohorts/repositort/SpecialRepository;", "(Lcom/example/cohorts/repositort/SpecialRepository;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/cohorts/model/topdoctor/AllDoctor;", "responseDoctorlistShow", "Landroidx/lifecycle/LiveData;", "getResponseDoctorlistShow", "()Landroidx/lifecycle/LiveData;", "allDoctorlist", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class DoctorProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.repositort.SpecialRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.cohorts.model.topdoctor.AllDoctor>> _response = null;
    
    @javax.inject.Inject()
    public DoctorProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.SpecialRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cohorts.model.topdoctor.AllDoctor>> getResponseDoctorlistShow() {
        return null;
    }
    
    private final kotlinx.coroutines.Job allDoctorlist() {
        return null;
    }
}
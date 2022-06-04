package com.example.hellodoctor;

import com.example.hellodoctor.core.CoroutinesModule;
import com.example.hellodoctor.core.FirebaseModule;
import com.example.hellodoctor.core.repository.chat.ChatRepositoryModule;
import com.example.hellodoctor.core.repository.cohorts.CohortsRepositoryModule;
import com.example.hellodoctor.core.repository.meeting.MeetingRepositoryModule;
import com.example.hellodoctor.core.repository.tasks.TasksRepositoryModule;
import com.example.hellodoctor.core.repository.theme.ThemeRepositoryModule;
import com.example.hellodoctor.core.repository.user.UserRepositoryModule;
import com.example.hellodoctor.core.storage.StorageModule;
import com.example.hellodoctor.repositort.FirebaseAuthViewModel_HiltModules;
import com.example.hellodoctor.ui.chat.ChatFragment_GeneratedInjector;
import com.example.hellodoctor.ui.chat.ChatViewModel_HiltModules;
import com.example.hellodoctor.ui.cohorts.CohortsViewModel_HiltModules;
import com.example.hellodoctor.ui.cohorts.newcohort.AddNewCohortViewModel_HiltModules;
import com.example.hellodoctor.ui.cohorts.newmember.AddNewMemberFragment_GeneratedInjector;
import com.example.hellodoctor.ui.cohorts.newmember.AddNewMemberViewModel_HiltModules;
import com.example.hellodoctor.ui.doctor.AppoinntmentViewModel_HiltModules;
import com.example.hellodoctor.ui.doctor.DoctorActivity_GeneratedInjector;
import com.example.hellodoctor.ui.doctor.DoctorDashFragment_GeneratedInjector;
import com.example.hellodoctor.ui.doctor.EditDoctorProfileViewModel_HiltModules;
import com.example.hellodoctor.ui.info.CohortInfoViewModel_HiltModules;
import com.example.hellodoctor.ui.login.DrLoginActivity_GeneratedInjector;
import com.example.hellodoctor.ui.login.Login1ViewModel_HiltModules;
import com.example.hellodoctor.ui.login.LoginActivity_GeneratedInjector;
import com.example.hellodoctor.ui.login.LoginViewModel_HiltModules;
import com.example.hellodoctor.ui.login.PublicLoginActivity_GeneratedInjector;
import com.example.hellodoctor.ui.main.MainViewModel_HiltModules;
import com.example.hellodoctor.ui.profile.ProfileFragment_GeneratedInjector;
import com.example.hellodoctor.ui.profile.ProfileViewModel_HiltModules;
import com.example.hellodoctor.ui.publicuser.PublUserActivity_GeneratedInjector;
import com.example.hellodoctor.ui.publicuser.viewmodel.DoctorProfileViewModel_HiltModules;
import com.example.hellodoctor.ui.publicuser.viewmodel.HomeViewmodel_HiltModules;
import com.example.hellodoctor.ui.register.AUthViewModel_HiltModules;
import com.example.hellodoctor.ui.register.DrRegisterActivity_GeneratedInjector;
import com.example.hellodoctor.ui.register.PublicRegisterActivity_GeneratedInjector;
import com.example.hellodoctor.ui.splash.SplashViewModel_HiltModules;
import com.example.hellodoctor.ui.tasks.TasksFragment_GeneratedInjector;
import com.example.hellodoctor.ui.tasks.TasksViewModel_HiltModules;
import com.example.hellodoctor.ui.tasks.addNewTask.AddNewTaskFragment_GeneratedInjector;
import com.example.hellodoctor.ui.tasks.addNewTask.AddNewTaskViewModel_HiltModules;
import com.example.hellodoctor.ui.tasks.taskdetail.TaskDetailFragment_GeneratedInjector;
import com.example.hellodoctor.ui.tasks.taskdetail.TaskDetailViewModel_HiltModules;
import com.example.hellodoctor.video.ui.cohorts.CohortsFragment_GeneratedInjector;
import com.example.hellodoctor.video.ui.cohorts.newcohort.AddNewCohort_GeneratedInjector;
import com.example.hellodoctor.video.ui.info.CohortInfoFragment_GeneratedInjector;
import com.example.hellodoctor.video.ui.main.MainActivity_GeneratedInjector;
import com.example.hellodoctor.video.ui.splash.SplashScreenActivity_GeneratedInjector;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class CohortsApplication_HiltComponents {
  private CohortsApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          CohortsRepositoryModule.class,
          CoroutinesModule.class,
          FirebaseModule.class,
          StorageModule.class,
          TasksRepositoryModule.class,
          ThemeRepositoryModule.class,
          UserRepositoryModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements CohortsApplication_GeneratedInjector,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AUthViewModel_HiltModules.KeyModule.class,
          AddNewCohortViewModel_HiltModules.KeyModule.class,
          AddNewMemberViewModel_HiltModules.KeyModule.class,
          AddNewTaskViewModel_HiltModules.KeyModule.class,
          AppoinntmentViewModel_HiltModules.KeyModule.class,
          ChatViewModel_HiltModules.KeyModule.class,
          CohortInfoViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          CohortsViewModel_HiltModules.KeyModule.class,
          DoctorProfileViewModel_HiltModules.KeyModule.class,
          EditDoctorProfileViewModel_HiltModules.KeyModule.class,
          FirebaseAuthViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HomeViewmodel_HiltModules.KeyModule.class,
          Login1ViewModel_HiltModules.KeyModule.class,
          LoginViewModel_HiltModules.KeyModule.class,
          MainViewModel_HiltModules.KeyModule.class,
          MeetingRepositoryModule.class,
          ProfileViewModel_HiltModules.KeyModule.class,
          SplashViewModel_HiltModules.KeyModule.class,
          TaskDetailViewModel_HiltModules.KeyModule.class,
          TasksViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements DoctorActivity_GeneratedInjector,
      DrLoginActivity_GeneratedInjector,
      LoginActivity_GeneratedInjector,
      PublicLoginActivity_GeneratedInjector,
      PublUserActivity_GeneratedInjector,
      DrRegisterActivity_GeneratedInjector,
      PublicRegisterActivity_GeneratedInjector,
      MainActivity_GeneratedInjector,
      SplashScreenActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AUthViewModel_HiltModules.BindsModule.class,
          AddNewCohortViewModel_HiltModules.BindsModule.class,
          AddNewMemberViewModel_HiltModules.BindsModule.class,
          AddNewTaskViewModel_HiltModules.BindsModule.class,
          AppoinntmentViewModel_HiltModules.BindsModule.class,
          ChatRepositoryModule.class,
          ChatViewModel_HiltModules.BindsModule.class,
          CohortInfoViewModel_HiltModules.BindsModule.class,
          CohortsViewModel_HiltModules.BindsModule.class,
          DoctorProfileViewModel_HiltModules.BindsModule.class,
          EditDoctorProfileViewModel_HiltModules.BindsModule.class,
          FirebaseAuthViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeViewmodel_HiltModules.BindsModule.class,
          Login1ViewModel_HiltModules.BindsModule.class,
          LoginViewModel_HiltModules.BindsModule.class,
          MainViewModel_HiltModules.BindsModule.class,
          ProfileViewModel_HiltModules.BindsModule.class,
          SplashViewModel_HiltModules.BindsModule.class,
          TaskDetailViewModel_HiltModules.BindsModule.class,
          TasksViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements ChatFragment_GeneratedInjector,
      AddNewMemberFragment_GeneratedInjector,
      DoctorDashFragment_GeneratedInjector,
      ProfileFragment_GeneratedInjector,
      TasksFragment_GeneratedInjector,
      AddNewTaskFragment_GeneratedInjector,
      TaskDetailFragment_GeneratedInjector,
      CohortsFragment_GeneratedInjector,
      AddNewCohort_GeneratedInjector,
      CohortInfoFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}

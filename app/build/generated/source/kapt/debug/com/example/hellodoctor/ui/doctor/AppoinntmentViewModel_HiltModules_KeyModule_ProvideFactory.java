// Generated by Dagger (https://dagger.dev).
package com.example.hellodoctor.ui.doctor;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppoinntmentViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AppoinntmentViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AppoinntmentViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AppoinntmentViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AppoinntmentViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}

// Generated by Dagger (https://dagger.dev).
package com.example.hellodoctor.ui.register;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AUthViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AUthViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AUthViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AUthViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AUthViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}

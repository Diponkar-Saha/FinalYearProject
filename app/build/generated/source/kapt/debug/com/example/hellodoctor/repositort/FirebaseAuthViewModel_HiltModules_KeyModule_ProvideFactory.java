// Generated by Dagger (https://dagger.dev).
package com.example.hellodoctor.repositort;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirebaseAuthViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static FirebaseAuthViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(FirebaseAuthViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final FirebaseAuthViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new FirebaseAuthViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}

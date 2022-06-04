// Generated by Dagger (https://dagger.dev).
package com.example.hellodoctor.core;

import com.example.hellodoctor.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirebaseModule_ProvideRetrofitInstanceFactory implements Factory<ApiService> {
  private final Provider<String> bASE_URLProvider;

  public FirebaseModule_ProvideRetrofitInstanceFactory(Provider<String> bASE_URLProvider) {
    this.bASE_URLProvider = bASE_URLProvider;
  }

  @Override
  public ApiService get() {
    return provideRetrofitInstance(bASE_URLProvider.get());
  }

  public static FirebaseModule_ProvideRetrofitInstanceFactory create(
      Provider<String> bASE_URLProvider) {
    return new FirebaseModule_ProvideRetrofitInstanceFactory(bASE_URLProvider);
  }

  public static ApiService provideRetrofitInstance(String BASE_URL) {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.provideRetrofitInstance(BASE_URL));
  }
}

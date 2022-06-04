package com.example.hellodoctor;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = CohortsApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface CohortsApplication_GeneratedInjector {
  void injectCohortsApplication(CohortsApplication cohortsApplication);
}

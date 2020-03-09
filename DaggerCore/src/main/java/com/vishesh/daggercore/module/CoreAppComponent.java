package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.ExpensiveObject;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = AppModule.class)
public interface CoreAppComponent {
    ExpensiveObject expensiveObect();
}

package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import com.vishesh.daggercore.beans.ExpensiveObject;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class AppModule {

    @Provides
    @Singleton
    public ExpensiveObject providesExpensiveObject(){
        return new ExpensiveObject();
    }

    @Provides
    @Singleton
    public AnotherExpensiveBean providesAnotherExpensiveBean(ExpensiveObject expensiveObject){
        return new AnotherExpensiveBean(expensiveObject);
    }

}

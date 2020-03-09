package com.vishesh.DaggerParent.module;

import com.vishesh.DaggerParent.beans.ParentBean;
import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ParentModule {

    // important to note here is the use of RemoteDataScope scope in place of singleton scope
    @Provides
    @RemoteDataScope
    public ParentBean providesParentBean( AnotherExpensiveBean anotherExpensiveBean){
        return new ParentBean(anotherExpensiveBean);
    }

}

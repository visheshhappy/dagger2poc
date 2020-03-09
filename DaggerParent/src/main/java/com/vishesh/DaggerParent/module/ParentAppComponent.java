package com.vishesh.DaggerParent.module;

import com.vishesh.DaggerParent.beans.ParentBean;
import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import com.vishesh.daggercore.module.CoreAppComponent;
import dagger.Component;

@RemoteDataScope
@Component(modules = {
        ParentModule.class
},dependencies = CoreAppComponent.class)
public interface ParentAppComponent {

    ParentBean parentBean();

    AnotherExpensiveBean anotherExpensiveBean();

}

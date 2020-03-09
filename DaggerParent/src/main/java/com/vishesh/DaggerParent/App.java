package com.vishesh.DaggerParent;

import com.vishesh.DaggerParent.beans.ParentBean;
import com.vishesh.DaggerParent.module.DaggerParentAppComponent;
import com.vishesh.DaggerParent.module.ParentAppComponent;
import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import com.vishesh.daggercore.module.DaggerCoreAppComponent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ParentAppComponent daggerParentAppComponent = DaggerParentAppComponent.builder().coreAppComponent(
                DaggerCoreAppComponent.builder().build()).build();
        ParentBean bean = daggerParentAppComponent.parentBean();
        System.out.println(bean.getValue());
        AnotherExpensiveBean bean1 = bean.getAnotherExpensiveBean();


        ParentAppComponent daggerParentAppComponent2 = DaggerParentAppComponent.builder().coreAppComponent(
                DaggerCoreAppComponent.builder().build()).build();
        ParentBean parentBean = daggerParentAppComponent2.parentBean();
        System.out.println(parentBean.getValue());
        AnotherExpensiveBean bean2 = parentBean.getAnotherExpensiveBean();

        System.out.println(bean1.equals(bean2));




    }
}

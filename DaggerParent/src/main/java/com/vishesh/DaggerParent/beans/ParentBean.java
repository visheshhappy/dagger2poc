package com.vishesh.DaggerParent.beans;

import com.vishesh.daggercore.beans.AnotherExpensiveBean;

import javax.inject.Inject;
import java.util.Objects;

public class ParentBean {

    private String value;
    private AnotherExpensiveBean anotherExpensiveBean;

    @Inject
    public ParentBean(AnotherExpensiveBean anotherExpensiveBean){
        this.value = "parent bean";
        this.anotherExpensiveBean = anotherExpensiveBean;
    }

    public String getValue(){
        return value;
    }

    public AnotherExpensiveBean getAnotherExpensiveBean(){
        return anotherExpensiveBean;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final ParentBean that = (ParentBean) o;
        return Objects.equals(value, that.value) && Objects.equals(anotherExpensiveBean, that.anotherExpensiveBean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, anotherExpensiveBean);
    }
}

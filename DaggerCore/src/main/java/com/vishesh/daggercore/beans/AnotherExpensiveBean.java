package com.vishesh.daggercore.beans;

import javax.inject.Inject;
import java.util.Objects;

public class AnotherExpensiveBean {

    private ExpensiveObject expensiveObject;

    // The inject is needed here to have this dependency on the ParentAPpComponent.
    @Inject
    public AnotherExpensiveBean(ExpensiveObject expensiveObject) {
        this.expensiveObject = expensiveObject;
    }

    public ExpensiveObject getExpensiveObject() {
        return expensiveObject;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final AnotherExpensiveBean that = (AnotherExpensiveBean) o;
        return Objects.equals(expensiveObject, that.expensiveObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expensiveObject);
    }
}

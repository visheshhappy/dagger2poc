package com.vishesh.daggercore.beans;

import java.util.Objects;

public class ExpensiveObject {

    private String value;

    public ExpensiveObject(){
        this.value =  "expensiveValue";
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final ExpensiveObject that = (ExpensiveObject) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

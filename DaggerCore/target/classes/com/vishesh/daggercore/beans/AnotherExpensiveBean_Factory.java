package com.vishesh.daggercore.beans;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AnotherExpensiveBean_Factory implements Factory<AnotherExpensiveBean> {
  private final Provider<ExpensiveObject> expensiveObjectProvider;

  public AnotherExpensiveBean_Factory(Provider<ExpensiveObject> expensiveObjectProvider) {
    this.expensiveObjectProvider = expensiveObjectProvider;
  }

  @Override
  public AnotherExpensiveBean get() {
    return newInstance(expensiveObjectProvider.get());
  }

  public static AnotherExpensiveBean_Factory create(
      Provider<ExpensiveObject> expensiveObjectProvider) {
    return new AnotherExpensiveBean_Factory(expensiveObjectProvider);
  }

  public static AnotherExpensiveBean newInstance(ExpensiveObject expensiveObject) {
    return new AnotherExpensiveBean(expensiveObject);
  }
}

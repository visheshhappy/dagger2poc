package com.vishesh.DaggerParent.beans;

import com.vishesh.daggercore.beans.AnotherExpensiveBean;
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
public final class ParentBean_Factory implements Factory<ParentBean> {
  private final Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider;

  public ParentBean_Factory(Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider) {
    this.anotherExpensiveBeanProvider = anotherExpensiveBeanProvider;
  }

  @Override
  public ParentBean get() {
    return newInstance(anotherExpensiveBeanProvider.get());
  }

  public static ParentBean_Factory create(
      Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider) {
    return new ParentBean_Factory(anotherExpensiveBeanProvider);
  }

  public static ParentBean newInstance(AnotherExpensiveBean anotherExpensiveBean) {
    return new ParentBean(anotherExpensiveBean);
  }
}

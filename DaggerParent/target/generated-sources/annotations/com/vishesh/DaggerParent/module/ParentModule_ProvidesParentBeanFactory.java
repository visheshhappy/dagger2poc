package com.vishesh.DaggerParent.module;

import com.vishesh.DaggerParent.beans.ParentBean;
import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ParentModule_ProvidesParentBeanFactory implements Factory<ParentBean> {
  private final ParentModule module;

  private final Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider;

  public ParentModule_ProvidesParentBeanFactory(
      ParentModule module, Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider) {
    this.module = module;
    this.anotherExpensiveBeanProvider = anotherExpensiveBeanProvider;
  }

  @Override
  public ParentBean get() {
    return provideInstance(module, anotherExpensiveBeanProvider);
  }

  public static ParentBean provideInstance(
      ParentModule module, Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider) {
    return proxyProvidesParentBean(module, anotherExpensiveBeanProvider.get());
  }

  public static ParentModule_ProvidesParentBeanFactory create(
      ParentModule module, Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider) {
    return new ParentModule_ProvidesParentBeanFactory(module, anotherExpensiveBeanProvider);
  }

  public static ParentBean proxyProvidesParentBean(
      ParentModule instance, AnotherExpensiveBean anotherExpensiveBean) {
    return Preconditions.checkNotNull(
        instance.providesParentBean(anotherExpensiveBean),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

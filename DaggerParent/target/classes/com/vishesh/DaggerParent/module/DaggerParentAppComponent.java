package com.vishesh.DaggerParent.module;

import com.vishesh.DaggerParent.beans.ParentBean;
import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import com.vishesh.daggercore.beans.AnotherExpensiveBean_Factory;
import com.vishesh.daggercore.beans.ExpensiveObject;
import com.vishesh.daggercore.module.CoreAppComponent;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerParentAppComponent implements ParentAppComponent {
  private final CoreAppComponent coreAppComponent;

  private Provider<ExpensiveObject> expensiveObectProvider;

  private Provider<AnotherExpensiveBean> anotherExpensiveBeanProvider;

  private Provider<ParentBean> providesParentBeanProvider;

  private DaggerParentAppComponent(ParentModule parentModuleParam,
      CoreAppComponent coreAppComponentParam) {
    this.coreAppComponent = coreAppComponentParam;
    initialize(parentModuleParam, coreAppComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ParentModule parentModuleParam,
      final CoreAppComponent coreAppComponentParam) {
    this.expensiveObectProvider = new com_vishesh_daggercore_module_CoreAppComponent_expensiveObect(coreAppComponentParam);
    this.anotherExpensiveBeanProvider = AnotherExpensiveBean_Factory.create(expensiveObectProvider);
    this.providesParentBeanProvider = DoubleCheck.provider(ParentModule_ProvidesParentBeanFactory.create(parentModuleParam, anotherExpensiveBeanProvider));
  }

  @Override
  public ParentBean parentBean() {
    return providesParentBeanProvider.get();}

  @Override
  public AnotherExpensiveBean anotherExpensiveBean() {
    return new AnotherExpensiveBean(Preconditions.checkNotNull(coreAppComponent.expensiveObect(), "Cannot return null from a non-@Nullable component method"));}

  public static final class Builder {
    private ParentModule parentModule;

    private CoreAppComponent coreAppComponent;

    private Builder() {
    }

    public Builder parentModule(ParentModule parentModule) {
      this.parentModule = Preconditions.checkNotNull(parentModule);
      return this;
    }

    public Builder coreAppComponent(CoreAppComponent coreAppComponent) {
      this.coreAppComponent = Preconditions.checkNotNull(coreAppComponent);
      return this;
    }

    public ParentAppComponent build() {
      if (parentModule == null) {
        this.parentModule = new ParentModule();
      }
      Preconditions.checkBuilderRequirement(coreAppComponent, CoreAppComponent.class);
      return new DaggerParentAppComponent(parentModule, coreAppComponent);
    }
  }

  private static class com_vishesh_daggercore_module_CoreAppComponent_expensiveObect implements Provider<ExpensiveObject> {
    private final CoreAppComponent coreAppComponent;

    com_vishesh_daggercore_module_CoreAppComponent_expensiveObect(
        CoreAppComponent coreAppComponent) {
      this.coreAppComponent = coreAppComponent;
    }

    @Override
    public ExpensiveObject get() {
      return Preconditions.checkNotNull(coreAppComponent.expensiveObect(), "Cannot return null from a non-@Nullable component method");
    }
  }
}

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
  comments = "https://google.github.io/dagger"
)
public final class DaggerParentAppComponent implements ParentAppComponent {
  private CoreAppComponent coreAppComponent;

  private com_vishesh_daggercore_module_CoreAppComponent_expensiveObect expensiveObectProvider;

  private AnotherExpensiveBean_Factory anotherExpensiveBeanProvider;

  private Provider<ParentBean> providesParentBeanProvider;

  private DaggerParentAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.expensiveObectProvider =
        new com_vishesh_daggercore_module_CoreAppComponent_expensiveObect(builder.coreAppComponent);
    this.anotherExpensiveBeanProvider = AnotherExpensiveBean_Factory.create(expensiveObectProvider);
    this.providesParentBeanProvider =
        DoubleCheck.provider(
            ParentModule_ProvidesParentBeanFactory.create(
                builder.parentModule, anotherExpensiveBeanProvider));
    this.coreAppComponent = builder.coreAppComponent;
  }

  @Override
  public ParentBean parentBean() {
    return providesParentBeanProvider.get();
  }

  @Override
  public AnotherExpensiveBean anotherExpensiveBean() {
    return new AnotherExpensiveBean(
        Preconditions.checkNotNull(
            coreAppComponent.expensiveObect(),
            "Cannot return null from a non-@Nullable component method"));
  }

  public static final class Builder {
    private ParentModule parentModule;

    private CoreAppComponent coreAppComponent;

    private Builder() {}

    public ParentAppComponent build() {
      if (parentModule == null) {
        this.parentModule = new ParentModule();
      }
      if (coreAppComponent == null) {
        throw new IllegalStateException(CoreAppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerParentAppComponent(this);
    }

    public Builder parentModule(ParentModule parentModule) {
      this.parentModule = Preconditions.checkNotNull(parentModule);
      return this;
    }

    public Builder coreAppComponent(CoreAppComponent coreAppComponent) {
      this.coreAppComponent = Preconditions.checkNotNull(coreAppComponent);
      return this;
    }
  }

  private static class com_vishesh_daggercore_module_CoreAppComponent_expensiveObect
      implements Provider<ExpensiveObject> {
    private final CoreAppComponent coreAppComponent;

    com_vishesh_daggercore_module_CoreAppComponent_expensiveObect(
        CoreAppComponent coreAppComponent) {
      this.coreAppComponent = coreAppComponent;
    }

    @Override
    public ExpensiveObject get() {
      return Preconditions.checkNotNull(
          coreAppComponent.expensiveObect(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}

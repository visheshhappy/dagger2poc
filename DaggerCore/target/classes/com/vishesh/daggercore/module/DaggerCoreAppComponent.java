package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.ExpensiveObject;
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
public final class DaggerCoreAppComponent implements CoreAppComponent {
  private Provider<ExpensiveObject> providesExpensiveObjectProvider;

  private DaggerCoreAppComponent(AppModule appModuleParam) {

    initialize(appModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoreAppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam) {
    this.providesExpensiveObjectProvider = DoubleCheck.provider(AppModule_ProvidesExpensiveObjectFactory.create(appModuleParam));
  }

  @Override
  public ExpensiveObject expensiveObect() {
    return providesExpensiveObjectProvider.get();}

  public static final class Builder {
    private AppModule appModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public CoreAppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      return new DaggerCoreAppComponent(appModule);
    }
  }
}

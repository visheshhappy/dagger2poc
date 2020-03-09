package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.ExpensiveObject;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCoreAppComponent implements CoreAppComponent {
  private Provider<ExpensiveObject> providesExpensiveObjectProvider;

  private DaggerCoreAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoreAppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.providesExpensiveObjectProvider =
        DoubleCheck.provider(AppModule_ProvidesExpensiveObjectFactory.create(builder.appModule));
  }

  @Override
  public ExpensiveObject expensiveObect() {
    return providesExpensiveObjectProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public CoreAppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      return new DaggerCoreAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}

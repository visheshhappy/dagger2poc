package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.AnotherExpensiveBean;
import com.vishesh.daggercore.beans.ExpensiveObject;
import dagger.internal.Factory;
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
public final class AppModule_ProvidesAnotherExpensiveBeanFactory implements Factory<AnotherExpensiveBean> {
  private final AppModule module;

  private final Provider<ExpensiveObject> expensiveObjectProvider;

  public AppModule_ProvidesAnotherExpensiveBeanFactory(AppModule module,
      Provider<ExpensiveObject> expensiveObjectProvider) {
    this.module = module;
    this.expensiveObjectProvider = expensiveObjectProvider;
  }

  @Override
  public AnotherExpensiveBean get() {
    return providesAnotherExpensiveBean(module, expensiveObjectProvider.get());
  }

  public static AppModule_ProvidesAnotherExpensiveBeanFactory create(AppModule module,
      Provider<ExpensiveObject> expensiveObjectProvider) {
    return new AppModule_ProvidesAnotherExpensiveBeanFactory(module, expensiveObjectProvider);
  }

  public static AnotherExpensiveBean providesAnotherExpensiveBean(AppModule instance,
      ExpensiveObject expensiveObject) {
    return Preconditions.checkNotNull(instance.providesAnotherExpensiveBean(expensiveObject), "Cannot return null from a non-@Nullable @Provides method");
  }
}

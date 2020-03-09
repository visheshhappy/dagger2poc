package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.ExpensiveObject;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesExpensiveObjectFactory implements Factory<ExpensiveObject> {
  private final AppModule module;

  public AppModule_ProvidesExpensiveObjectFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ExpensiveObject get() {
    return provideInstance(module);
  }

  public static ExpensiveObject provideInstance(AppModule module) {
    return proxyProvidesExpensiveObject(module);
  }

  public static AppModule_ProvidesExpensiveObjectFactory create(AppModule module) {
    return new AppModule_ProvidesExpensiveObjectFactory(module);
  }

  public static ExpensiveObject proxyProvidesExpensiveObject(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.providesExpensiveObject(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

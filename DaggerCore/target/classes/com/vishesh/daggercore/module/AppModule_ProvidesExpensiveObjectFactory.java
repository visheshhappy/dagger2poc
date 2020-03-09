package com.vishesh.daggercore.module;

import com.vishesh.daggercore.beans.ExpensiveObject;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesExpensiveObjectFactory implements Factory<ExpensiveObject> {
  private final AppModule module;

  public AppModule_ProvidesExpensiveObjectFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ExpensiveObject get() {
    return providesExpensiveObject(module);
  }

  public static AppModule_ProvidesExpensiveObjectFactory create(AppModule module) {
    return new AppModule_ProvidesExpensiveObjectFactory(module);
  }

  public static ExpensiveObject providesExpensiveObject(AppModule instance) {
    return Preconditions.checkNotNull(instance.providesExpensiveObject(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

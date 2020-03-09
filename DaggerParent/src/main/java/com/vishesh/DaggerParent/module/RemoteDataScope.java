package com.vishesh.DaggerParent.module;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Since in dagger one component cannot depend on another component with same scope.
// hence we create a new scope and attach this scope to the ParentAppComponent
// in order for dependent component to work.
// This will also need the parent module to have this annotation in place of singleton scope.
// check parent module.
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface RemoteDataScope {
}
A simple multi module project to create a dagger application where there are two modules. 
One is DaggerCore
Second is DaggerParent

Dagger Core creates certain singleton object which are very heavy to create objects (assume)
DaggerParent has dependency on DaggerCore. The DaggerParent uses the heavy singleton beans created in dagger core to initialiizes some of its object which are again signleton.

This simple POC demostrates how to inject component dependencies of one module to another and what changes are needed in scope etc to make this happen.  

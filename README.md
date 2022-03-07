# testswitch
Test Java 17 switch with sealed classes and modules

Test if it works across modules (switch in one, sealed in the other). 
This doesn't work in bazel 4.2.1 due to a bug in ijar that doesn't keep the class attributes. 
Works in bazel 5.0.0.

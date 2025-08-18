package me.ejjung.method.package2;


//import me.ejjung.method.package1.DefaultClass;
import me.ejjung.method.package1.ProtectedMethodClass;
import me.ejjung.method.package1.PublicClass;

public class ClassTest extends ProtectedMethodClass{

    public ClassTest() {
        // Class Modifier
        // 1. Class
        // Only have public and default
        PublicClass publicClass; // O
        // DefaultClass defaultClass; // X

        // 2. Method
        // instance creation
        ProtectedMethodClass classC = new ProtectedMethodClass();

        classC.publicMethod(); // O (public so accessible)
        protectedMethod(); // O (accessible as if it's my own method inside subclass)
        // defaultMethod(); // X (cannot access protected with instance in another package)
    }



}

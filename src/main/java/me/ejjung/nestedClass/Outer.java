package me.ejjung.nestedClass;

public class Outer {
    class Inner {
        Inner() {}
        int field = 15;
        static int staticField = 10;
    }

    void method() {
        class LocalClass {
            static int localStaticField = 20;
        }

        // 1. Access the static variable of LocalClass directly and print its initial value.
        System.out.println("Initial value of LocalClass.localStaticField: " + LocalClass.localStaticField);

        // 2. Modify the value of the static variable.
        LocalClass.localStaticField = 99;

        // 3. Print the modified value to confirm the change.
        System.out.println("Modified value of LocalClass.localStaticField: " + LocalClass.localStaticField);

    }
}

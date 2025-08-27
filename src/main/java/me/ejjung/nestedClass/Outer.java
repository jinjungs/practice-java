package me.ejjung.nestedClass;

public class Outer {

    // same field, method name with inner class
    String stringField = "Outer field";

    void print() {
        System.out.println("Outer print!");
    }

    class Inner {
        Inner() {}
        int field = 15;
        static int staticField = 10;

        // same field, method name with outer class
        String stringField = "Inner field";

        void print() {
            System.out.println("Inner print!");
        }

        void testPrint() {
            System.out.println(this.stringField);
            this.print();
            System.out.println(Outer.this.stringField);
            Outer.this.print();
        }
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

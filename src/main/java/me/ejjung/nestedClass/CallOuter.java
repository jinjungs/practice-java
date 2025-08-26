package me.ejjung.nestedClass;

public class CallOuter {
    public static void main(String[] args) {
        Outer o1 = new Outer();

        // 1. Instantiate the Inner class
        Outer.Inner i1 = o1.new Inner();

        // 2. Access static field via instance reference (allowed, but not recommended)
        int instanceStaticField = i1.staticField;
        System.out.println(String.format("instanceStaticField: %d", instanceStaticField));

        // 3. Access static field via class type (the recommended way)
        int staticField =  Outer.Inner.staticField;
        System.out.println(String.format("staticField: %d", staticField));

        // 4. Access instance field
        int instanceField = i1.field;
        System.out.println(String.format("instanceField: %d", instanceField));

        // 5. Run the test for the Local class
        o1.method();
    }
}

package me.ejjung.anonymous;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous ano = new Anonymous();

        // 1. anonymous object field
        ano.field.wake();

        // 2. anonymous object local variable
        ano.method1();

        // 3. anonymous object parameter
        ano.method2(new Person() {
            void study() {
                System.out.println("Let's study!");
            }
            @Override
            void wake() {
                System.out.println("wake up late!!");
                study();
            }
        });

        // 4. use original as parameter
        ano.method2(new Person());

    }
}

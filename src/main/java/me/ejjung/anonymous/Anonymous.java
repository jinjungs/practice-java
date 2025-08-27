package me.ejjung.anonymous;

public class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("Go to work!");
        }

        @Override
        void wake() {
            System.out.println("Wake up at 6am");
            work();
        }
    };

    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("Go for a walk");
            }

            @Override
            void wake() {
                System.out.println("Wake up at 8am");
                walk();
            }
        };
        // cannot access the local field or method of anonymous child object, because it's Parent's type.
        // if it has name, you can use after casting into child type, but since it is anonymous, you cannot.
        // localVar.walk();
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}

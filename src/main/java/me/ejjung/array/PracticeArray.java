package me.ejjung.array;

public class PracticeArray {
    public static void main(String[] args) {
        /**
         * 1. Declare Array
         */

        /* 1.1. Using values */
        String[] arr1 = {"Amy", "Susan", "Mark"};

        // After declare, cannot create array with values
        String[] arr2;
        // arr2 = {"Amy", "Susan", "Mark"}; // compile error!

        /* 1.2. Using new */
        String[] arr3 = new String[3];

        // You can use create array later, unlike just using values in 1.1.
        String[] arr4;
        arr4 = new String[] {"Amy", "Susan", "Mark"};

        // Store new value in array after declare using index
        arr3[1] = "Hana";
    }
}

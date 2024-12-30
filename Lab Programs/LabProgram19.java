/*

Define a Bounded Generic class GenArray{T [] } with a parameterized
constructor and the following methods. Use the same in main method to
illustrate use of Generics with Integer, Float and Double class objects.
• A method to display all the elements.
• A method to find the maximum element.
• A method to sort all the elements.

*/

import java.lang.Number;

class GenArray<T extends Number> {
    T[] val;

    // Parameterized constructor to initialize the array
    GenArray(T[] temp) {
        val = temp;
    }

    // Method to display all the elements in the array
    void display() {
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
    }

    // Method to find the maximum element in the array
    double MaxEle() {
        double max = val[0].doubleValue();
        for (int i = 1; i < val.length; i++) {
            if (val[i].doubleValue() > max) {
                max = val[i].doubleValue();
            }
        }
        return max;
    }

    // Method to sort the elements in the array
    void sort() {
        for (int i = 0; i < val.length; i++) {
            int min = i;
            for (int j = i + 1; j < val.length; j++) {
                if (val[j].doubleValue() < val[min].doubleValue()) {
                    min = j;
                }
            }
            if (min != i) {
                T temp = val[min];
                val[min] = val[i];
                val[i] = temp;
            }
        }
    }
}

class LabProgram19 {
    public static void main(String args[]) {
        // Array of Integer values
        Integer iob[] = {15, 22, 1, 78, 6};
        GenArray<Integer> iar = new GenArray<Integer>(iob);

        // Display the array, maximum element and sorted array
        System.out.print("Array Elements: ");
        iar.display();
        System.out.println("Maximum element: " + iar.MaxEle());
        System.out.print("Sorted array elements: ");
        iar.sort();
        iar.display();
        System.out.println();

        // Array of Float values
        Float fob[] = {23.4f, 15.1f, 5.1f, 7.26f, 2.81f};
        GenArray<Float> far = new GenArray<Float>(fob);

        // Display the array, maximum element and sorted array
        System.out.print("\nArray Elements: ");
        far.display();
        System.out.println("Maximum element: " + far.MaxEle());
        System.out.print("Sorted array elements: ");
        far.sort();
        far.display();

        // Array of Double values
        Double dob[] = {18.4, 16.2, 51.7, 7.01, 12.81};
        GenArray<Double> dar = new GenArray<Double>(dob);

        // Display the array, maximum element and sorted array
        System.out.print("\nArray Elements: ");
        dar.display();
        System.out.println("Maximum element: " + dar.MaxEle());
        System.out.print("Sorted array elements: ");
        dar.sort();
        dar.display();
        System.out.println();
    }
}

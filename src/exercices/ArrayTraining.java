import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Character.toUpperCase;


public class ArrayTraining {

    /**
     * @param n size of the array, ie: 3
     * @return an empty int array of size n, ie: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        int[] table = new int[n];
        return table;
    }

    /**
     * @param n size of the array, ie: 2
     * @return an empty String array of size n, ie: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] table = new String[n];
        return table;
    }

    /**
     * @param a first value, ie: 3
     * @param b second value, ie: 2
     * @param c third value, ie: 1
     * @return an int array with a, b and c values, ie: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] table = new int[3];
        table[0] = a;
        table[1] = b;
        table[2] = c;
        return table;
    }

    /**
     * @param a first value, ie: "test"
     * @param b second value, ie: "sample"
     * @param c third value, ie: "value"
     * @return an int array with a, b and c values,
     * ie: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String[] table = new String[3];
        table[0] = a;
        table[1] = b;
        table[2] = c;
        return table;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return length of the array, ie: 1
     */
    public int length(int[] array) {
        int result = array.length;
        return result;
    }

    /**
     * @param array, ie: {3, 2, 1}
     * @return first value of the array, ie: 3
     */
    public int firstValue(int[] array) {
        int result = array[0];
        return result;
    }

    /**
     * @param array, ie: {3, 2, 1}
     * @return last value of the array, ie: 1
     */
    public int lastValue(int[] array) {
        int result = array[2];
        return result;
    }

    /**
     * @param array,    ie: {3, 2, 1}
     * @param position, ie: 1
     * @return value of the array at position, ie: 2
     */
    public int valueAtPosition(int[] array, int position) {
        int result = array[position];
        return result;
    }

    /**
     * @param array,    ie: {3, 8, 5}
     * @param value,    ie: 4
     * @param position, ie: 1
     * @return the array with the value replaced at position, ie: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return sum of values of the array, ie: 6
     */
    public int sum(int[] array) {
        int result = sum(array);
        return result;
    }

    /**
     * @param array,  ie: {1, 2, 3}
     * @param search, ie: 2
     * @return if array contains searched value, ie: true
     */
    public boolean contains(int[] array, int search) {
        int compteur = 0;
        for(int i = 0; i<array.length;i++) {
            compteur++;
        }
        if(array[compteur] == search){
            return true;
        }
        return false;
    }

    /**
     * @param array, ie: {"sample", "value"}
     * @return array where all words are capitalized, ie: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
        int compteur = 0;
        String[] table = array;
        for(int i = 0; i<array.length;i++) {
            compteur++;
        }
        table[compteur].replace(table[compteur].charAt(0),toUpperCase(array[compteur].charAt(0)));
        return table;
    }

    /**
     * @param first,  ie: {1, 2, 3}
     * @param second, ie: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, ie: false
     */
    public boolean equals(int[] first, int[] second) {
        for (int i = 0;i < first.length;i++){
            if(first[i] == second[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return array with reversed values, ie: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        int[] result = new int[3];
        int compteur = 0;
        for(int i = 2; i < array.length;i--){
            compteur++;
            result[compteur] += array[i];
        }
        return result;
    }

    /**
     * @param first,  ie: {1, 2, 3}
     * @param second, ie: {4, 5}
     * @return concatenates first and second values in one array,
     * ie: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        int a = first.length;
        int b = second.length;
        int[] result = new int[a + b];
        System.arraycopy(first, 0, result, 0, a);
        System.arraycopy(second, 0, result, a, b);
        return result;
    }
}

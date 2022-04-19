/**
 * You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
 * Array can contain numbers or strings. X can be either.
 * Return true if the array contains the value, false if not.
 *
 * https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
 */

public class arrayCheckValue {

    public static boolean check(Object[] a, Object x) {
       for (int i = 0; i < a.length; i++) {
         if (a[i].equals(x)) {
           return true;
         } 
       }
        return false;
    }

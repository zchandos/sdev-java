package exercises;

/*
 * Module 06: Programming Assignment
 * Chapter 19: Exercise 19.4
 * (GENERIC LINEAR SEARCH) Implement the following generic method for linear search:
 * @author Zachary Chandos
 */
public class exercise19point5 {
   
    public static void main(String[] args){
        
        Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++){
            list[i] = i;
        }
        System.out.println(max(list));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        
        E max = list[0];
        for (int i = 1; i < list.length; i++){
            E element = list[i];
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
}

    
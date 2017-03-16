
package javaapplication5;
/*
Hamed Azar, MON 9.55-12.20
Islamic Azad University South Tehran Branch 
*/
import java.util.Random;



public class EX1 {
    public static void main(String[] args) {
        int[] arr={12,5,6,9,8}; 
        reverseArray(arr, 0, 0, 5);
        System.out.println("--------------------");
        printArray(arr, 0, 5);
    }
    public static void printArray(int[]a,int i,int n){
        if(i==n-1){System.out.println(a[i]);return;}
        else{
            System.out.println(a[i]);i++;
            printArray(a, i, n);
           }
    }
    public static void reverseArray(int[]arr,int i,int temp,int n){
        if(i==(n-1)/2){ temp=arr[i];
                       arr[i]=arr[n-i-1];              
                       arr[n-i-1]=temp;return;}
        else{
                    temp=arr[i];
                    arr[i]=arr[n-i-1];              
                    arr[n-i-1]=temp;
                    i++;
                    reverseArray(arr, i, temp,n);
           }
    }
}


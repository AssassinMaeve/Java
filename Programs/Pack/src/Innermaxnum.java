package src;

import java.util.Scanner;
public class Innermaxnum{
    int arr[];
    int n;

    public Innermaxnum(int n){
        arr= new int[n];
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }

    public void display(){
        System.out.println("The values in the array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public void max(){
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max digit in the array is: "+max);
    }
    
}
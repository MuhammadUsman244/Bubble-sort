import java.util.Arrays;
import java.util.Scanner;
public class Bubble_sort {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int size;
        System.out.print("Enter the size:");
        size=input.nextInt();
        int[] arr=new int[size];
        take_input(arr,input);
        System.out.println("Your array before sorted:");
        display(arr);
        bubble_Sort(arr);
        System.out.println("Your array after sorted:");
        display(arr);
    }
    static void take_input(int[] arr,Scanner input){
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value at "+i+" index:");
            arr[i]=input.nextInt();
        }
    }
    static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_Sort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
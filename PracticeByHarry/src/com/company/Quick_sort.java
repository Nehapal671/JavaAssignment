package com.company;
import java.util.Scanner;
public class Quick_sort{
    public static  void quickSort(int [] arr, int low, int high)
    {
        if(low<high)
        {
            int pi= partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high)
    {
        int pivot=arr[low];
        int start=low;
        int end= high;
        while(start<end)
        {
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
//            if(arr[start]>pivot && arr[end]<pivot)
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=pivot;
        pivot=arr[end];
        arr[end]=temp;
        return end;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

import java.util.*;
public class MergeSort{
    public static void merge(int[] arr,int s,int e){
        int mid=s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int[] arr1=new int[len1];
        int[] arr2=new int[len2];
        // copy value
        int mainarrayindex=s;
        for(int i=0;i<len1;i++){
            arr1[i]=arr[mainarrayindex++];
        }
        mainarrayindex=mid+1;
        for(int i=0;i<len2;i++){
            arr2[i]=arr[mainarrayindex++];
        }
        // merge two sorted array
        int index1=0;
        int index2=0;
        mainarrayindex=s;
        while(index1<len1&&index2<len2){
            if(arr1[index1]<arr2[index2]) arr[mainarrayindex++]=arr1[index1++];
            else arr[mainarrayindex++]=arr2[index2++];
        }
        while(index1<len1){
            arr[mainarrayindex++]=arr1[index1++];
        }
        while(index2<len2){
            arr[mainarrayindex++]=arr2[index2++];
        }
    }
    public static void mergesort(int[] arr,int s,int e){
        if(s>=e){
            return ;
        }
        int mid=s+(e-s)/2;
        //left part ko sort karna hai
        mergesort(arr,s,mid);
        // right part ko sort karna hai
        mergesort(arr,mid+1,e);
        // merge
        merge(arr,s,e);
    }
    public static void main(String[] args){
        int[] arr={2,6,5,4,7,1};
        int n=arr.length;
        mergesort(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
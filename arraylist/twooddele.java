package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class twooddele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> uniqarr=new ArrayList<>();
        findodd(arr,uniqarr);
        // System.out.println(uniqarr);
        sc.close();
    }
    public static void findodd(ArrayList<Integer> arr,ArrayList<Integer>uniqarr){
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)!=arr.get(i+1)){
                uniqarr.add(arr.get(i));
            }
            // System.out.println(arr.get(arr.size()-2));
        }
        if(arr.get(arr.size()-2)!=arr.get(arr.size()-1)){
            uniqarr.add(arr.get(arr.size()-1));
        }
        for(int i=0;i<uniqarr.size()-1;i++){
           
            if(uniqarr.get(i)%2==0){
                uniqarr.remove(i);
                System.out.println(uniqarr);
            }
        }
        // for(int i=2;i<uniqarr.size()-1;i++){
        //     uniqarr.remove(i);
        // }
        // System.out.println(uniqarr);
    }
    
}

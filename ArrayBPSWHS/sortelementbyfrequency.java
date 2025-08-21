import java.util.*;
public class sortelementbyfrequency {
    public static int[] sortbyfrq(int[] arr){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:arr){
            l.add(i);
        }
        l.sort((a,b)->{
            int freqa=hm.get(a);
            int freqb=hm.get(b);
            if(freqa!=freqb) return freqb -freqa;// higher frequency first
            else return  a-b;// smaller number first if frequency equal
        });
        int result[]=new int[arr.length];
        for(int i=0;i<l.size();i++){
            result[i]=l.get(i);
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr={3,3,3,4,4,4,4,2,2,1,5,5,6};
        int[] freq=sortbyfrq(arr);
        for(int i:freq) System.out.print(i+" ");
    }
}

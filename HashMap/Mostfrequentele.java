import java.util.HashMap;

public class Mostfrequentele {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[] arr={1,2,3,1,2,3,4,5,6,7,8,9,1,1,2,3,4,5,6,1,1,1,1};
        for(int i:arr){
            if(!hm.containsKey(i)) hm.put(i,1);
            
            else hm.put(i,hm.get(i)+1);
        }
        int maxfreq=0;
        int answerval=-1;
        // for(var e:hm.entrySet()){
        //     if(e.getValue()>maxfreq){
        //         maxfreq=e.getValue();
        //         answerval=e.getKey();
        //     }
        // }

        for(var e:hm.keySet()){
            if(hm.get(e)>maxfreq){
                maxfreq=hm.get(e);
                answerval=e;
            }
        }
        System.out.println(answerval);
        System.out.println(maxfreq);
        System.out.println(hm);
    }
}

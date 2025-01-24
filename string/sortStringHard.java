import java.util.*;
public class sortStringHard {
    public static void main(String[] args) {
        List<String> list = List.of("ajay 8 12", "vaibhav 9 11", "anshik 5 10");
        List<String> resultList = new ArrayList<>();
        for (String entry : list) {
            String[] parts = entry.split(" "); 
            for (String part : parts) {
                resultList.add(part); 
            }
        }
        String[] resultArray = resultList.toArray(new String[0]);
        for (String s : resultArray) {
            System.out.print(s + " ");
        }    
    
    }
}

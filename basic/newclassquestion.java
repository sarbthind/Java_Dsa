import java.util.*;
public class newclassquestion {
    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
       
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void findArrangement(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        result.add(numbers.remove(numbers.size()-1));  // adds n
        while(!numbers.isEmpty()) {
            // Try each remaining number
            for(int i = 0; i < numbers.size(); i++) {
                int num = numbers.get(i);
                // Check if this number makes prime sum with last number in result
                if(!checkPrime(result.get(result.size()-1) + num)) {
                    result.add(num);
                    numbers.remove(i);
                    break;
                }
            }
        }
        
        // Print result
        System.out.println("Arrangement:");
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findArrangement(n);
        sc.close();
    }
}
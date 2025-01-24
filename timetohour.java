import java.util.Scanner;
public class timetohour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();
        scanner.close();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Format the output with leading zeros
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Converted time: " + formattedTime);
        
    }
}

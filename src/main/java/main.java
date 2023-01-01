import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = letterGrage.letterGrade(score);
            System.out.print("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.print("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

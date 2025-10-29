package chapter_3;
import java.util.Random;

public class RandomMonthGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int monthNumber = rand.nextInt(12) + 1;

        String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };

        System.out.println("Generated month number: " + monthNumber);
        System.out.println("Corresponding month name: " + months[monthNumber - 1]);
    }
}



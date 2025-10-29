package chapter_3;

public class Exercise3_4 {
    public static void main(String[] args) {
        int month = 1 + (int)(Math.random() * 12);

        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };

        System.out.println("The random month number is " + month + " which is " + monthName);
    }
}

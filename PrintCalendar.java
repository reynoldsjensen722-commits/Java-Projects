package chapter_13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {
    public static void main(String[] args) {
        int month, year;

        GregorianCalendar calendar = new GregorianCalendar();

        if (args.length == 2) {
            month = Integer.parseInt(args[0]) - 1;
            year = Integer.parseInt(args[1]);
        } else if (args.length == 1) {
            month = Integer.parseInt(args[0]) - 1;
            year = calendar.get(Calendar.YEAR);
        } else {
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);
        }

        calendar.set(year, month, 1);
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.println("       " + months[month] + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int numOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= numOfDays; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay - 1) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}










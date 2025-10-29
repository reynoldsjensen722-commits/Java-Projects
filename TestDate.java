package chapter_9;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long[] times = {
            10000L,
            100000L,
            1000000L,
            10000000L,
            100000000L,
            1000000000L,
            10000000000L,
            100000000000L
        };

        System.out.println("Elapsed Time\t\tDate");
        System.out.println("-------------------------------");

        for (long time : times) {
            Date date = new Date(time);
            System.out.println(time + "\t" + date.toString());
        }
    }
}


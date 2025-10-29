package chapter_11;

import java.util.Date;

public class MyDate {
    private Date dateCreated;

    public MyDate() {
        dateCreated = new Date();
    }

    @Override
    public String toString() {
        return dateCreated.toString();
    }
}


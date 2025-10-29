package chapter_11;

public class TestPeople {
    public static void main(String[] args) {
        Person p = new Person("John", "123 Main St", "555-1111", "john@email.com");
        Student s = new Student("Amy", "456 Oak St", "555-2222", "amy@email.com", Student.SENIOR);
        Employee e = new Employee("Bob", "789 Pine", "555-3333", "bob@email.com", "Office A", 65000);
        Faculty f = new Faculty("Dr. Smith", "101 Elm", "555-4444", "smith@email.com",
                                "Science Bldg", 85000, "MWF 2-4", "Professor");
        Staff st = new Staff("Karen", "202 Birch", "555-5555", "karen@email.com",
                             "Admin Office", 42000, "Secretary");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}


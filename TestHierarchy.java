package chapter_11;

public class TestHierarchy {
    public static void main(String[] args) {
        Person p = new Person("Alice", "123 Main St", "555-1234", "alice@example.com");
        Student s = new Student("Bob", "456 Oak Ave", "555-5678", "bob@example.com", Student.JUNIOR);
        Employee e = new Employee("Carol", "789 Elm St", "555-8765", "carol@example.com", "E201", 60000);
        Faculty f = new Faculty("Dan", "321 Birch Rd", "555-0001", "dan@example.com", "F301", 75000, "MWF 10-12", "Professor");
        Staff st = new Staff("Eve", "654 Pine Ln", "555-9999", "eve@example.com", "S101", 50000, "Administrator");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}

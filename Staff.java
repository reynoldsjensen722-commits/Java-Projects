
package chapter_11;
@SuppressWarnings("unused")


public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email,
                 String office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}

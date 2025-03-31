package Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Chad", 30, "Pharmacist");
        p.displayInfo();
        p.displayInfo("Pharmacist", 300000000);

        Employee e = new Employee("Andrew", 38, "Athlete", "Kickboxer");
        e.displayInfo();
    }
}

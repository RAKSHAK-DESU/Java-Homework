package Person;
public class Person {
    protected String name;
    protected int age;
    protected String occupation;
    protected int salary;


    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Occupation: " + occupation);
    }

    public void displayInfo(String occupation, int salary) {
        System.out.println(name + " is a " + occupation + " and his salary is: " + salary);
    }
}

class Employee extends Person {
    private String jobTitle;


    public Employee(String name, int age, String occupation, String jobTitle) {
        super(name, age, occupation);
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle);
    }
}




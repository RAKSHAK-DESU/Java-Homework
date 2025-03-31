// Parent class
package Person;
public class Person {
    protected String name;
    protected int age;
    protected String occupation;
    protected int salary;

    // Constructor with correct parameters
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Method Overloading: Creating two methods of the same name with different parameters
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Occupation: " + occupation);
    }

    public void displayInfo(String occupation, int salary) {
        System.out.println(name + " is a " + occupation + " and his salary is: " + salary);
    }
}

// Employee class inheriting from Person (placed outside)
class Employee extends Person {
    private String jobTitle;

    // Constructor now includes the required 'occupation' parameter
    public Employee(String name, int age, String occupation, String jobTitle) {
        super(name, age, occupation);  // Corrected super() call
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle);
    }
}




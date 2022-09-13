Consider the following class, Person.

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return lastName + ", " + firstName + " " + idNumber;
    }
}

public class Student extends Person {
    private String idNumber;
    private double unitsAttempted;
    private double qualityPoints;

    public Student(String firstName, String lastName, String idNumber) {
        super(firstName, lastName);
        this.idNumber = idNumber;

    }

    public void addClass(double average, String level) {
        this.qualityPoints += qualityPoints; 
    }

    public double currentGPA() {
        if (numClasses == 0) {
            return 0;
        }

        return qualityPoints / numClasses;
    }

    public String username() {
        String lastPart;
        String firstInitial;
        String fourDigits;

        firstInitial = getFirstName().substring(0, 1);
        
        if (getLastName.length() < 5) {
            lastPart = getLastName();
        }
        else {
            lastPart = getLastName().substring(0, 5);
        }

        return firstInitial + lastPart + fourDigits;
    }
}

Write a complete class Employee which extends Person. An Employee should have
additional attributes for an ID number which are set through the
Employee constructor. The salary instance variable should be changable through
a setSalary method and readable through a getSalary method. Finally, 

public class Employee extends Person {

    private String idNumber;
    private double salary;

    public Employee(String firstName, String lastName, String idNumber, double salary) {
        super(firstName, lastName);
        this.idNumber = idNumber;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    } 

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + " " + idNumber;
    }

}

// setTitle / getTitle
// can I extend Employee somehow?
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

package Task1;

import java.time.LocalDate;
public class Person {
    private String firstName;
    private LocalDate dateOfBirth;
    private String lastName;

    public Person(String firstName, LocalDate dateOfBirth, String lastName) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

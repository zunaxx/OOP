package Task1;

import java.time.LocalDate;


public class Company {
    private String companyName;
    private String founder;
    private LocalDate yearOfFoundation;
    private String country;
    private Group[] groups;
    private Person person;

    public Company(String companyName, String founder, LocalDate yearOfFoundation, String country, Group[] groups, Person person) {
        this.companyName = companyName;
        this.founder = founder;
        this.yearOfFoundation = yearOfFoundation;
        this.country = country;
        this.groups = groups;
        this.person = person;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public LocalDate getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(LocalDate yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", founder='" + founder + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", country='" + country + '\'' +
                ", person=" + person +
                '}';
    }
}

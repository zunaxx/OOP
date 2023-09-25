package Task1;

import java.time.LocalDate;

public class Group {
    private String groupName;
    private LocalDate startDate;
    private String mentor;
    private Person person;

    public Group(String groupName, LocalDate startDate, String mentor, Person person) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.person = person;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", startDate=" + startDate +
                ", mentor='" + mentor + '\'' +
                ", person=" + person +
                '}';
    }
}

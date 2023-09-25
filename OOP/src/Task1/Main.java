package Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nuriza",LocalDate.of(2006,2,8),"Zununova");

        Group[] groups = new Group[2];
        groups[0] = new Group("Java11",LocalDate.of(2023,6,1),"Ainazik", person1);
        groups[1] = new Group("Java12",LocalDate.of(2023,6,1),"Ainazik", person1);

        Company company1 = new Company("peaksoft","esen niyazov",LocalDate.of(2018,2,22),"Kyrgyzstan",groups, person1);

        System.out.println(person1);
        System.out.println(company1);
        System.out.println(groups[1]);
    }
}

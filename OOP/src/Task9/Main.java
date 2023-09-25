package Task9;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Person("Alice", 25, "Engineer", 60000, "123-456-7890");
        people[1] = new Person("Bob", 30, "Teacher", 45000, "987-654-3210");
        people[2] = new Person("Charlie", 35, "Doctor", 90000, "555-555-5555");
        people[3] = new Person("David", 28, "Programmer", 75000, "999-999-9999");
        people[4] = new Person("Eve", 22, "Student", 0, "111-222-3333");


        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Work: " + person.getWork());
            System.out.println("Salary: $" + person.getSalary());
            System.out.println("Phone: " + person.getPhone());
            System.out.println();
        }
        System.out.println("-----------------------------------");


        // Найти человека с самой высокой зарплатой
        Person highestSalaryPerson = people[0];
        for (Person person : people) {
            if (person.getSalary() > highestSalaryPerson.getSalary()) {
                highestSalaryPerson = person;
            }
        }

        System.out.println("Человек с самой высокой зарплатой:");
        System.out.println("Name: " + highestSalaryPerson.getName());
        System.out.println("Salary: $" + highestSalaryPerson.getSalary());

        // Найти человека с самой низкой зарплатой
        Person lowestSalaryPerson = people[0];
        for (Person person : people) {
            if (person.getSalary() < lowestSalaryPerson.getSalary()) {
                lowestSalaryPerson = person;
            }
        }
        System.out.println("-----------------------------------");

        System.out.println("Человек с самой низкой зарплатой:");
        System.out.println("Name: " + lowestSalaryPerson.getName());
        System.out.println("Salary: $" + lowestSalaryPerson.getSalary());

        Person mostExpensivePhonePerson = people[0];
        for (Person person : people) {
            if (person.getPhone().compareTo(mostExpensivePhonePerson.getPhone()) > 0) {
                mostExpensivePhonePerson = person;
            }
        }
        System.out.println("-----------------------------------");

        System.out.println("Человек с самым дорогим телефоном:");
        System.out.println("Name: " + mostExpensivePhonePerson.getName());
        System.out.println("Phone: " + mostExpensivePhonePerson.getPhone());
    }
}


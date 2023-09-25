package Task2;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 12345, "Факультет 1", "01.01.1990", "+123456789");
        Reader reader2 = new Reader("Иванов И. И.", 54321, "Факультет 2", "15.03.1985", "+987654321");

        reader1.takeBook(3); // Выведет "Петров В. В. взял 3 книги"
        reader2.returnBook(2); // Выведет "Иванов И. И. вернул 2 книги"
    }
}
package Task5;

import java.util.Scanner;

public class Seasons {
    public void findSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер месяца: ");
        int monthNumber = scanner.nextInt();

        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                System.out.println("Введено неверное значение для месяца.");
                return; // Завершаем выполнение метода, так как значение неверное
        }

        System.out.println("Сезон, к которому относится месяц: " + season);
    }

    public static void main(String[] args) {
        Seasons seasons = new Seasons();
        seasons.findSeason();
    }
}

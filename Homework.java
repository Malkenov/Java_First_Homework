import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        double rateUSD = 444.06;
        double rateEUR = 489.32;
        double rateJPY = 3.12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble(); // Считали число типа double

        System.out.println("Сколько дней до зарплаты?"); // Считали число типа int
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("Введите команду. Доступные команды: convert и advice.");
        String command = scanner.next(); // Считали команду

        if (command.equals("convert")) {
            String currency = "USD";
            System.out.println("Вы хотите конвертировать тенге в " + currency);

            if (currency.equals("USD")) {
                System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
            } else if (currency.equals("JPY")) {
                System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
            } else {
                System.out.println("Валюта не поддерживается.");
            }

        } else if (command.equals("advice")) {
            // Здесь нужно давать советы
            if (moneyBeforeSalary < 15_000) {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            } else if (moneyBeforeSalary < 50_000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Окей, пора в Макдак!");
                } else {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                }
            } else if (moneyBeforeSalary < 150_000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
                } else {
                    System.out.println("Окей, пора в Макдак!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("Класс! Заказывайте крабов!");
                } else {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
                }
            }
        } else {
            System.out.println("Извините, такой команды пока нет.");
        }
    }
}


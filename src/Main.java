import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        // Задание 2

        BmiService bmiService = new BmiService();

        int bmi = bmiService.calculate(1.87, 98);
        System.out.println(bmi);

        // Задание 3

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сумму займа: ");
        double credit = Double.parseDouble(scan.nextLine());
        System.out.println("сумма займа = " + credit);

        System.out.println("Введите процентную ставку: ");
        double percent = Double.parseDouble(scan.nextLine());
        System.out.println("процентная ставка = " + percent);

        System.out.println("Введите годовой период погашения: ");
        int period = Integer.parseInt(scan.nextLine());
        System.out.println("Период погашения = " + period);

        double payments = new CreditPaymentService().calculate(credit, percent, period);

        System.out.println("Ваш ежемесечный платёж состовляет = " + payments);

    }
}
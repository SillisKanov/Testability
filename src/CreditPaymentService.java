public class CreditPaymentService {
    double calculate(double credit, double percent, int period) {
        percent = percent / 100;
        double value = Math.pow(1 + percent, period * 12);
        return credit * (percent * value) / (value - 1);
    }
}

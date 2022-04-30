public class CreditPaymentService {
    public int calculate(int amount, int period, double percentYear) {
        period = period * 12;
        double percentMonth = percentYear / 12 / 100;
        double koef = percentMonth * Math.pow(1 + percentMonth, period) / (Math.pow(1 + percentMonth, period) - 1);
        int payment = (int) (koef * amount);
        return (payment);
    }
}

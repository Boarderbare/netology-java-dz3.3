import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percentYear = 9.99;
        int periodYear1 = 1;
        int periodYear2 = 2;
        int periodYear3 = 3;
        int payment = service.calculate(amount, periodYear1, percentYear);
        System.out.println("Процентная ставка " + percentYear + "%" + ".");
        System.out.println("Cумма кредита " + new DecimalFormat("###,###").format(amount) + "р.");
        System.out.println("Период " + periodYear1 + "год(а). " + "Ежемесячный платеж " + new DecimalFormat("###,###").format(payment) + "р.");
        payment = service.calculate(amount, periodYear2, percentYear);
        System.out.println("Период " + periodYear2 + "год(а). " + "Ежемесячный платеж " + new DecimalFormat("###,###").format(payment) + "р.");
        payment = service.calculate(amount, periodYear3, percentYear);
        System.out.println("Период " + periodYear3 + "год(а). " + "Ежемесячный платеж " + new DecimalFormat("###,###").format(payment) + "р.");
    }
}

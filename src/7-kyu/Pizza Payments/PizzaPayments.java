public class PizzaPayments {
  public static double michaelPays(double cost) {
    if (cost < 5) {
      return Math.round(cost * 100.0) / 100.0;
    }
    double kateContribution = Math.min(cost / 3, 10);
    double michaelPayment = cost - kateContribution;
    return Math.round(michaelPayment * 100.0) / 100.0;

  }
}
public class Main {
    public static void main(String[] args) {
        int Balance = 100; // начальная сумма счёта
        int Amount = 1100; // сумма пополнения

        int bonus = 0; // бонус

        if (Amount > 1000) {
            // расчёт бонуса
            //int amountAbove1000 = refillAmount - 1000;
            bonus = Amount / 100;
            if (Amount % 100 > 0) {
                bonus++;
            }
        }
        int finalBalance = Balance + Amount + bonus;
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");
    }
}

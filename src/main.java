public class main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {13000, 15000, 17000, 19000, 21000};
        int total = 0;
      for (int payment : payments) {
          total += payment;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");


        System.out.println("Задача 2");
        int[] weeklyExpenses = {15_000, 9_000, 20_000, 14_000, 26_000};
        int minExpense = weeklyExpenses [0];
        int maxExpense = weeklyExpenses [0];
        for (int expense : weeklyExpenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей");


        System.out.println("Задача 3");
        int[] weeklyExpenses1 = {15_000, 12_500, 18_100, 10_400, 22_000};
        int totalExpenses = 0;
        for (int expense1 : weeklyExpenses1) {
            totalExpenses += expense1;
        }
        double averageExpense = (double) totalExpenses / weeklyExpenses1.length;
        System.out.println("Средняя сумма трат за месяц составила " + totalExpenses + " рублей");


        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(reverseFullName);
    }
}

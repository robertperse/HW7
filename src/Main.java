public class Main {
    public static void main(String[] args) {
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + money;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 0;
        while (year < 10) {
            population = population + ((birthRate - deathRate) * population / 1000);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();

        money = 15000;
        total = 0;
        while (total < 12_000_000) {
            money = money + (money * 7 / 100);
            total = total + money;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        money = 15000;
        total = 0;
        i = 0;
        while (total < 12_000_000) {
            money = money + (money * 7 / 100);
            total = total + money;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println(total);
        System.out.println();

        money = 15000;
        total = 0;
        i = 0;
        while (i < 108) {
            for (int monthNumber = 0; monthNumber < 108; monthNumber = monthNumber + 6) {
                money = money + (money * 7 / 100);
                total = total + money;
                i++;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
            }
        }
        System.out.println();

        int dayNumber = 5;
        do {
            System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            dayNumber = dayNumber + 7;
        } while (dayNumber < 31);
        System.out.println();

        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;
        for (year = startYear; year <= endYear; year++) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
        }
    }
}
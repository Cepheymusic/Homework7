public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача1");
        int monthlyAccumulation = 15_000;
        int totalAccumulation = 0;
        int month = 0;
        int result = 2_459_000;
        while (totalAccumulation < result) {
            month = month + 1;
            totalAccumulation = totalAccumulation + monthlyAccumulation;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + totalAccumulation);
        }
    }
    public static void task2() {
        System.out.println("Задача2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача3");
        int totalPopulation = 12_000_000;
  //      int population = 0;
        int birthRate = 17;
        int mortality = 8;
        int numberOfPeople = 1000;
        int year;
 //       int parts = totalPopulation / numberOfPeople;
 //       int oneYearPopulation = (birthRate - mortality) * parts;
        for (year = 0; year <10; year++) {
            totalPopulation = totalPopulation + totalPopulation/numberOfPeople*birthRate-totalPopulation/numberOfPeople*mortality;
  //          population = oneYearPopulation + totalPopulation;
            System.out.println("Год " + (year + 1) + ", численность населения составляет " + totalPopulation);
        }
    }
    public static void task4() {
        System.out.println("Задача4");
        int contribution = 15_000;
        int result = 12_000_000;
        int totalContribution = 0;
        int percent = 7;
        int months = 0;
        int monthOfContribution = contribution / 100 * percent;
        while (totalContribution < result) {
            totalContribution = totalContribution + contribution + monthOfContribution;
            months = months + 1;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalContribution);
        }
    }
    public static void task5() {
        System.out.println("Задача5");
        int contribution = 15_000;
        int result = 12_000_000;
        int totalContribution = 0;
        int percent = 7;
        int months = 0;
        int monthOfContribution = contribution / 100 * percent;
        while (totalContribution < result) {
                totalContribution = totalContribution + contribution + monthOfContribution;
                months = months + 1;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + totalContribution);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача6");
        int contribution = 15_000;
        int totalContribution = 0;
        int percentOneMonth = 7;
        int year = 9;
        int monthsPerYear = 12;
        int totalMonths = year * monthsPerYear;
        for (int month = 1; month < totalMonths; month++) {
            totalContribution = totalContribution + contribution + (contribution / 100 * percentOneMonth);
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalContribution);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача7");
        int numberOfDays = 31;
        int friday = 5;
        for (; friday < numberOfDays; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
        }
    }
    public static void task8() {
        System.out.println("Задача8");
        int currentYear = 2023;
        for (int year = 0; year <= currentYear + 100; year += 79) {
            if (year >= currentYear - 200) {
                System.out.println(year);
            }

        }
    }
}
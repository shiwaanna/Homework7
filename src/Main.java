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
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(" " + start);
            start = start + 1;
        }
        System.out.println(" ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int fertility = 17 * 1_000;
        int mortality = 8 * 1_000;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            populationY = populationY + fertility - mortality;
            System.out.println("Год " + year + " численность населения состовляет " + populationY + " человек");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double contribution = 15_000;
        double percent = 0.07;
        double total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i = i + 1;
            total = total + contribution * percent;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double contribution = 15_000;
        double percent = 0.07;
        double total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i = i + 1;
            total = total + contribution * percent;
            total = total + contribution;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double contribution = 15_000;
        double percent = 0.07;
        double total = 0;
        for (int i = 1; i <= 9 * 12; i++) {
            total = total + contribution * percent;
            total = total + contribution;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет».");

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int year = 0; year < 2123; year = year + 79) {
            if (year > 1823) {
                System.out.println(year);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int savings = 15000;
        float total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + savings;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int counting = 0;
        while (counting < 10) {
            counting = counting + 1;
            System.out.print(counting + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 0;
        System.out.println();
        while (years < 10) {
            population = (population + birthRate * (population/1000) - mortalityRate * (population/1000));
            years = years + 1;
            System.out.println("Год " + years + " численность населения составляяет " + population);
        }

        savings = 15000;
        i = 0;
        while (savings < 12_000_000) {
            savings = savings + (savings / 100) * 7;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        savings = 15000;
        i = 0;
        while (savings < 12_000_000) {
            savings = savings + (savings / 100) * 7;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            }

        }
        savings = 15000;
        i = 0;
        while (i < 12 * 9) {
            savings = savings + (savings / 100) * 7;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            }
        }

        int friday = 0;
        i = 0;
        while (i < 31) {
            i = i + 1;
            if (i % 7 == 0) {
                System.out.println("Сегодня пятница " + (i + friday) + " число. Необходимо подготовить отчет");
            }
        }
        int year = 0;
        i = 79;
        while (year < 2022 + 100) {
            year = year + i;
            if (year >= 2022-200 && year <= 2022+100) {
                System.out.println(year);
            }
        }

        for (i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }
    }
}
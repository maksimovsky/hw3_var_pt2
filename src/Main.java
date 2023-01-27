public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte num1 = 101;
        System.out.println("Значение переменной num1 с типом byte равно " + num1);
        short num2 = 30495;
        System.out.println("Значение переменной num2 с типом short равно " + num2);
        int num3 = -984387234;
        System.out.println("Значение переменной num3 с типом int равно " + num3);
        long num4 = -3728453423487746438L;
        System.out.println("Значение переменной num4 с типом long равно " + num4);
        float num5 = 34563.164F;
        System.out.println("Значение переменной num5 с типом float равно " + num5);
        double num6 = -3456623.164387587;
        System.out.println("Значение переменной num6 с типом double равно " + num6);
    }

    public static void task2() {
        float num1 = 27.12F;
        long num2 = 987678965549L;
        float num3 = 2.786F;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        short sheets = 480;
        int sheetsPerPupil = sheets / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        int bottles = 16;
        int time0 = 2;
        int bottlesPerMinute = bottles / time0;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInMonth = 31;
        int time1InMinutes = 20;
        System.out.println("За 20 минут машина произвела " + bottlesPerMinute * time1InMinutes + " бутылок");
        int time2InMinutes = hoursInDay * minutesInHour;
        System.out.println("За сутки машина произвела " + bottlesPerMinute * time2InMinutes + " бутылок");
        int time3InMinutes = 3 * hoursInDay * minutesInHour;
        System.out.println("За 3 дня машина произвела " + bottlesPerMinute * time3InMinutes + " бутылок");
        int time4InMinutes = daysInMonth * hoursInDay * minutesInHour;
        System.out.println("За месяц машина произвела " + bottlesPerMinute * time4InMinutes + " бутылок");
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        int cansOfWhitePaintPerClass = 2;
        int cansOfBrownPaintPerClass = 4;
        int cansForAllClasses = 120;
        int cansPerClass = cansOfWhitePaintPerClass + cansOfBrownPaintPerClass;
        int countClasses = cansForAllClasses / cansPerClass;
        int countCansOfWhitePaint = countClasses * cansOfWhitePaintPerClass;
        int countCansOfBrownPaint = countClasses * cansOfBrownPaintPerClass;
        System.out.println("В школе, где " + countClasses + " классов, нужно " + countCansOfWhitePaint +
                " банок белой краски и " + countCansOfBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        int weightBananaInGrams = 80;
        int weightMilkInGrams = 105;
        int weightIceCreamInGrams = 100;
        int weightEggInGrams = 70;
        int countBananas = 5;
        int countMilk = 2;
        int countIceCream = 2;
        int countEggs = 4;
        int weightInGrams = weightBananaInGrams * countBananas + weightMilkInGrams * countMilk +
                weightIceCreamInGrams * countIceCream + weightEggInGrams * countEggs;
        double weightInKilograms = weightInGrams * 0.001;
        System.out.println("Вес спортзавтрака " + weightInGrams + " граммов");
        System.out.println("Вес спортзавтрака " + weightInKilograms + " килограмма");
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int weightToLoseInGrams = 7000;
        int weightPerDayVariant1 = 250;
        int weightPerDayVariant2 = 500;
        int daysVariant1 = weightToLoseInGrams / weightPerDayVariant1;
        int daysVariant2 = weightToLoseInGrams / weightPerDayVariant2;
        int avgDays = (daysVariant1 + daysVariant2) / 2;
        System.out.println("Если спортсмен будет терять каждый день по " + weightPerDayVariant1
                + " граммов, на похудение уйдет " + daysVariant1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + weightPerDayVariant2
                + " граммов, на похудение уйдет " + daysVariant2 + " дней");
        System.out.println("В среднем спортсмену на похудение понадобится " + avgDays
                + " день");
    }

    public static void task8() {
        System.out.println("\nЗадача 8");

        int MashaSalary = 67760;
        int MashaNewSalary = MashaSalary + MashaSalary / 10;
        int MashaDiff = 12 * (MashaNewSalary - MashaSalary);
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей. Годовой доход вырос на "
                + MashaDiff + " рублей");

        int DenisSalary = 83690;
        int DenisNewSalary = DenisSalary + DenisSalary / 10;
        int DenisDiff = 12 * (DenisNewSalary - DenisSalary);
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей. Годовой доход вырос на "
                + DenisDiff + " рублей");

        int KristinaSalary = 76230;
        int KristinaNewSalary = KristinaSalary + KristinaSalary / 10;
        int KristinaDiff = 12 * (KristinaNewSalary - KristinaSalary);
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей. Годовой доход вырос на "
                + KristinaDiff + " рублей");
    }
}
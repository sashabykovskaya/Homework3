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
        int a = 2000000000;
        System.out.println(a);
        byte b = 120;
        System.out.println(b);
        short c = 25000;
        System.out.println(c);
        long d = 3000000000L;
        System.out.println(d);
        float e = 2.1256123f;
        System.out.println(e);
        double f = 1.123456789123456;
        System.out.println(f);
    }
    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965594L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        short paper = 480;
        byte totalStudents = (byte) (ludmilaStudents + annaStudents + ekaterinaStudents);
        byte sheetsPerPerson = (byte) (paper/totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPerson + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottleInMinute = 8;
        byte twentyMinute = 20;
        short bottle20 = (short) (bottleInMinute * 20);
        System.out.println("За " + twentyMinute + " минут машина произвела " + bottle20 + " штук бутылок");
        short bottleInHour = 8*60;
        short bottleInDay = (short) (bottleInHour * 24);
        byte day = 24;
        System.out.println("За " + day + " часа машина произвела " + bottleInDay + " штук бутылок");
        byte day3 = 3;
        int bottleInDay3 = (int) (bottleInDay * day3);
        System.out.println("За " + day3 + " дня машина произвела " + bottleInDay3 + " штук бутылок");
        byte month = 30;
        int bottleInMonth = bottleInDay * month;
        System.out.println("За " + month + " дней машина произвела " + bottleInMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte white = 2;
        byte brown = 4;
        byte oneClass = (byte) (white + brown);
        byte totalCass = (byte) (totalPaint/oneClass);
        byte totalWhite = (byte) (totalCass * white);
        byte totalBrown = (byte) (totalCass * brown);
        System.out.println("В школе, где " + totalCass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananasWeight = 80*5;
        short milksWeight = 105*2;
        short creamsWeight = 100*2;
        short eggsWeight = 70*4;
        short totalWeight = (short) (bananasWeight + milksWeight + creamsWeight + eggsWeight);
        System.out.println("Вес завтрака " + totalWeight + " грамм");
        float kilogram = totalWeight/1000f;
        System.out.println("Вес завтрака " + kilogram + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        short gram = 7 * 1000;
        byte weightLoss1 = (byte) (gram / 250);
        byte weightLoss2 = (byte) (gram / 500);
        System.out.println("Если терять по 250 грамм, то вес уйдет за " + weightLoss1 + " дней");
        System.out.println("Если терять по 500 грамм, то вес уйдет за " + weightLoss2 + " дней");
        byte daysOnAverage = (byte) ((weightLoss1+weightLoss2)/2);
        System.out.println("В среднем потеря веса займет " + daysOnAverage + " день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int incomeMasha = (int) 67760;
        int incomeDen = (int) 83690;
        int incomeKris = (int) 76230;
        int annualIncomeMasha = incomeMasha * 12;
        System.out.println(annualIncomeMasha);
        int annualIncomeDen = incomeDen * 12;
        int annualIncomeKris = incomeKris * 12;
        short increasedIncomeMasha = (short) ((incomeMasha * 10) / 100);
        System.out.println(increasedIncomeMasha);
        short increasedIncomeDen = (short) ((incomeDen * 10) / 100);
        short increasedIncomeKris = (short) ((incomeKris * 10) / 100);
        int annualSurplusIncomeMasha = (incomeMasha + increasedIncomeMasha) * 12;
        System.out.println(annualSurplusIncomeMasha);
        int annualSurplusIncomeDen = (incomeDen + increasedIncomeDen) * 12;
        int annualSurplusIncomeKris = (incomeKris + increasedIncomeKris) * 12;
        int differenceMasha = (int) (annualSurplusIncomeMasha-annualIncomeMasha);
        System.out.println(differenceMasha);
        int differenceDen = (int) (annualSurplusIncomeDen - annualIncomeDen);
        int differenceKris = (int) (annualSurplusIncomeKris - annualIncomeKris);
        System.out.println("Маша теперь получает " + (incomeMasha + increasedIncomeMasha) + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + (incomeDen + increasedIncomeDen) + " рублей. Годовой доход вырос на " + differenceDen + " рублей");
        System.out.println("Кристина теперь получает " + (incomeKris + increasedIncomeKris) + " рублей. Годовой доход вырос на " + differenceKris + " рублей");
    }
    }

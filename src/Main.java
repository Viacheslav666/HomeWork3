public class Main {
    public static void main(String[] args) {
        task7();
    }

    public static void task() {
        byte a = 66;
        System.out.println(a);
        short s = 10000;
        System.out.println(s);
        int d = 666666;
        System.out.println(d);
        long w = 1234567891234567899l;
        System.out.println(w);
        float e = 0.6f;
        System.out.println(e);
        double r = 2.923132;
        System.out.println(r);

    }
    public static void task1() {
    double q = 27.12;
    System.out.println(q);
    long w = 987678965549l;
    System.out.println(w);
    float a = 2.786f;
    System.out.println(a);
    short s = 569;
    System.out.println(s);
    short d = -159;
    System.out.println(d);
    int z = 27897;
    System.out.println(z);
    byte c = 67;
    System.out.println(c);
    }
    public static void task2(){

        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        int allStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        short allPaper = 480;
        System.out.println("На каждого ученика расчитанно " + allPaper / allStudents + " листов бумаги");
    }
    public static void task3(){
        byte bootle1Min = 8;
        byte time20 = 20;
        int min20 = bootle1Min * time20;
        System.out.println("За " +time20 + " минут машина произвела " + min20 + " штук бутылок");
        short day = 60 * 24;
        int bootleDay = day * bootle1Min;
        System.out.println("За " + day + " минут машина произвела " + bootleDay + " штук бутылок");
        int threeDay = 60 * 72;
        int bootleThreeDay = threeDay * bootle1Min;
        System.out.println("За " + threeDay + " минут машина произвела " + bootleThreeDay + " штук бутылок");
        int month = 60 * 720;
        long bootleMonth = month * bootle1Min;
        System.out.println("За " + month + " минут машина произвела " + bootleMonth + " штук бутылок");

    }
    public static void task4(){
        byte canOfPaint = 120;
        byte bankBrownOneClass = 4;
        byte bankWhiteOneClass = 2;
        int canOfPaintOneClass = bankBrownOneClass + bankWhiteOneClass;
        int classAll = canOfPaint / canOfPaintOneClass;
        int bankWhiteAllClass = classAll * bankWhiteOneClass;
        int bankBrownAllClacc = classAll * bankBrownOneClass;
        System.out.println("В школе, где " + classAll + " классов, нужно " + bankWhiteAllClass + " банок белой краски и " + bankBrownAllClacc + " банок коричневой краски");





    }
    public static void task5(){
        byte bananaWeightG = 80;
        byte milkWeight100Ml = 105;
        byte iceCreamWeightG = 100;
        byte eggsWeightG = 70;
        int banana5 = 5 * bananaWeightG;
        int iceCream2 = 2 * iceCreamWeightG;
        int milk2 = 2 * milkWeight100Ml;
        int eggs4 = 4 * eggsWeightG;
        double blender = (banana5 + iceCream2 + milk2 + eggs4)/1000;
        System.out.println("Коктель имеет вес = " + blender + " кг");


    }
    public static void task6(){
        short weightLossGr = 7000;
        short weightlossDayGr = 250;
        short weightLossDay2Gr = 500;
        int oneDay = weightLossGr/weightlossDayGr;
        int twoDay = weightLossGr/weightLossDay2Gr;
        int averageNumberOfDays = (weightlossDayGr + weightLossDay2Gr)/2;
        int x = weightLossGr/averageNumberOfDays;
        System.out.println(weightLossGr/weightlossDayGr + " дней потребуется если каждый день сбрасывать по 250 грамм");
        System.out.println(weightLossGr/weightLossDay2Gr + " дней потребуется если каждый день сбрасывать по 500 грамм");
        System.out.println("Для того, что бы сбросить 7 кг в среднем потребутся " + x );




    }
    public static void task7(){
        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        double enlargedIncomeMasha = incomeMasha * 1.1;
        double enlargedIncomeDenis = incomeDenis * 1.1;
        double enlargetIncomeKristina = incomeKristina * 1.1;
        double incomeMashaYear = (enlargedIncomeMasha * 12) - (incomeMasha * 12);
        double incomeDenisYear = (enlargedIncomeDenis - incomeDenis) * 12;
        double incomeKristinaYear = (enlargetIncomeKristina - incomeKristina) * 12;
        System.out.println("Маша теперь получает " + enlargedIncomeMasha + " рублей. Годовой доход вырос на " + incomeMashaYear);
        System.out.println("Денис теперь получает " + enlargedIncomeDenis + " рублей. Годовой доход вырос на " + incomeDenisYear);
        System.out.println("Кристина теперь получает " + enlargetIncomeKristina + " рублей. Годовой доход вырос на " + incomeKristinaYear);
    }
}





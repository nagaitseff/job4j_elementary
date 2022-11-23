package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;

        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        float expectedDollar = 2.3333333F;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2.3333333. Test result : " + passedDollar);
    }
}

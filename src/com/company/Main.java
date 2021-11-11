package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println(ageAndTemperature(generateRandomAge(), -11));
//        System.out.println(ageAndTemperature(generateRandomAge(), 5));
//        System.out.println(ageAndTemperature(generateRandomAge(), -30));
//        System.out.println(ageAndTemperature(generateRandomAge(), -20));
//        System.out.println(ageAndTemperature(generateRandomAge(), 10));

//        System.out.println(ageAndTemperature(21,25));
//        System.out.println(ageAndTemperature(30,50));
    }

    public static String ageAndTemperature(int humanAge, int temperature) {
        if (humanAge > 20 && humanAge < 45 && temperature > 20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (humanAge <= 20 && temperature >= 0 && temperature <= 27) {
            return "Можно идти гулять2";
        } else if (humanAge > 45 && temperature >= 25 && temperature <= 25) {
            return "Можно идти гулять3";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        int maxAge = 100;
        Random random = new Random();
        return random.nextInt(maxAge);
    }
}

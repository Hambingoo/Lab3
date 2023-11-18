package raw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apartment[] dom = new Apartment[2];
        dom[0]=new Apartment();
        dom[0].create();
        dom[0].printInfo();
        dom[1]=new Apartment();
        dom[1].printInfo();

        System.out.println("Площадь первого дома в метрах: "+dom[0].getSquare());
        float convertedSquare = Converter.convert(dom[0].getSquare());
        System.out.println("Площадь первого дома в сантиметрах: "+convertedSquare);

        System.out.println("Количество квартир: "+ Apartment.printApartmentCounter());
    }
}

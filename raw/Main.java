package raw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Apartment flat=new Apartment();
        Apartment house=new Apartment();
        flat.create();
        flat.printInfo();

        System.out.println("Количество квартир: "+ Apartment.printApartmentCounter());

        //Apartment[] dom = new Apartment[2];
        //dom[0]=new Apartment();
        //dom[0].create();
        //dom[0].printInfo();
        //dom[1]=new Apartment();
        //dom[1].printInfo();
    }
}

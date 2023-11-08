package raw;

import java.util.Scanner;

public class Apartment {
    private String status;
    private float square;
    private String street;
    private int numOfRooms, floor, housenum;
    private Kitchen kitchen;
    private Hall hall;
    private Bathroom bathroom;
    private SleepingRooms sleepingRooms;

    public Apartment() {
        kitchen = new Kitchen();
        hall = new Hall();
        bathroom = new Bathroom();
        sleepingRooms = new SleepingRooms();
        status = "Неизвестно";
        square = 0;
        street = "Не указано";
        numOfRooms = 0;
        floor = 0;
        housenum = 0;
    }

    public Apartment(Kitchen kitchen, Hall hall, Bathroom bathroom, SleepingRooms sleepingRooms,
                     String status, float square, String street, int numOfRooms, int floor, int housenum) {
        this.kitchen = kitchen;
        this.hall = hall;
        this.bathroom = bathroom;
        this.sleepingRooms = sleepingRooms;
        this.status = status;
        this.square = square;
        this.street = street;
        this.numOfRooms = numOfRooms;
        this.floor = floor;
        this.housenum = housenum;
    }

    public void create() {
        String status;
        int housenum, floor,numOfRooms,status1;
        float square;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите улицу: ");
        this.street = scanner.nextLine();
        System.out.print("Введите номер дома: ");
        housenum = scanner.nextInt();
        if (housenum < 1) {
            throw new IllegalArgumentException("Вы ввели неправильный номер дома!");
        }
        this.housenum=housenum;
        System.out.print("Введите номер этажа: ");
        floor = scanner.nextInt();
        if (floor < 1) {
            throw new IllegalArgumentException("Вы ввели неправильный номер этажа!");
        }
        this.floor=floor;
        System.out.print("Введите площадь: ");
        square = scanner.nextFloat();
        if (square < 1) {
            throw new IllegalArgumentException("Вы ввели неправильную площадь!");
        }
        this.square=square;
        System.out.print("Введите кол-во комнат: ");
        numOfRooms = scanner.nextInt();
        if (numOfRooms < 1) {
            throw new IllegalArgumentException("Вы ввели неправильное количество комнат!");
        }
        this.numOfRooms=numOfRooms;
        System.out.print("Введите статус (1 - Строится, 2 - Готова): ");
        int statusInput = scanner.nextInt();
        switch (statusInput) {
            case 1:
                this.status = "Строится";
                break;
            case 2:
                this.status = "Готова";
                break;
            default:
                throw new IllegalArgumentException("Вы ввели неправильный статус!");
        }

        System.out.println("\n\t\tВвод параметров кухни");
        kitchen.create();
        System.out.println("\n\t\tВвод параметров зала");
        hall.create();
        System.out.println("\n\t\tВвод параметров душа");
        bathroom.create();
        System.out.println("\n\t\tВвод параметров спальных комнат");
        sleepingRooms.create();
    }

    public void printInfo() {
        System.out.println("\tИнформация о квартире");
        System.out.println("Статус: " + status);
        System.out.println("Улица " + street + ", дом " + housenum + ", этаж " + floor);
        System.out.println("Площадь: " + square);
        System.out.println("Кол-во комнат: " + numOfRooms);

        System.out.println("\t\tЗал");
        System.out.println("Материал пола: " + hall.getFloor());
        System.out.println("Потолок: " + hall.getCeil());
        System.out.println("Кол-во спальных мест: " + hall.getNumOfPlaceForSleep());

        System.out.println("\t\tКухня");
        System.out.println("Материал пола: " + kitchen.getFloor());
        System.out.println("Потолок: " + kitchen.getCeil());

        System.out.println("\t\tВанная комната");
        System.out.println("Материал пола: " + bathroom.getFloor());
        System.out.println("Потолок: " + bathroom.getCeil());
        System.out.println("Обделка стен: " + bathroom.getWallType());
        System.out.println("Приспособление для мытья: " + bathroom.getWashType());

        System.out.println("\t\tСпальные комнаты");
        System.out.println("Материал пола: " + sleepingRooms.getFloor());
        System.out.println("Потолок: " + sleepingRooms.getCeil());
        System.out.println("Кол-во спальных мест: " + sleepingRooms.getNumOfPlaceForSleep());
    }
}
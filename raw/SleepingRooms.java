package raw;

import java.util.Scanner;

public class SleepingRooms {
    private String floor;
    private String ceil;
    private int numOfPlaceForSleep;

    public SleepingRooms() {
        floor = "Не указан";
        ceil = "Не указан";
        numOfPlaceForSleep = 0;
    }

    public SleepingRooms(String floor, String ceil, int numOfPlaceForSleep) {
        this.floor = floor;
        this.ceil = ceil;
        this.numOfPlaceForSleep = numOfPlaceForSleep;
    }

    public String getFloor() {
        return floor;
    }

    public String getCeil() {
        return ceil;
    }

    public int getNumOfPlaceForSleep() {
        return numOfPlaceForSleep;
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите материал пола: ");
        this.floor = scanner.nextLine();
        System.out.print("Введите материал потолка: ");
        this.ceil = scanner.nextLine();
        System.out.print("Введите кол-во спальных мест: ");
        this.numOfPlaceForSleep = scanner.nextInt();
    }
}
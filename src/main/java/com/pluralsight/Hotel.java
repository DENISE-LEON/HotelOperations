package com.pluralsight;

import java.util.Scanner;


public class Hotel {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //room objects
        Room room1 = new Room(111, "King", true, false, 3, "Tropical");
        Room room2 = new Room(222, "Double", false, false, 2, "Disney");
        Room room3 = new Room(333, "Double", false, true, 4, "Wedding");
        Room room4 = new Room(444, "King", true, true, 5, "Luxury");
        Room room5 = new Room(555, "Double", false, false, 4, "Rustic");
        Room room6 = new Room(666, "King", false, true, 3, "Beachfront");
        Room room7 = new Room(777, "Single", false, false, 1, "Minimalist");
        Room room8 = new Room(888, "Double", true, false, 5, "Vintage");
        Room room9 = new Room(999, "King", false, true, 2, "Bohemian");
        Room room10 = new Room(1010, "Double", false, false, 4, "Urban Loft");


    }

}

package com.pluralsight;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isClean;
    private boolean isOccupied;
    private int numOfBeds;
    private String theme;


    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isClean() {
        return isClean;
    }


    public int getNumOfBeds() {
        return numOfBeds;
    }

    //this getter returns a boolean, if not occupied and room is clean: true, if no: false
    public boolean isAvailable() {
        return !isOccupied && isClean;
    }

    //this getter returns the price of the room per night based on the type of room
    public double getPricePerNight() {
        double price = 0.0;
        switch (roomType) {
            case "King":
                price = 139.00;
                break;
            case "Double":
                price = 124.00;
                break;
        }
        return price;
    }

    public String getTheme() {
        return theme;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }


    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }


    public Room(int roomNumber, String roomType, boolean isClean, boolean isOccupied, int numOfBeds, String theme) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isClean = isClean;
        this.isOccupied = isOccupied;
        this.numOfBeds = numOfBeds;
        this.theme = theme;
    }


}

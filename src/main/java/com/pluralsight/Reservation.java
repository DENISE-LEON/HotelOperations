package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
private String guestName;
private int creditCardNumber;
private String paymentMethod;
private int numberofDays;
private Room room;
private LocalDate checkinDate;

    public String getGuestName() {
        return guestName;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getNumberofDays() {
        return numberofDays;
    }

    public LocalDate getCheckinDate() {
        return checkinDate;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isWeekend() {
        //set the local date in the check in/check out class
    return checkinDate.datesUntil(checkinDate.plusDays(numberofDays))
            .anyMatch(date -> date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY);
    }
    //this getter returns the total price
    public double getReservationTotal() {
            double totalPrice = 0.0;
        if (isWeekend()) {
            totalPrice = room.getPricePerNight() * 1.10;
        } else {
            totalPrice = room.getPricePerNight() * 1.10;
        }
    return totalPrice;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setNumberofNights(int numberofNights) {
        this.numberofDays = numberofDays;
    }

    public void setNumberofDays(int numberofDays) {
        this.numberofDays = numberofDays;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setCheckinDate(LocalDate checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Reservation(String guestName, int creditCardNumber, String paymentMethod) {
        this.guestName = guestName;
        this.creditCardNumber = creditCardNumber;
        this.paymentMethod = paymentMethod;
        this.numberofDays = numberofDays;


    }

    //methods
    //method that determines if guest stayed over the weekend based on the LocalDate get day of the week for check in/out date

//method that determines the total price based on num of days and if staying over weekend

}

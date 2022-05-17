package hust.soict.hedspi.aims.utils;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
    public int day;
    public int month;
    public int year;

    // cau a
    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

    // No parameter
    public MyDate() {
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    // 3 parameters of day, month, year
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // 1 String parameter
    public MyDate(String stringDate) {
        String[] stringSplit = stringDate.trim().split("\\s+");
        this.month = Integer.parseInt(stringSplit[0]);
        this.day = Integer.parseInt(stringSplit[1]);
        this.year = Integer.parseInt(stringSplit[2]);
    }

    public MyDate(String day, String month, String year) {
        this.day = Integer.parseInt(day);
        this.month = Integer.parseInt(month);
        this.year = Integer.parseInt(year);
    }

    // cau b
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // cau c
    static void accept() {
        System.out.println("enter a date (String) from keyboard:");
        MyDate myDate = new MyDate();
        Scanner myObj = new Scanner(System.in);
        String stringDate = myObj.nextLine();
        String[] stringSplit = stringDate.trim().split("\\s+");
        myDate.setDay(Integer.parseInt(stringSplit[1]));
        myDate.setMonth(Integer.parseInt(stringSplit[0]));
        myDate.setYear(Integer.parseInt(stringSplit[2]));
        // System.out.println(myDate.getDay());
        // System.out.println(myDate.getMonth());
        // System.out.println(myDate.getYear());
    }

    // cau d
    static void print() {
        LocalDate myDateObj = LocalDate.now();
        System.out.println("Current date: " + myDateObj);
    }

    static void formatDate(){
        LocalDate myDateObj = LocalDate.now();

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("d/M/yyyy");
        String formattedDate1 = myDateObj.format(myFormatObj1);
        System.out.println("After formatting: " + formattedDate1);

        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate2 = myDateObj.format(myFormatObj2);
        System.out.println("After formatting: " + formattedDate2);

        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("MMM d yyyy");
        String formattedDate3 = myDateObj.format(myFormatObj3);
        System.out.println("After formatting: " + formattedDate3);
    }
}

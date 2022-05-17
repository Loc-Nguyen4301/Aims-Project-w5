package hust.soict.hedspi.aims.utils;

import java.text.*;
import java.time.LocalDate;
import java.util.*;
public class DateUtils {
    public static void dateCompare(LocalDate d1, LocalDate d2){
        if(d1.compareTo(d2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
         } else if(d1.compareTo(d2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
         } else if(d1.compareTo(d2) == 0) {
            System.out.println("Both dates are equal");
         }
    }

    public static void dateSort(){
        ArrayList<String> dateList = new ArrayList<>();
        dateList.add("2020-03-25");  
        dateList.add("2019-01-27");  
        dateList.add("2020-03-26");  
        dateList.add("2020-02-26");  
        System.out.println(  
            "Truoc khi sap xep : ");  
        
        for(String date: dateList){
            System.out.println(date);
        }
        Collections.sort(dateList);  
        System.out.println("Sau khi sap xep : ");  
        for(String date: dateList){
            System.out.println(date);
        }
    }


    public static void main (String args[]){
        // DateUtils.dateCompare(LocalDate.parse("2022-05-10"), LocalDate.parse("2022-05-11"));
        DateUtils.dateSort();
    }
}

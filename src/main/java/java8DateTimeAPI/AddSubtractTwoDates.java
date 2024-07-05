package java8DateTimeAPI;

import java.time.LocalDate;

public class AddSubtractTwoDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,7,4);
        LocalDate adddate=date.plusDays(10);
        System.out.println("After 10 date Date= "+adddate);
        LocalDate subdate=date.minusDays(30);
        System.out.println("Before 30 days= " +subdate);


    }
}

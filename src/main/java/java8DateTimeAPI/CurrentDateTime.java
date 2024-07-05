package java8DateTimeAPI;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        //Get Current  Date Time
        LocalDateTime currentdatetime = LocalDateTime.now();
        System.out.println("CurrentDateTime="+currentdatetime);

        //LocalDate.of(int year,int month,int date)
        LocalDate date= LocalDate.of(2024,7,5);
        System.out.println(date);
        System.out.println("GetWeek="+date.getDayOfWeek());

        //DateFormatting

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateformat=currentdatetime.format(formatter);
        System.out.println("FormattedDAte="+dateformat);



    }
}

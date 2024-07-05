package java8DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1984, 6, 13);
        LocalDate currentdate = LocalDate.now();
        Period age = Period.between(dob,currentdate);
        System.out.println(age.getYears() +" , "+age.getDays()+ " , "+age.getMonths());
    }
    }


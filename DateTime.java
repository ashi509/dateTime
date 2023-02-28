package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

        public static void main(String[] args) {
            LocalDateTime curent_date_time= LocalDateTime.now();
            System.out.println(curent_date_time);


            DateTimeFormatter r = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
            String updatedDateAndTime = curent_date_time.format(r);
            System.out.println(updatedDateAndTime);

            DateTimeFormatter t=DateTimeFormatter.ofPattern("E,  MMM dd yyyy   HH:mm");
            String  reupDatedDateTime= curent_date_time.format(t);
            System.out.println(reupDatedDateTime);



        }
    }

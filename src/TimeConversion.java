import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    static String convertTime(String time) {
        DateFormat input  = new SimpleDateFormat("hh:mm:ssa");
        DateFormat output = new SimpleDateFormat("HH:mm:ss");

       try {
           Date date = input.parse(time);
           return output.format(date);
       } catch (ParseException e){
           e.printStackTrace();
           return null;
       }
    }

    public static void main(String[] args) {
        String time = "07:45:23PM";
        String res = convertTime(time);
        if (res != null) {
            System.out.println("Input Format: " + time);
            System.out.println("Output Format: " + res);
        } else
            System.out.println("Invalid Date Format");
    }
}

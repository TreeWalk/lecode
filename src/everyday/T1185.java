package everyday;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T1185 {
}
class Solution1185 {
    public String dayOfTheWeek(int day, int month, int year){
        String [] week ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dateTime = year+"-"+month+"-"+day;
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(dateTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time = calendar.getTimeInMillis();
        int i = (int) (time/86400000)%7;
        return week[i];
    }
}

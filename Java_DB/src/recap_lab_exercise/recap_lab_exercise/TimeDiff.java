package recap_lab_exercise;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class TimeDiff {
    public TimeDiff(){
            }
    
    public static long getDateDiff(Date date1, Date date2, 
            TimeUnit timeUnit) {
    long diffInMillies = date2.getTime() - date1.getTime();
    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
            }
    
}

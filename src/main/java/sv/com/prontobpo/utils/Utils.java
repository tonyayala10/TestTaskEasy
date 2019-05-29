/**
 * 
 */
package sv.com.prontobpo.utils;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.joda.time.Years;


/**
 * @author tony
 *
 */
public class Utils {
	
	public static boolean isEmptyList(List<?> theList){
        return theList == null || theList.size() == 0;
    }
	
	public static LinkedHashMap<String, Integer> getDateDifferences(Date startDate, Date endDate){
        LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<String, Integer>();
        DateTime startDateTime = new DateTime(startDate);
        DateTime endDateTime = new DateTime(startDate);
        try{
            hashmap.put("years", Years.yearsBetween(startDateTime, endDateTime).getYears());
            hashmap.put("months", Months.monthsBetween(startDateTime, endDateTime).getMonths());
            hashmap.put("weeks", Weeks.weeksBetween(startDateTime, endDateTime).getWeeks());
            hashmap.put("days", Days.daysBetween(startDateTime, endDateTime).getDays());


        }catch(Exception e){
            //logger.error(e.getMessage(), e);
        	e.printStackTrace();

        }
        return hashmap;
    }

}


public class WeekDayTest2 {

    public static void main(String[] args) {
        
        System.out.println("Return the enum objects of the week days.");
        System.out.println("If the object is equal to WED, it will return a match.");
        
        WeekDays2[] days = WeekDays2.values();

        System.out.println("");
        for (WeekDays2 day: days) {
            
            System.out.println(day + ": " + WeekDays2.valueOf("MON"));
            
            if (day == WeekDays2.WED)
                System.out.println("MATCH!");
        }
        
        System.out.println("");
        System.out.println("Getting the value out of the FRI object");
        System.out.println("This requires a getter (accessor) in the enum class.");
        System.out.println(WeekDays2.FRI.getValue());

        
        
        
    }
}

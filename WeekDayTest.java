
public class WeekDayTest {

    public static void main(String[] args) {
        
        System.out.println("Return the values of the week days.");
        
        WeekDays[] days = WeekDays.values();

        for (WeekDays day: days) {
            
            System.out.println(day);
        }
        
        
    }
}

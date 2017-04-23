
public enum WeekDays2 {
    
    // No need to add public static final here!
    // When constants have a value, they need a constructor.
    MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday"),
    SAT("Saturday"), SUN("Sunday");
    
    // Attribute needed for constructor
    private String nameOfDay;
    
    // Needs a constructor
    private WeekDays2(String name) throws IllegalArgumentException {
        if (name == null)
            throw new IllegalArgumentException("Name not accepted.");
        this.nameOfDay = name;
    }
    
    // Accessor to get the values.
    public String getValue() {
        return this.nameOfDay;
    }
    
}

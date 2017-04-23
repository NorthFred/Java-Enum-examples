
public enum MathematicalConstants {

    PI(3.141592654), E(2.718282), EULER(0.57721566), GOLDENRATIO(1.618033989);
    
    // Attribute for the value
    private double value;
    
    // Constructor   
    
    private MathematicalConstants(double value) {
        this.value = value;  
    }
    
    public double getValue() {
        return this.value;
    }
}
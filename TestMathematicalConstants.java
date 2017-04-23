
public class TestMathematicalConstants {

    public static void main(String[]args) {
        
        MathematicalConstants[] constants = MathematicalConstants.values();
        
        for (MathematicalConstants constant : constants) {
            System.out.print(constant + " " + constant.getValue());
            System.out.println();
        }
    }
}

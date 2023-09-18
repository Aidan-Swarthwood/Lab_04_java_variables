public class Main
{
    public static void main(String[] args)
    {
        //intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo

        int intOperandA = 2;
        int intOperandB = 6;

        int intSum = intOperandA + intOperandB;
        System.out.println("the sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        int intProduct = intOperandA * intOperandB;
        System.out.println("the product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        int intDifference = intOperandA - intOperandB;
        System.out.println("the difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        int intQuotient = intOperandA / intOperandB;
        System.out.println("the quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        int intModulo = intOperandA % intOperandB;
        System.out.println("the modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // double stuff starts

        double doubleOperandA = 25.1;
        double doubleOperandB = 5.6;

        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("the sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("the product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        double doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("the difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        double doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("the quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        double doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("the modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}
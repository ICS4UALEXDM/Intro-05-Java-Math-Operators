/**
* This program displays text to the user.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/
public final class MathOps {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private MathOps() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Addition with ints.
        System.out.println("8 + 7 = " + (8 + 7));
        // Subtraction with ints.
        System.out.println("10 - 12 = " + (10 - 12));
        // Multiplication with Ints.
        System.out.println("8 * 5 = " + (8 * 5));
        // Division with ints.
        System.out.println("10 / 5 = " + (10 / 5));
        // Division with floats.
        System.out.println("22 / 7 = " + (22f / 7f));
        // Division with Doubles.
        System.out.println("22 / 7 = " + (22d / 7d));
        // Exponents to the power of 2.
        System.out.println("3 ^ 2 = " + (Math.pow(3, 2)));
        // Exponents to the power of 3.
        System.out.println("3 ^ 3 = " + (Math.pow(3, 3)));
        // Square roots.
        System.out.println("√16 = " + (Math.sqrt(16)));
    }
}


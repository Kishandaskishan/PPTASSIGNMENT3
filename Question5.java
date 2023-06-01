   package JavaAssignmentQ3;

   import java.util.Arrays;

   public class Question5 {
       public static int[] plusOne(int[] digits) {
           int n = digits.length;

           // Start from the least significant digit
           for (int i = n - 1; i >= 0; i--) {
               if (digits[i] < 9) {
                   digits[i]++; // Increment the digit
                   return digits; // No carry generated, return the digits
               } else {
                   digits[i] = 0; // Set the digit to 0
               }
           }

           // If we reach this point, it means there is a carry to the most significant digit
           int[] result = new int[n + 1];
           result[0] = 1; // Set the most significant digit to 1
           return result;
       }

       public static void main(String[] args) {
           int[] digits = {1, 2, 3};
           int[] result = plusOne(digits);
           System.out.println("Result: " + Arrays.toString(result));
       }
   }

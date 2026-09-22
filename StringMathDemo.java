public class StringMathDemo {
    public static void main(String[] args) {
        
        String str1 = "Chaitali";
        String str2 = "Girase";

        String str3 = str1.concat(""+ str2);

        System.out.println("Concatenation: " + str3);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println("Substring of str2 (0-3): " + str2.substring(0,3));
        System.out.println("Equals? str1 and str2: " + str1.equals(str2));
        System.out.println("Uppercase str1: " + str1.toUpperCase());


        double a = 13.0;
        double b = 2.7;

         System.out.println("Square root of a: " + Math.sqrt(a));
         System.out.println("a rasied to b: " + Math.pow(a,b));
         System.out.println("max of a and b: " + Math.max(a,b));
         System.out.println("min of a and b: " + Math.min(a,b));
         System.out.println("Random numbert(0-1): " + Math.random());
         System.out.println("Random numbert(10-20): " +(10+ Math.random()*(20-10)));
         System.out.println("Random numbert(1-100): " +(1+ Math.random()*(100-1)));
         System.out.println("ceil of b: " + Math.ceil(b));
         System.out.println("floor of b: " + Math.floor(b));
         System.out.println("Round of b: " + Math.round(b));


    }
}

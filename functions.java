import java.net.SocketPermission;
import java.util.Scanner;

public class functions {

    // calculate sum
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // calculate multiply
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // calculate factorial
    public static int factorial(int number) {

        int fac = 1;
        for (int i = 1; i <= number; i++) {
            fac = fac * i;
        }

        return fac;
    }

    // Calculating binomial Coefficient
    public static int binCoeff(int n, int r) {

        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int num_fac = factorial(n - r);

        int BinCoeff = n_fac / (r_fac * num_fac);

        return BinCoeff;
    }

    // Number isPrime or not
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // calculating PrimesInRanges
    public static void PrimesInRange(int number) {

        for (int i = 2; i < number; i++) {

            if (isPrime(i) == true)// calling Isprime
                System.out.println(i);

        }
    }

    // calculating binaryTODecimal
    public static int binaryToDecimal(int number) {
        int pow = 0;
        int dec = 0;
        int lastDigit = 0;

        while (number > 0) {

            lastDigit = number % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            number = number / 10;

            pow++;

        }
        return dec;
    }

    // multiplication table
    public static void multipTable(int number) {

        int multiply = 0;

        for (int i = 1; i <= 10; i++) {
            multiply = number * i;
            System.out.println(number + " * " + i + " = " + multiply);

        }
    }

    // sum of first n natural number in O(1)
    public static void sumOfnaturalNumber(int number) {

        int sum = (number * number + number) / 2;
        System.out.println("sum of first " + number + " natural number = " + sum);
    }

    // largest number in an array
    public static void largestNumber(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            // conditon a[i]>max
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        System.out.println(" \n largest number in the given array : " + max);

    }

    // minimum number in an array
    public static void minimumNumber(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            // condition min>a[i]
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("\n Smallest number in the given array : " + min);
    }

    // Better approach for prime number {k1 * k2 = n ; k1>=root(n) ; k2<=root(n)}
    public static boolean isprime(int number) {

        for (int i = 2; i < (int) Math.sqrt(number); i++) {

            // completely divide
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // decimaltobinary
    public static void decimalToBinary(int n) {

        int rem;
        int[] arr = new int[10];
        int i = 0;

        while (n > 0) {
            rem = n % 2;
            n = n / 2;
            arr[i] = rem;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }

    }

    // reverseNumber eg: 1234 -> 4321
    public static void reverseNumber(int n) {

        /*
         * another approach
         * while(num!=0){
         * rem = num%10;
         * rev = rev*10 + rem;
         * num = num/10;
         * }
         */
        int lastDigit = 0;
        int[] arr = new int[10];
        int i = 0;

        while (n > 0) {
            lastDigit = n % 10;
            // reverseNumber = reverseNumber * 10 + lastDigit;
            n = n / 10;
            arr[i] = lastDigit;
            i++;

        }
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]);
        }
    }

    // factorial using recursive approach
    public static int fac(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        else {
            return n * fac(n - 1);
        }
    }

    // Star pattern
    public static void StarPattern(int n) {
        // number of lines
        for (int i = 1; i <= n; i++) {
            // printing the star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hollow rhombus
    public static void HollowRectangle(int n) {
        // lines
        for (int i = 1; i <= n; i++) {
            // print
            for (int j = 1; j <= n; j++) {

                // condition...when we need to print the desired output
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Inverted and rotated half pyramid
    public static void inverted_rotated_halfPyramid(int n) {

        // lines
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print *
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Inverted half pyramid with numbers
    public static void inverted_half_pyramid_withNumbers(int n) {

        // lines
        for (int i = n; i >= 1; i--) {
            // print
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Floyd's triangle
    public static void FloydsTraingle(int n) {
        // lines

        int num = 1;
        for (int i = 1; i <= n; i++) {
            // print number
            for (int k = 1; k <= i; k++) {
                System.out.print(num++ + "  ");
            }
            System.out.println();
        }
    }

    // 0-1 triangle
    public static void zero_One_triangle(int n) {
        // lines
        for (int i = 1; i <= n; i++) {
            // print
            for (int j = 1; j <= i; j++) {
                // conditon for printing the triangle
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    public static void butterFlyPattern(int n){

    //lines
    for(int i=1; i<=n; i++){

        // star print
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }

        //space print
        for(int k=1; k<=2*(n-i); k++){
            System.out.print("  ");
        }

        //star print
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    for(int i=n; i>=1; i--){
           // star print
           for(int j=1; j<=i; j++){
            System.out.print("* ");
        }

        //space print
        for(int k=1; k<=2*(n-i); k++){
            System.out.print("  ");
        }

        //star print
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
        
    }
    }

    //butterfly pattern using 4 loops
    public static void butterFly(int n){
    
        //upper butterfly half
        for(int i=1 ; i<=n; i++){
            //print
            for(int j=1; j<=2*n; j++){
                //condition when to print
                if(j<=i || j>2*n-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //lower butterfly half
        for(int i=n; i>=1; i--){
            //print
            for(int j=1; j<=2*n; j++){
                //condition when to print star and when to print space
                if(j<=i || j>2*n-i){
                    System.out.print("* ");
                }
                else{ 
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //solid rhombus
    public static void solid_rhombus(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-i; j++){
               
                //condition to print the pattern
                if(j<=n-i){
                    System.out.print("  ");
                }

                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


    //hollow rhombus
    public static void HollowRhombus(int n){

        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            //printHollow rhombus
            for(int j=1; j<=n; j++){
                if(i==1||i==n ||j==1||j==n){
                    System.out.print("* ");
                }

                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        
        }
    }

     //diamond pattern
     public static void DiamondPattern(int n){

        //outer loop
        for(int i=1; i<=2*n-1; i++){
            //spaces
            //just observe the beauty of the code how spaces and star variable help to achieve desired pattern easily
            int spaces = (int)Math.abs(n-i);
            int star =  2*(n-spaces)-1;

            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //print actual star
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
     }


     //Number_pyramid_Pattern
     public static void number_pyramid_pattern(int n){

        for(int i=1; i<=n; i++){
            //spaces + numbers
            for(int j=1; j<=n; j++){
                //conditon for spaces
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i+" ");
                }
              
            }
            System.out.println();
        }
     }

     //prime number between ranges
     public static void Primes_In_Ranges(int m, int n){

        int[] arr = new int[10];
        int j=0;

        for (int i = m; i <= n; i++) {
            //condition
            if(isPrime(i) == true){
            arr[j] = i;
            j++;
            }
            


            
        }

        //accessing elements from the array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
     }


     //inverted rotated half pyramid using 2 for loops
     public static void inverted_rotated_half_pyramid(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                //if j<=n-i print space
                if(j<=n-i){
                    System.out.print(" ");
                }
                //else print star
                else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
     }


     //inverted star pattern
     public static void Inverted_star_Pattern(int n){
        for(int i=0; i<n; i++){
        
            for(int j=0; j<n; j++){
                //condition
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
     }


     //number pattern
     public static void numberPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //condition
                if(j>=i){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
     }


     //counting digits in a given number
     public static void counting_digit_In_a_givenNumber(int n){
        
        int count = 0;
        int num = n;
        //number is zero we need to specify special condition
        if(num==0){
            System.out.print("There is only 1 digit ");

        }

        else{

            while(num!=0){
                num/=10;
                count++;
            }

        }
        System.out.println("There are " +count +"  digit in a given number : " +n);
      
       
     }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        counting_digit_In_a_givenNumber(n);
    }

}

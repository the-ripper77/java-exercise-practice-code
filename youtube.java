import java.util.Scanner;

class Display{
    public static void main(String[] args) {
        Youtube dp =new Youtube();
        // dp.pattern1();
        // dp.pattern3();
        // dp.inputUserData();
        // dp.bitwiseCalculation();
        dp.youtubeFuctionExcersice();
    }
}

class Youtube {
    void pattern1 ()
    {
        System.out.println("Patter 1:\n");
        for(int i = 1; i<=5; i++)
        {
            for(int j = i; j>=1; j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

    }


    void pattern2 ()
    {
        System.out.println("Pattern 2:\n");
        for (int i = 1; i<=5; i++)
        {
            for(int j = i; j<=5; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }


    void pattern3 ()
    {
        System.out.println("Pattern 3:\n");
        for (int i = 1; i<=5; i++)
        {
            for(int j = i; j<=5; j++)
            {
                System.out.print("  ");
                if (j==5)
                {
                    for (int k = i; k>=1; k--)
                    {
                        System.out.print(" *");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println();
    }


    void inputUserData (){
        System.out.println("\nIntrodution");
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome "+name+" to PG Coding");
        System.out.println("\nWelcome to my calculator!");
        System.out.print("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("Sum of first and second number: "+c);
        scanner.close();
    }


    void bitwiseCalculation() {
        System.out.println("Showcasing Bitwise Operator");
        System.out.println("..........................");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int second = scanner.nextInt();
        System.out.println("..........................");
        System.out.println("         Result");
        System.out.println("..........................");
        scanner.close();


        int and = first & second;
        int or = first | second;
        int xor = first ^ second;
        int not1 = ~first;
        int not2 = ~second;
        int leftshift = first << second; // first << 1(2)(*)
        int rightshift = first >> second; // first >> 1(2)(/)


        System.out.println("Bitwise AND-operator: "+and);
        System.out.println("Bitwise OR-operator: "+or);
        System.out.println("Bitwise XOR-operator: "+xor);
        System.out.println("Bitwise Compliment operator:\n"+"First number compliment: "+not1+"\nSecond number compliment: "+not2);
        System.out.println("Bitwise LeftShift-operator: "+leftshift);
        System.out.println("Bitwise RightShift-operator: "+rightshift);
        
        System.out.println();

        System.out.println("Using Bitwise Operator to Find Even and Odd number");
        System.out.println("..........................");
        if ((first & 1) == 0 && (second & 1) == 0){
            System.out.println("Both number "+first +" and " +second+" is Even number");
        }
        else if((first & 1) == 0){
            System.out.println(first +" is Even number");
            System.out.println(second +" is Odd number");
        }
        else if((second & 1) == 0){
            System.out.println(second +" is Even number");
            System.out.println(first +" is Odd number");
        }
        else {
            System.out.println("Both number "+first +" and " +second+" is Odd number");
        }
    }


    void youtubeFuctionExcersice(){
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Welcome to Mutiplication Dimension");
        // System.out.print("Enter your number: ");
        // int num = scanner.nextInt();
        // System.out.print("Multiplication Table From 1 to ");
        // int tok = scanner.nextInt();
        // System.out.println("..........................");
        // multiplicationCalculation(num, tok);

        // System.out.println();

        // System.out.println("Welcome to Addition of All Odd Number");
        // System.out.print("From 1 to ");
        // int opp = scanner.nextInt();
        // System.out.println("..........................");
        // sumOfOddNumber(opp);

        // System.out.println();

        // System.out.println("Welcome to Factorial Dimension");
        // System.out.print("Enter your factorial number: ");
        // int fact = scanner.nextInt();
        // System.out.println("..........................");
        // factorialNumber(fact);

        // System.out.println();

        // System.out.println("Welcome to Sum of The Digits of Integer");
        // System.out.print("Enter your number: ");
        // int a = scanner.nextInt();
        // System.out.println("..........................");
        // sumOfTheDigits(a);

        System.out.println("Find The Least Common Multiple (LCM) and Greatest Common Divisor (GCD) of Two Number");
        System.out.print("Enter your number: ");
        int num1= scanner.nextInt();
        System.out.print("Enter your number: ");
        int num2 =scanner.nextInt();
        System.out.println("..........................");
        findTwoNumberLCM(num1, num2);
        System.out.println("..........................");
        findTwoNumberGCD(num1, num2);
        scanner.close();
    }


    // Static method
    public static void multiplicationCalculation(int num, int tok){
        int i = 1;
        while (i<=tok){
            int ans = i*num;
            System.out.println("Mutiplication Of " + num + " * " + i + " = "+ ans);
            i++;
        }
    }


    // non-static method
    public void sumOfOddNumber(int opp){
        int i = 1;
        int ans = 0;
        while (i<=opp)
        {
            if (i%2==1) {
                System.out.println("Sum of Odd Number: " + i + " + " + ans );
                ans += i;
            }
            i++;
        }
        System.out.println("..........................");
        System.out.println("Sum Of All Odd Number: "+ans);
    }


    public static long factorialNumber(int fact){
        long ans = 1;
        for(int j = 2; j<=fact; j++){
            System.out.print("factorial " + ans + " * " + j);
            ans *= j;
            System.out.println(" = " + ans);
        }
        System.out.println("..........................");
        System.out.println("Factorial Of " + fact + "! = " + ans);
        return ans;
    }
    

    public static int sumOfTheDigits(int a){
        int ans = 0;
        System.out.print("Sum Of " + a + " digits");
        while (a > 0)
        {
            ans += a % 10;
            a /= 10;
        }
        System.out.println(" = " + ans);
        return ans;
    }


    public int findTwoNumberLCM(int num1, int num2){
        int i = 1;
        while (i<=num2) {
            long mult1 = num1*i;
            for(int j =1; j<=num2; j++)
            {
                long mult2 = num2*j;
                if(mult1==mult2){
                    System.out.println("Common multiplication value of the two number is "+mult1);
                }
            }
            i++;
        }
        System.out.println("..........................");
        int k = 1;
        while(true)
        {
            int lcm = num1*k;
            if(lcm%num2==0)
            {
                System.out.println("LCM of two number is "+lcm);
                return lcm;
            }
            k++;
        }
    }

    public int findTwoNumberGCD(int num1, int num2){
        int i = 1;
        while (i<=num2) {
            if(num1%i==0)
            {
                for(int j =1; j<=num2; j++)
                {
                    if(num2%j==0 && j==i){
                        System.out.println("Common divisor value of the two number is "+i);
                    }
                }
            }
            i++;
        }
        System.out.println("..........................");
        int k = 1;
        int gcd = 1;
        while(k<=num2)
        {
            if(num1%k==0 && num2%k==0)
            {
                gcd = k;
            }
            k++;
        }
        System.out.println("GCD of two number is "+gcd);
        return gcd;
    }

}
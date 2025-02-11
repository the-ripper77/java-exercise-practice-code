import java.util.Scanner;

class javaArray{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array");

        System.out.println();

        System.out.println("# Finding the Sum and Average Number in Array");
        int [] numArray = arrayUtility.inputArray();
        long sum = sum(numArray);
        System.out.println("The sum of the numbers is: "+sum);
        double avg = average(numArray);
        System.out.println("The average of the numbers is:" +avg);

        System.out.println();

        System.out.println("# Find the Occurrences of Number in Array");
        int [] numArrayOccur = arrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occur = occurrences(numArrayOccur, num);
        System.out.println("Your element was found " + occur +" times in the array.");

        System.out.println();

        System.out.println("# Find the Maximum and Minimum Number in Array");
        int [] mumArray= arrayUtility.inputArray();
        int max = maximumNumber(mumArray);
        System.out.println("Maximum Number of the Array is " + max);
        int min =  minimumNumber(mumArray);
        System.out.println("Minimum Number of the Array is " + min);

        System.out.println();

        System.out.println("# Find if the Array is Sorted or Not");
        int [] ifSortArray = arrayUtility.inputArray();
        boolean ifInc = isIncreasingOrder(ifSortArray);
        boolean ifDec = isDecreasingOrder(ifSortArray);
        if(ifInc || ifDec){
            System.out.println("The given Array is Sorted");
        }
        else{
            System.out.println("The given Array is not Sorted");
        }

    }
    public static long sum(int[] numArray){
        int i = 0;
        long sum =0;
        while(i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum ;
    }
    public static double average(int[]numArray){
        long sum = sum(numArray);
        return (sum/numArray.length);
    }
    public static int occurrences(int[] numArrayOccur, int num){
        int count = 0;
        int i = 0;
        while (i<numArrayOccur.length) {
            if(numArrayOccur[i] == num){
                count ++;
            }
            i++;
        }
        return count;
    }
    public static int maximumNumber(int [] mumArray){
        int i = 0;
        int max = mumArray[0];
        while (i<mumArray.length) {
            if(max<=mumArray[i]){
                max = mumArray[i];
            }
            i++;
        }
        return max;
    }
    public static int minimumNumber(int [] mumArray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<mumArray.length) {
            if(min>mumArray[i]){
                min = mumArray[i];
            }
            i++;
        }
        return min;
    }
    public static boolean isIncreasingOrder(int [] ifSortArray){
        int i = 1;
        while (i<ifSortArray.length) {
            if(ifSortArray[i]>ifSortArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasingOrder(int [] ifSortArray){
        int i = 1;
        while (i<ifSortArray.length) {
            if(ifSortArray[i]<ifSortArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
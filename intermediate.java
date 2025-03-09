import java.util.Scanner;

class javaArray{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array");

        System.out.println();

        System.out.println("# Find the Sum and Average Number in an Array");
        int [] numArray = arrayUtility.inputArray();
        long sum = sum(numArray);
        System.out.println("The sum of the numbers is: "+sum);
        double avg = average(numArray);
        System.out.println("The average of the numbers is:" +avg);

        System.out.println();

        System.out.println("# Find the Occurrences of Number in an Array");
        int [] numArrayOccur = arrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occur = occurrences(numArrayOccur, num);
        System.out.println("Your element was found " + occur +" times in the array.");

        System.out.println();

        System.out.println("# Find the Maximum and Minimum Number in Array");
        int [] mumArray= arrayUtility.inputArray();
        int max = maximumNumber(mumArray);
        System.out.println("Maximum Number of an Array is " + max);
        int min =  minimumNumber(mumArray);
        System.out.println("Minimum Number of an Array is " + min);

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

        System.out.println();

        System.out.println("# Delete the Number From an Array");
        int [] wholeArray = arrayUtility.inputArray();
        System.out.print("Now Enter the number you want to delete: ");
        int delete = input.nextInt();
        System.out.println("Here is you New Array");
        int del = deleteTheArray(wholeArray, delete);

        System.out.println();

        System.out.println("# Reverse an Array");
        int [] initialArray = arrayUtility.inputArray();
        System.out.println("Here is your Reverse Array");
        int reverseArray = reverseArray(initialArray);

        System.out.println();

        System.out.println("# Find if your Array is Pallindrom");
        int [] inpuArray = arrayUtility.inputArray();
        boolean palin = ifPalindrome(inpuArray);
        if (palin){
            System.out.println("Your number is Pallindrom");
        }
        else{
            System.out.println("Your number is not Pallindrom");
        }

        System.out.println();

        System.out.println("# Merge the Two Sorted Array");
        int [] arr1 = arrayUtility.inputArray();
        int [] arr2 = arrayUtility.inputArray();
        System.out.print("First Array: ");
        arrayUtility.displayArray(arr1);
        System.out.print("Second Array: ");
        arrayUtility.displayArray(arr2);
        System.out.println("Here is you merge sorted array");
        int merge = mergeArray(arr1, arr2);

        System.out.println();

        System.out.println("# Search an Element in a 2D-Array");
        int [][] input2D = arrayUtility.input2DArray();
        System.out.print("Now input the number you want to search: ");
        int searchNum = input.nextInt();
        boolean isFound = searchIn2D(input2D,searchNum);
        arrayUtility.dispaly2DArray(input2D);
        if(isFound){
            System.out.println("Your number was found");
        }
        else{
            System.out.println("Your number was not found");
        }

        System.out.println();

        System.out.println("# Find the Sum and Average Number of All Element in 2D-Array");
        int [][] insert2DArray = arrayUtility.input2DArray();
        arrayUtility.dispaly2DArray(insert2DArray);
        long totalSum = addingSum(insert2DArray);
        System.out.println("The sum of the numbers is " + totalSum);
        double totalAvg = sumAverage(insert2DArray);
        System.out.println("The Average of the numbers is " + totalAvg);

        System.out.println();

        System.out.println("# Find the Sum of Two Diagonal Elements");
        int [][] enter2DArray = arrayUtility.input2DArray();
        long diagonalSum = sumOfDiagonal(enter2DArray);
        System.out.println("The sum of two diagonal elements are: " + diagonalSum);

        System.out.println();
        
        input.close();
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
    public static int deleteTheArray(int [] wholeArray, int delete){
        int occ = occurrences(wholeArray, delete);
        if (occ == 0){
            System.out.println("error: the number you insert is not listed in the given array");
            return wholeArray.length;
        }
        int newSize = wholeArray.length - occ;
        int [] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i< wholeArray.length){
            if (delete != wholeArray[i]) {
                newArr[j] =wholeArray[i];
                j++;
            }
            i++;
        }
        arrayUtility.displayArray(newArr);
        return 0;
    }
    public static int reverseArray(int [] initialArray){
        // Since arrays in Java are zero-indexed, the last valid index is length - 1
        int i = initialArray.length - 1;
        while ( i >= 0 ){
            System.out.print(initialArray[i] + " ");
            i--;
        }
        System.out.println();
        return 0;
    }
    public static boolean ifPalindrome(int [] inpuArray){
        int i = 0;
        while (i < inpuArray.length/2) {
            if (inpuArray[i] != inpuArray[inpuArray.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int mergeArray(int [] arr1, int [] arr2){
        int newSize = arr1.length + arr2.length;
        int [] arr3 = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length)
        {
            if(j == arr2.length || i < arr1.length && arr1[i] < arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        arrayUtility.displayArray(arr3);
        return 0;
    }
    public static boolean searchIn2D(int [][] input2D, int searchNum){
        int i = 0;
        while (i < input2D.length ){
            int j =0;
            while (j<input2D[i].length) {
                if (input2D[i][j] == searchNum){
                    return true;
                }
                j++;
            }
            i++;
        } 
        return false;
    }
    public static long addingSum(int [][] insert2DArray){
        int i = 0;
        int sum = 0;
        while(i<insert2DArray.length){
            int j = 0;
            while(j<insert2DArray[i].length){
                sum += insert2DArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double sumAverage(int [][] insert2DArray){
        if(insert2DArray.length == 0){
            return 0;
        }
        int rows = insert2DArray.length;
        int column = insert2DArray[0].length;
        double size = rows * column;
        return addingSum(insert2DArray)/size;
    }
    public static long sumOfDiagonal(int[][] enter2DArray){
        arrayUtility.dispaly2DArray(enter2DArray);
        long leftDianonalSum = 0;
        for(int i = 0; i < enter2DArray.length; i++)
        {
            int col = enter2DArray.length - 1 - i;
            leftDianonalSum += enter2DArray [i] [col];
        }
        long rightDiagonalSum = 0;
        for(int j = 0; j < enter2DArray.length; j++){
            rightDiagonalSum += enter2DArray[j][j];
        }
        long finalSum = leftDianonalSum + rightDiagonalSum;
        // if both have the common middle vlaue than
        if(enter2DArray.length%2 != 0){
            int mid = enter2DArray.length/2;
            finalSum -= enter2DArray[mid][mid];
        }
        return finalSum;
    }
}
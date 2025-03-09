import java.util.Scanner;
class arrayUtility {
    // Single Array Input Function
    public static int[] inputArray(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int size = scanner.nextInt();
        int [] number = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Please enter element no "+ (i+1) + " : ");
            number[i] = scanner.nextInt();
            i++;
        }
        return number;
    }

    // 2-D Array Input Function
    public static int [][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int row = input.nextInt();
        System.out.print("Enter the Columns: ");
        int column = input.nextInt();
        int [][] number = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++){
                System.out.print("Please enter element no on Matrix[" + (i) +"]" + "[" + (j) + "] : ");
                number[i][j] = input.nextInt();
            }
        }
        return number;
    }

    // 2-D Array Display Function
    public static int dispaly2DArray(int [][] number){
        int i = 0;
        while (i < number.length ){
            int j = 0;
            while (j < number[i].length) {
                System.out.print("[" + number[i][j]+ "]");
                j++;
            }
            System.out.println();
            i++;
        }
        return 0;
    }

    // Single Array Dispaly Function
    public static int displayArray(int [] number){
        for(int a = 0; a < number.length; a++){
            System.out.print(number[a] + " ");
        }
        System.out.println();
        return 0;
    }

        
}

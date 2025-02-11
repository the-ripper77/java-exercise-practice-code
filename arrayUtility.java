import java.util.Scanner;
class arrayUtility {
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
        
}

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        System.out.print("Please enter the number of elements in an array : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr=new int[size];
        int i=0;
        while(i<size){
            System.out.print("enter the "+(i+1)+" element : ");
            arr[i]=scan.nextInt();
            i++;
        }
        return arr;
    }
    public static int[][] input2dArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of rows in an array : ");
        int row = scan.nextInt();
        System.out.print("Please enter the number of columns in an array : ");
        int column = scan.nextInt();
        int[][] Array2d =new int[row][column];
        int i=0;
        while(i<row){
            int j=0;
            while(j<column){
                System.out.print("Enter the element of "+(i+1)+":row "+(j+1)+":column : ");
                Array2d[i][j]=scan.nextInt();
                j++;
            }
            i++;
        }
        return Array2d;
    }
    public static void displayArray(int[] arr){
        int i=0;
        System.out.println("Your array is : ");
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Array arr=new Array();
        int[] array = ArrayUtility.inputArray();
        System.out.print("please enter the element to check its occurence :");
        int num=scan.nextInt();
        arr.checkElemOccerence(array, num);
        // System.out.print("How maney times you want to run this program : ");
        // int num=scan.nextInt();
        // int count =0;
        // while(count<num){
        //     System.out.print("Enter the kth largest element to find : ");
        //     int key = scan.nextInt();
        //     kLargestElem(Array, key);
        //     count++;
        //     System.out.println();
        // }
        // System.out.println();
        // ArrayUtility.displayArray(sortArray(Array));
        // double avg=Dem.avgOfArray(Array);
        // System.out.println(avg);
        // int[][] arr2 = ArrayUtility.input2dArray();
        // System.out.print("Enter the element to search : ");
        // int key=scan.nextInt();
        // searchElem(arr2, key);
    }
    public static int searchElem(int[][] arr,int Searchelem){
        int i = 0;
        int count = 0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(arr[i][j]==Searchelem){
                    count+=1;
                }
                else{
                    count+=0;
                }
                j++;
            }
            i++;
        }
        if(count>0){
            System.out.println("the element ur looking for is found in the array !");
        }
        else{
            System.out.println("The element ur looking for is not found in the array !");
        }
        return 0;
    }
    public static int kLargestElem(int[] arr,int key){
        int[] sortedArr=sortArray(arr);
        int kLargElem = arr[(sortedArr.length)-key];
        System.out.print("your "+key+" largest element in array is : "+kLargElem);
        return 0;
    }
    public static int[] sortArray(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int j=i+1;
            while(j<arr.length){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
            i++;
        }
        return arr;
    }
    public void checkElemOccerence(int[] array,int element){
        int count =0;
        for(int elem:array){
            if(elem==element){
                count++;
            }
        }
        System.out.println("your number "+element+"is occured "+count+" times in an array ");
        System.out.println();
    }
}
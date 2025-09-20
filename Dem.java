import java.util.Scanner;

public class Dem{
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //Dem demo = new Dem();
        ArrayUtility aray=new ArrayUtility();
        int[] myarr=aray.inputArray();
        sumAndAvgOfArr(myarr);
        // System.out.print("how maney fibbonaccie numbers do u want to print : ");
        // int position=scan.nextInt();
        // for(int i=1;i<=position;i++){
        //     System.out.print(demo.recursionFibbo(i)+" ");
        // }
        // System.out.println();
        // Matrix.fibbo(position);
        //System.out.print(demo.isPalindrome("malayalam")?"its a palindrome ":"its not a palindrome");
        // String password;
        // do{
        //     System.out.print("please enter your password :");
        //     password =scan.next();
        //     if(!demo.ispassword(password)){
        //         System.out.println("invalid password try again !");
        //     }
        // }while(!demo.ispassword(password));
        // System.out.println("Login confirmed !");
        //int[] myArr={2,4,5,7,37,0,35,34,2,13,65,22};
        // System.out.println(demo.recursionFactorial(5));
        // demo.catagorizeStudent(90);
        // demo.catagorizeStudent(66);
        // demo.catagorizeStudent(40);
        // int[] sortedArr = {1,2,4,6,8,10};
        // demo.forEach(sortedArr);
        //demo.oddNumTill50();
        // System.out.println("max element in the array is : "+maxElem(myArr));
        // System.out.println("min element in the array is : "+minElem(myArr));
        // System.out.println(" myArr ");
        // checkSort(myArr);
        // System.out.println("sortedArr ");
        // checkSort(sortedArr);
        
    }
    public static double avgOfArray(int[] arr){
        double sumOfArr=arraySum(arr);
        double totalNum=arr.length;
        System.out.println("total no of elements in the array is : "+totalNum);
        double avg = sumOfArr/totalNum;
        System.out.print("average of the array is : ");
        return avg;
    }
    public static int arraySum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum of array elements is : "+sum);
        return sum;
    }
    public static int checkElem(int[] arr,int elem){
        int count=0;
        int i=0;
        while(i<arr.length){
            if(elem==arr[i]){
                count++;
            }
            else{
                count+=0;
            }
            i++;
        }
        return count;
    }
    public static void checkOccurence(int[] arr,int key){
        int nokey =checkElem(arr, key);
        if(nokey==0){
            System.out.println("there is no "+key+" found in the array ! ");
        }
        else{
            System.out.println("the Element "+key+" occurs "+nokey+" times in the array !");
        }
    }
    public static int maxElem(int[] arr){
        int i=0;
        int max = arr[0];
        while(i<arr.length){
            if(arr[i]>=max){
                max=arr[i];
            }
            else{
                max=max+0;
            }
            i++;
        }
        return max;
    }
    public static int minElem(int[] arr){
        int i=0;
        int min = arr[0];
        while(i<arr.length){
            if(arr[i]<=min){
                min=arr[i];
            }
            else{
                min = min+0;
            }
            i++;
        }
        return min;
    }
    public static boolean isSorted(int[] arr){
        int i=0;
        int count =0;
        while(i<arr.length-1){
            if(arr[i]<arr[i+1]){
                count++;
            }
            else{
                count+=0;
            }
            i++;
        }
        if(count==arr.length-1){
            i++;//to make if redundant
            return true;
        }
        else{
            return false;
        }
    }
    public static void checkSort(int[] arr){
        if(isSorted(arr)==true){
            System.out.println("the array is in sorted order : ");
        }
        else{
            System.out.println("the array is not in sorted oreder : ");
        }
    }
    public int minOf2num(int num1,int num2){
        int min = num1 < num2 ? num1: num2;
        System.out.print("The minimum number is : "+min);
        System.out.println();
        return 0;
    }
    public int maxOf2num(int num1,int num2){
        int max = num1 > num2 ? num1: num2;
        System.out.print("The maximum number is : "+max);
        System.out.println();
        return 0;
    }
    public int checkEvenOdd(int elem){
        String res =elem%2==0 ? "Even":"Odd";
        System.out.println("The number "+elem+" is an "+res+" number ");
        return 0;
    }
    public void absNumber(int num){
        int res =num < 0 ? -num : num;
        System.out.println("the absilute number of "+num+" is "+res);
    }
    public void catagorizeStudent(int marks){
        String res = marks>80?"High":(marks<50?"Low":"Modrate");
        System.out.println("the student is "+res+" level coz his marks is "+marks);
    }
    public void forEach(int array[]){
        for(int elem:array){
            if(elem<10){
                System.out.println(elem);
            }
        }
    }
    public void oddNumTill50(){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
    public long recursionFactorial(int num){
        if(num==1){
            return 1;
        }
        return num*recursionFactorial(num-1);
    }
    public boolean ispassword(String password){
        return password.length()>6;
    }
    public void maxElemForEachloop(int[] array){
        int max=Integer.MIN_VALUE;
        for(int elem:array){
            if(max<elem){
                max=elem;
            }
        }
        System.out.println("your maximum element in array is "+max);
    }
    public void readInput(){
        Scanner input =new Scanner(System.in);
        String text;
        do{
            System.out.print("enter the text : ");
            text=input.next();
            if(text.equalsIgnoreCase("exit")){
                break;
            }
        }while(true);
        System.out.println("exited successfully !");
        input.close();
    }
    public void sumOfPositiveInt(){
        Scanner input=new Scanner(System.in);
        int sum=0;
        int num;
        while (sum<80) { 
            System.out.print("enter the number for sum :");
            num=input.nextInt();
            if(num<0){
                continue;
            }
            sum+=num;
        }
        System.out.println("your sum of the positive numbers is "+sum);
        input.close();
    }
    public boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPosition=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastPosition)){
            return false;
        }
        String newStr=str.substring(1,lastPosition);
        return isPalindrome(newStr);
    }
    public int recursionFibbo(int num){
        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        else{
            return recursionFibbo(num-1)+recursionFibbo(num-2);
        }
    }
    public static void sumAndAvgOfArr(int[] arr){
        int sum=0;
        long avg=0;
        for(int i=0;i<arr.length;i++){ 
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.print("Sum of the array is : "+ sum + "\nAverage is : "+avg+" ");
    }
}
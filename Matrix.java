import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        int number=readNum();
        if(ispalindrome(number)){
            System.out.println("it's palindrome number : ");
        }
        else{
            System.out.println("it's not a palindrome number !");
        }
    }
    public static int readNum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = scan.nextInt();
        scan.close();
        return input;
    }
    public static void multiplicationTable(int num){
        System.out.println("multiplicatipon table of your number is : ");
        for(int i=1;i<=10;i++){
            System.out.println(num +" x "+i+" = "+(num*i));
        }
    }
    public static int OddNumSum(int num){
        int sum=0;
        System.out.print("your odd number's sum is : ");
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sum=sum+0;
            }
            else{
                sum+=i;
            }
        }
        return sum;
    }
    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i =2;
        while(i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit =num%10;
            newNum = newNum*10+digit;
            num /= 10;
        }
        return newNum;
    }
    public static void fibbo(int num){
        int first=0,second=1;
        if(num<0) return;
        System.out.print("0");
        if(num==0) return;
        System.out.print(", 1");
        while(first+second <= num){
            int third = first+second;
            System.out.print(" ,"+third);
            first=second;
            second=third;
        }
    }
    public static int power(int num,int len){
        int res =1;
        if(len==0) return 1;
        int i=1;
        while(i<=len){
            res*=num;
            i++;
        } 
        return res;
    }
    public static int checkDigits(int num){
        int count =0;
        while(num>0){
            count++;
            num /=10;
        }
        return count;
    }
    public static boolean isAnstrome(int num){
        int res=0;
        int numcopy=num;
        int pow=checkDigits(num);
        while(num>0){
            int dig=num%10;
            num/=10;
            res+=power(dig,pow);
        }
        return res==numcopy;
    }
    public static boolean ispalindrome(int num ){
        int rever = reverse(num);
        return rever==num;
    }
}
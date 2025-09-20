
import java.util.Scanner;

class calci{
    String name;
    int age;
    static int gussNum;
    static int num;
    public String toString(){
            return "Student { "+"name is : "+name+" and age is :"+age+'}';
        }
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // calci std = new calci();
        // do{
        //     System.out.print("\nGuess the number (1-10) : ");
        //     num=scan.nextInt();
        //     calci.gussGame(num);
        //     if(num!=gussNum){
        //         System.out.printf("Ohh wrong guss try again ! \nThe number was : %d \n",gussNum);
        //     }
        //     else{ 
        //         System.out.printf("u gussed it ! \nThe number is : %d \n",gussNum);
        //     }
        // }while(num!=gussNum);
        String[] arr={"java","is","the","best","programming","lalguage"};
        StringBuilder sb=new StringBuilder();
        for (Object elem : arr){
            sb.append(elem).append(" ");
        }
        System.out.println(sb);
    }
    public static boolean isprime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public String Student(){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter rour name : ");
        name = input.next();
        System.out.print("enter your age : ");
        age = input.nextInt();
        return "null";
    }
    public void concatinateStrings(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String firstString=scan.next();
        System.out.print("Enter the second string : ");
        String secondString=scan.next();
        String newString=firstString.concat(" ").concat(secondString);
        System.out.println(newString.toUpperCase());
    }
    public int diceRoll(){
        //System.out.println("welcome to dice roll !");
        double num =Math.random()*6;
        return (int)Math.ceil(num);
    }
    public static int gussGame(int num){
        double randomNum=Math.random()*10;
        gussNum=(int)Math.ceil(randomNum);
        return gussNum;
    }
}
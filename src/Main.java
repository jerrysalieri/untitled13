import java.util.Scanner;
public class Main {
    public static void main(String[]args){
       boolean isTrue=true;
       Scanner scan = new Scanner(System.in);
       String input;
       String output;
       String secondInput;
       while(isTrue){
           System.out.println("Please input here everything you want");
           input=scan.nextLine();
           output=input.toUpperCase();
           System.out.println("Output string:");
           System.out.println(output);
           System.out.println("Do you want to continue? Y/N");
           secondInput=scan.nextLine();
           if(secondInput.equals("Y")){
               System.out.println("Restarting");
           }
           else if(secondInput.equals("N")){
               isTrue=false;
           }
           else{
               System.out.println("Please enter correct value");
           }


       }
    }
}

import java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        boolean isTrue=true;
        Scanner scan = new Scanner(System.in);
        String input;
        String secondInput;

        while (isTrue){
            System.out.println("Please input here everything you want");
            input=scan.nextLine();
            String reverse=reverseString(input);
            System.out.println("Here is your word spelled backwards:");
            System.out.println(reverse);
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
    public static String reverseString(String ch){
        if (ch.isEmpty())
            return ch;
        return reverseString(ch.substring(1)) + ch.charAt(0);
    }
    //I had no idea how can I do it with for loop, so I have done this way
}

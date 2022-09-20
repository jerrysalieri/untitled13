import java.util.Scanner;
public class Test {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String choice;
        int num;
        String choice2;
        int num2;
        boolean isTrue=true;
        boolean isTrue2 = true;
        while (isTrue){
            System.out.println("Input:");
            choice=scan.nextLine();
            num=Integer.parseInt(choice);
           switch(num){
               case 1:{
                   System.out.println("Restarting...");
                   break;
               }
               case 2:{
                   isTrue=false;
                   break;
               }

           }

        }
        do{
            System.out.println("Second input:");
            choice2=scan.nextLine();
            num2=Integer.parseInt(choice2);
            switch(num2){
                case 1:{
                    System.out.println("Restarting...");
                    break;
                }
                case 2:{
                    isTrue2=false;
                    break;
                }
            }

        }while(isTrue2);
        int number=0;
        int secondNumber=11;
       for(int i=0; i<10;i++){
           number++;
           for(int j=0; j<i; j++);{
               System.out.print(number+ " ");
           }
       }
       System.out.println();
        for(int i=0; i<10;i++){
            secondNumber--;
            for(int j=0; j<i; j++);{
                System.out.print(secondNumber+ " ");
            }
        }


    }
}


/*readme：this java code's function is Guss Price,which means you have three opportunities to guess the price.
In three chance,if you win,the window will show you"do you want to play again?,if you fail,the window will
 show you"do you want to plag again.Using Random method to get a random price and use Scanner method to 
 input the Price you guss.
 */
import java.util.Scanner;
import java.util.Random;

public class GusPrice {
    public static void main(String[] args) {
        Random random=new Random();
        int price = random.nextInt(3)+1;
        Scanner scanner = new Scanner(System.in);

        int i=1;
        int Judge=1;//the value input from keyboard,to judge whether you want to play again

        while(Judge==1) {
            i=1;// when play again,set loop_variable to 0,make you have three opportunities    
            while (i <= 3) {
                System.out.println(" please input the price you guess "+"the"+i+"'s chance");
                int inputPrice = scanner.nextInt();
                if (price == inputPrice) {
                    System.out.println("the Price you guess is right，do you want to play again：");
                    System.out.println(" press 1 to start again ,press 0 to exit’");
                    Judge = scanner.nextInt();
                    i=4;
                   /**once your guessing is right,it will do not run the inner loop by Using"i=4",
                    and use the"continue" to jump to the outer loop to Judge dou you want to play again。
                    the chance（<=2）will be invalid,to run again.**/

                }
                else {
                    System.out.println("the price you guess is wrong");
                    if (i == 3) {
                        System.out.println("the chance you have is used out，do you want to play again？");
                        System.out.println("press 1 to start again ,press 0 to exit’’");
                        Judge = scanner.nextInt();
                    }
                }
                i++;
            }
            continue;
        }
    }
}

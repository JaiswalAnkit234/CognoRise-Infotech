import java.util.*;
public class Calculater {
    public static void main(String [] args) {
        try {
            int ans;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number");

            int no1 = sc.nextInt();
            System.out.println("Enter any number");
            int no2 = sc.nextInt();
            System.out.println("Enter any operator(+,-,*,/)");
            int op = sc.next().charAt(0);
            switch (op) {
                case '+':
                    ans = no1 + no2;
                    break;
                case '-':
                    ans = no1 - no2;
                    break;
                case '*':
                    ans = no1 * no2;
                    break;
                case '/':
                    ans = no1 / no2;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
            System.out.println(ans);
        }
         catch(Exception e){
            System.out.println("You cannot divide by zero");

            }
        }
    }


import java.util.Scanner;

public class calculater{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        float a,b;
        char choice;
        System.out.print("Enter first number : ");
        a = scan.nextFloat();

        System.out.print("Enter second number : ");
        b = scan.nextFloat();
        
        System.out.println("Press + or - or * or / or %");
        choice = scan.next().charAt(0);

        switch(choice)
        {
            case '+':
            {
                System.out.print("Addition of "+ a +" and "+ b +" = " + (a+b));                
            }
            break;
            case '-':
            {
                System.out.print("Subtraction of "+ a +" and "+ b +" = " + (a-b));                
            }
            break;
            case '*':
            {
                System.out.print("Multiplicaton of "+ a +" and "+ b +" = " + (a*b));                
            }
            break;
            case '/':
            {
                System.out.print("Division of "+ a +" and "+ b +" = " + (a/b));                
            }
            break;
            case '%':
            {
                System.out.print("Modulo of "+ a +" and "+ b +" = " + (a%b));                
            }
            break;
            default:
            {
                System.out.println("Enter valis input");
            }
            break;
        }

    }
}
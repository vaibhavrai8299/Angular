import java.util.Scanner;
class Remainder{
public static void main(String[] args)
{
int num1,remainder,quotient;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the num1");
num1= sc.nextInt();
remainder=num1%10;
quotient=num1/10;
System.out.print(" The remainder is "+remainder);
System.out.print(" The quotient is "+quotient);
}
}
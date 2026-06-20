package projects;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;

        do {
            System.out.println("=======SCIENTIFIC CALCULATOR========");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Power");
            System.out.println("6.Square Root");
            System.out.println("7.sin");
            System.out.println("8.cos");
            System.out.println("9.tan");
            System.out.println("10.log");
            System.out.println("11.factorial");
            System.out.println("0.Exit");
            System.out.println("Select an option");
            option=sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter first number ");
                    double a=sc.nextDouble();
                    System.out.println("enter second number");
                    double b=sc.nextDouble();
                    System.out.println("Result=" + (a+b));
                    break;
                case 2:
                    System.out.println("enter first number");
                    a=sc.nextDouble();
                    System.out.println("enter second number");
                    b=sc.nextDouble();
                    System.out.println("result=" + (a-b));
                case 3:
                    System.out.println("enter first number");
                    a=sc.nextDouble();
                    System.out.println("enter second number");
                    b=sc.nextDouble();
                    System.out.println("result=" + (a*b));
                case 4:
                    System.out.println("enter first number");
                    a=sc.nextDouble();
                    System.out.println("enter second number");
                    b=sc.nextDouble();
                    if(b!=0){
                    System.out.println("result=" + a/b);
            }else{
                        System.out.println("cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.println("enter first number");
                    a=sc.nextDouble();
                    System.out.println("enter second number");
                    b=sc.nextDouble();
                    System.out.println("result=" +Math.pow(a,b));
                    break;
                case 6:
                    System.out.println("enter first number");
                    a=sc.nextDouble();
                    System.out.println("result =" + Math.sqrt(a));
                    break;
                case 7:
                    System.out.println("enter angle in degrees");
                    double angle=sc.nextDouble();
                    System.out.println("result=" + Math.sin(Math.toRadians(angle)));
                    break;
                case 8:
                    System.out.println("enter angle in degrees");
                    angle =sc.nextDouble();
                    System.out.println("result=" + Math.cos(Math.toRadians(angle)));
                    break;
                case 9:
                    System.out.println("enter angle in degrees");
                    angle=sc.nextDouble();
                    System.out.println("result=" + Math.tan(Math.toRadians(angle)));
                          break;
                case 10:
                    System.out.println("enter number");
                    double num=sc.nextDouble();
                    System.out.println("result=" + Math.log10(num));
                           break;
                case 11:
                    System.out.println("enter number");
                    int n=sc.nextInt();
                    int factorial =1;
                    for(int i=1; i<=n ;i++ ){
                        factorial=factorial*i;
                    }
                    System.out.println("factorial=" + factorial);
                    break;
                case 0:
                    System.out.println("thanks for using");
                      break;
                default:
                    System.out.println("invalid choice");

            }
        }while(option != 0);
          sc.close();








    }
}

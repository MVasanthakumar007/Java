package calculator1;
import java.util.Scanner;
interface Arithmetic
{
      void add(double a,double b);
      void sub(double a,double b);
      void mul(double a,double b);
      void div(double a,double b);
  }
class arithmetic implements Calculator1{
    void add(double a,double b){
        System.out.println("Addition: "+(a+b));
    }
    void sub(double a,double b){
        System.out.println("Subraction: "+(a-b));
    }
    void mul(double a,double b){
        System.out.println("Multiplication: "+(a*b));
    }
    void div(double a,double b){
        System.out.println("Divison: "+(a/b));
    }
}
class Operations{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a first number:");
        double num1=in.nextDouble();
        System.out.println("Enter a second number:");
        double num2=in.nextDouble();
        arithmetic obj=new arithmetic();
        System.out.println("Enter choice(1/2/3/4=+/-/*/%)");
        int a=in.nextInt();
        switch(a){
            case 1:
                obj.add(num1, num2);
                break;
            case 2:
                obj.sub(num1, num2);
                break;
            case 3:
                obj.sub(num1, num2);
                break;
            case 4:
                obj.div(num1, num2);
                break;
        }
                
    }
}

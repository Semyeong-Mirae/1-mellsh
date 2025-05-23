import java.util.Scanner;

interface Calculator{
    int add(int a, int b);

    default int mul(int a, int b){
        return a*b;
    }

    static int sub(int a, int b){
        return a-b;
    }
}

class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}

public class Main {
    public static void main(String[] args){
        SimpleCalculator calc = new SimpleCalculator();
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();

        System.out.println(calc.add(a, b));
        System.out.println(calc.mul(a, b));
        System.out.println(Calculator.sub(a, b));
        stdin.close();
    }
}
/*
如何从键盘获取不同类型的变量，需要使用Scanner类。

具体实现步骤
1. 导包：import java.util.Scanner;
2. Scanner的实例化: Scanner scan = new Scanner(System.in);
3. 调用Scanner类的相关方法(next()/nextXxx()，并获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的值。
如果输入的数据类型与要求的类型不匹配时，会报异常：InputMismatchException。
导致程序终止

*/
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.print("请输入你的芳龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.print("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.print("你是否单身, true/false：");
        boolean yyds = scan.nextBoolean();
        System.out.println(yyds);

        scan.close();
    }
}

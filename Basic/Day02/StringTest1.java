/*
String类型变量的使用
1. String属于引用数据类型
2. 声明String类型变量时，使用一对"";
3. String可以和8种基本类型的变量进行运算，且运算只能是”+“运算（连接运算）
4. 运算的结果仍然是String类型

*/

public class StringTest1 {
    public static void main(String[] args){
        String s1 = "Hello World!";
        System.out.println(s1);

        //*********************
        int number = 1001;
        String numberStr = "学号：";
        System.out.println(numberStr + number);
        System.out.println(numberStr + true);
        
        //练习1
        char c = 'a';
        int  num = 10;
        String str = "hello";
        System.out.println(c + num + str); //107hello
        System.out.println(c + str + num); //ahello10
        System.out.println(c + (num + str)); //a10hello
        System.out.println((c + num) + str); //107hello
        System.out.println(str + num + c); //hello10a

        //练习2
        //* *
        System.out.println('*' + "\t" + '*');
        System.out.println("*       *");

        // String str1 = 4; error
        String str2 = 3.5f + "";
        System.out.println(str2);

        //*********************
        
    }
}

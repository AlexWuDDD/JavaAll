/*

数据类型

- 基本数据类型primitive type
    > 数值型
        整数类型 byte、short、int、long
            byte: 1字节=8bit -128~127
            short: 2字节
            int: 4字节
            long: 8字节
        浮点类型 float、double
            float：4字节
            double: 8字节

    > 字符型 char
    > 布尔型 boolean

- 引用数据类型reference type
    > 类class //字符串在这里
    > 接口interface
    > 数组[]

*/

public class VariableTest {
    public static void main(String[] args){

        //1. 整数型
        byte b1 = 12;
        byte b2 = -128;
        System.out.println(b1);
        System.out.println(b2);
        //1. 声明long型变量，必须以“l”或“L”结尾
        //2. 通常使用int类型
        short s1 = 128;
        int i1 = 1234;
        long l1 = 3414234324L;

        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        //2. 浮点型
        double d1 = 123.3;
        System.out.println(d1 + 1);

        //1. 定义float类型变量时，变量以”f”或“F”结尾
        float f1 = 12.3F;
        System.out.println(f1 + 1);
        //通常，定义浮点型变量时，使用double型

        //3. 字符型：char（1字符 = 2个字节）
        char c1 = 'a';
        System.out.println(c1);
        c1 = 'A';
        System.out.println(c1);

        char c5 = '\n';//转义字符
        char c6 = '\t';
        System.out.print("hello" + c5);
        System.out.println("world");

        System.out.print("hello" + c6);
        System.out.println("world");

        //直接使用Unicode值来表示字符型常量
        char c7 = '\u0123';
        System.out.println(c7);

        char c8 = '\u0043';
        System.out.println(c8);        

        //4. 布尔型：boolean
        boolean bb1 = true;
        System.out.println(bb1);
        
        

    }
}

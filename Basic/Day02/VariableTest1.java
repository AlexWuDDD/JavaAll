/*
基本数据类型之间的运算规则：

前提：
> 这里讨论只是7种基本类型变量间的运算，不包含boolean类型的

1. 自动类型提升
    当容量小的数据类型的变量与容量大的数据类型的变量做运算时，
    结果自动提升为容量大的数据类型
    byte-->short-->int-->long-->float-->double

    特别的：当byte、char、short三种类型的变量做运算时，结果为int型


2. 强制类型转换
    自动类型提升运算的逆运算
    1. 需要使用强转符：（）
    2. 注意点：强制类型转换，可能导致精度损失



说明：此时的容量大小指的是，表示数的范围的大和小，比如：float容量大于long的容量

*/


public class VariableTest1 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        //编译不通过
        // byte b2 = b1 + i1;
        int i2 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1;
        System.out.println(f);

        //************************
        char  c1 = 'a';
        int i3 = 10;
        int i4 = c1  + i3;
        System.out.println(i4);

        short s2 = 10;
        int c5 = c1 + s2;
        System.out.println(c5);
    
        byte b2 = 10;
        int c3 = c1 + b2;
        System.out.println(c3);
        //************************

        double d1 = 12.3;
        // int i5 = d1;
        int i5 = (int)d1; //截断操作
        System.out.println(i5);

        long l1 = 123L;
        short s3 = (short)l1;
        System.out.println(s3);

        int i8 = 129;
        byte b3 = (byte)i8;
        System.out.println(b3);
        
    }
}

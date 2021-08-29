public class VariableCalSpecial {
    public static void main(String[] args) {
        //1.编码情况1
        //这里123213没有加L是因为编译器认为123213是int型，自动类型提升为long
        long l = 123213;
        System.out.println(l);

        //***************
        //编译失败，因为12.3是double型，大的类型没法降为小的类型float
        //所以必须加f或F
        float f1 = 12.3f;
        System.out.println(f1);

        //2.编码情况2
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型
        byte b = 12;
        // byte b1 = b + 1;
        // float f1 = b + 12.3;
        System.out.println(b);
    }
}

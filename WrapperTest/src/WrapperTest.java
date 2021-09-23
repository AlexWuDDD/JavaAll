import org.junit.Test;


public class WrapperTest{

    //String类型 ---> 基本数据类型、包装类
    @Test
    public void test5(){
        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);
    }

    //基本数据类型、包装类--->String类,调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式1，连接运算
        String str1 = num1 + "";
        //方式2：
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        
    }

    //自动装箱越拆箱
    @Test
    public void test3(){
        int num1 = 10;
        method(num1);
        
        //自动装箱
        int num2 = 10;
        Integer in2 = num2;

        Boolean b2 = true;

        //自动拆箱
        int num3 = in2;
        System.out.println(num2);

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //包装类-->基本数据类型：调用包装类的xxxValue
    @Test
    public void test2(){
        Integer in1 = Integer.valueOf(100);
        int i1 = in1.intValue();
        System.out.println(i1+1);

        Float f1 = Float.valueOf(12.3f);
        float f2 = f1.floatValue();
        System.out.println(f2+1);

    }

    //基本数据类型--->包装类:调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = Integer.valueOf(num1);
        System.out.println(in1.toString());

        Integer in2 = Integer.valueOf("123");
        System.out.println(in2.toString());

        Float f1 = Float.valueOf(1.22f);
        Float f2 = Float.valueOf("1.223");
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("false");
        Boolean b3 = Boolean.valueOf("true123");
        System.out.println(b1.toString());  //true  true
        System.out.println(b2.toString());  //true  true
        System.out.println(b3.toString());  //true  true
    }

}
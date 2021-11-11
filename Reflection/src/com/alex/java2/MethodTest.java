package com.alex.java2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.alex.java1.Person;

import org.junit.Test;

/**
 * 获取运行时类的方法结构
 */

public class MethodTest {
    
    @Test
    public void test1(){

        Class<Person> clazz = Person.class;

        //getMethods() 获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }

        System.out.println("------------------");

        //getDeclaredMethods() 获取当前运行时类中声明的所有方法（不包括父类中声明的方法）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method);
        }

        System.out.println("------------------");
    }

    /**
     * @xxxx
     * 权限修饰符：返回类型 方法名(参数类型1 形参名1, ...) throws xxxException{}
     */
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Method[] methods = clazz.getDeclaredMethods();

        
        for(Method method : methods){
            //1.获取方法声明的注解
            Annotation[] annotations = method.getAnnotations();
            for(Annotation annotation : annotations){
                System.out.println(annotation);
            }

            //2. 权限修饰符
            System.out.println(Modifier.toString(method.getModifiers()));
        
            //3. 返回值类型
            System.out.println(method.getReturnType().getName());

            //4. 方法名
            System.out.println(method.getName());

            //5. 方法参数列表
            Class<?>[] parameterTypes = method.getParameterTypes();
            if(parameterTypes != null && parameterTypes.length > 0){
                for(Class<?> parameterType : parameterTypes){
                    System.out.println(parameterType.getName());
                }
            }

            //6. 抛出的异常
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            if(exceptionTypes != null && exceptionTypes.length > 0){
                for(Class<?> exceptionType : exceptionTypes){
                    System.out.println(exceptionType.getName());
                }
            }

            System.out.println();
        }
    }
}

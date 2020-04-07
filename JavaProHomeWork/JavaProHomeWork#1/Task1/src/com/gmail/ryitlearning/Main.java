package com.gmail.ryitlearning;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        /**Домашнее задание№1*
         *
         *1) Создать аннотацию , которая принимает параметры для метода . Написать код, который
         * вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в
         * вызываемый метод.
         */


        Method[] allMethodsInClass = Methods.class.getDeclaredMethods();
        
        for (Method method : allMethodsInClass) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test1 = method.getAnnotation(Test.class);
                System.out.println("The result is: " + method.invoke(new Methods(), test1.a(), test1.b()));
            }
        }


    }

}

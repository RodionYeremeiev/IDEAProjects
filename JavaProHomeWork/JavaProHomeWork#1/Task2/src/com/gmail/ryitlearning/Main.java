package com.gmail.ryitlearning;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        /**
         * 2*. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
         *  1) в какой файл должен сохраниться текст
         *  2) метод, который выполнит сохранение.
         *  Написать класс Saver, который сохранит поле класса TextContainer в указанный файл.
         *
         */

        TextContainer tc = new TextContainer("Hello there!");
        Class<?> cls = tc.getClass();

        if (! cls.isAnnotationPresent(SaveTo.class)) {
            System.out.println("Error!");
            return;
        }

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
                if(m.isAnnotationPresent(Saver.class)){
                    m.invoke(tc, path);
                    break;
                }
        }

        System.out.println("File saved!");

    }
}

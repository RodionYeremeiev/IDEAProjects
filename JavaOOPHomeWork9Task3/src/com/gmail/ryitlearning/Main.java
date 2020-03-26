package com.gmail.ryitlearning;

public class Main {
    public static void main(String[] args) {
/**
 *
 * 3) Считайте из файла текст на английском языке, вычислите
 * относительную частоту повторения каждой буквы и выведите на
 * экран результат в порядке убывания относительной частоты
 * повторения.
 *
 */

        Text text1 = new Text("F:\\IDE\\Projects\\IDEAProjects\\JavaOOPHomeWork9Task3\\Text.txt");
        text1.readFile();
        text1.displayList();
    }
}

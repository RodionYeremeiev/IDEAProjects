package com.gmail.ryitlearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo(path = "./1.txt")
public class TextContainer {
    private String text;

    public TextContainer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Saver
    public void save(String path) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new File(path))) {
            pw.print(text);
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

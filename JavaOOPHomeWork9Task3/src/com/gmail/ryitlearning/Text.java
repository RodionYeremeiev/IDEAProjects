package com.gmail.ryitlearning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Text {
    private String file; // The path to file wich contains text
    private List<Letter> text = new ArrayList<>();
    private int textLength = 0;

    //setting path to file
    public Text(String file) {
        this.file = file;
    }

    //reading text from file and forming array of chars without any symbols except letters
//also counting how many times letter appears in text
    public void readFile() {
        try {
            FileReader fr = new FileReader(file);
            String str = "";
            char[] lettersArray;
            while (fr.ready()) {
                str += (char) fr.read();
            }
            lettersArray = str.toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();
            textLength = lettersArray.length;
            for (char ltr : lettersArray) {
                int index = isListContain(ltr);
                if (index == -1) {
                    text.add(new Letter(ltr));
                } else {
                    text.get(index).setFreq();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //checking if letter appears in text
    public int isListContain(char ltr) {
        for (int i = 0; i < text.size(); i++){
            if (text.get(i).getLtr() == ltr){
                return i;
            }
        }
        return -1;
    }
    //calculating how many times letter appearing related to to number of letters in text
    public void calculateRelFreq(){
        for (Letter ltr:text) {
            ltr.setRelFreq(ltr.getFreq()*1.0/textLength);
        }
    }
    //sorting and displaying result
    public void displayList(){
        calculateRelFreq();
        Collections.sort(text, new Comparator<Letter>() {
            @Override
            public int compare(Letter o1, Letter o2) {
                if (o1.getRelFreq() > o2.getRelFreq()) {
                    return -1;
                } else if (o1.getRelFreq() < o2.getRelFreq()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for(Letter ltr:text){
            System.out.println(ltr);
        }
    }

}

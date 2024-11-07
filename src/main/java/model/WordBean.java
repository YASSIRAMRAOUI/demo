package model;

import java.io.Serializable;

public class WordBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String word;
    private int wordLength;

    public WordBean() {
        this.word = "";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
        this.wordLength = word.length();
    }

    public int getWordLength() {
        return wordLength;
    }
}

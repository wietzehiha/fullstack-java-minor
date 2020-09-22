package com.example.demo.model;

import com.example.demo.service.stringService;

public class formCache {

    public String inputText;
    public int countWords;

    public formCache(String inputText) {
        this.inputText = inputText;
        this.countWords = stringService.countWords(inputText);
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public int getCountWords() {
        return countWords;
    }

    public void setCountWords(int countWords) {
        this.countWords = countWords;
    }
}

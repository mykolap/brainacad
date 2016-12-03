package com.brainacad.module2.lesson15;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 12/3/2016.
 */
public class MyTranslator {
    private Map<String,String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        System.out.println("try to translate '" + en + "'");
        return dictionary.get(en);
    }
}

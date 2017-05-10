package com.fliden.g11n;

import com.ibm.icu.text.Transliterator;

import java.util.Enumeration;

public class WDTransliterator {

    public static final String FURIGANA2LATIN = "Katakana-Hiragana;Hiragana-Latin";
    public static final String LATIN2HIRAGANA = "Latin-Hiragana";

    static public String transliterate(String text, String id) {
        Transliterator transliterator = Transliterator.getInstance(id);
        if (text != null) {
            return transliterator.transliterate(text);
        } else {
            return transliterator.transliterate("");
        }
    }

    public static void main(String[] args) {

        Enumeration<String> ids = Transliterator.getAvailableIDs();
        while(ids.hasMoreElements()) {
            System.out.println(ids.nextElement());
        }
    }
}

package com.fliden.g11n;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WDTransliteratorTest {

    String TOKYO_HIRAGANA = "ときょ";
    String TOKYO_KATAKANA = "トキョ";
    String TOKYO_ROMAJI = "tokyo";
    String TOKYO_KATAKANA_EXPECTED = "トウキョウ";
    String TOKYO_HIRAGANA_EXPECTTED = "とうきょう";

    String JAPAN_HIRAGANA = "にほん";
    String JAPAN_KATAKANA = "ニホン";
    String JAPAN_ROMAJI = "nihon";

    @Test
    public void testTransliterate_LATIN2HIRAGANA() {

        assertEquals(TOKYO_HIRAGANA, transliterate(TOKYO_ROMAJI, com.fliden.g11n.WDTransliterator.LATIN2HIRAGANA));
        assertEquals(JAPAN_HIRAGANA, transliterate(JAPAN_ROMAJI, com.fliden.g11n.WDTransliterator.LATIN2HIRAGANA));
    }

    @Test
    public void testTransliterate_FURIGANA2LATIN() {
        assertEquals(TOKYO_ROMAJI, transliterate(TOKYO_HIRAGANA, com.fliden.g11n.WDTransliterator.FURIGANA2LATIN));
        assertEquals(TOKYO_ROMAJI, transliterate(TOKYO_KATAKANA, com.fliden.g11n.WDTransliterator.FURIGANA2LATIN));
        assertEquals(JAPAN_ROMAJI, transliterate(JAPAN_HIRAGANA, com.fliden.g11n.WDTransliterator.FURIGANA2LATIN));
        assertEquals(JAPAN_ROMAJI, transliterate(JAPAN_KATAKANA, com.fliden.g11n.WDTransliterator.FURIGANA2LATIN));
    }

    @Test
    public void testTransliterate_FURIGANA2LATIN_NullInput() {
        assertEquals("", transliterate(null, com.fliden.g11n.WDTransliterator.FURIGANA2LATIN));
    }

    static String transliterate(String str, String id){
        return com.fliden.g11n.WDTransliterator.transliterate(str, id);
    }

}

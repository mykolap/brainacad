package com.brainacad.module2.lesson13;

/**
 * Created by Admin on 11/26/2016.
 */
public class ClassWork {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Fruits.values()));
//        System.out.println(Fruits.APPLE);
//        System.out.println(Fruits.GRAPE);

        MyBox<Integer> myVar;

        //Unicode Character 'BIRTHDAY CAKE' (U+1F382)
        //http://www.fileformat.info/info/unicode/char/1f382/index.htm

        /*
        http://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
Unicode Character Representations

The char data type (and therefore the value that a Character object encapsulates) are based on the original Unicode specification,
which defined characters as fixed-width 16-bit entities. The Unicode Standard has since been changed to allow for characters
whose representation requires more than 16 bits. The range of legal code points is now U+0000 to U+10FFFF, known as Unicode scalar value.
(Refer to the definition of the U+n notation in the Unicode Standard.)

The set of characters from U+0000 to U+FFFF is sometimes referred to as the Basic Multilingual Plane (BMP).
Characters whose code points are greater than U+FFFF are called supplementary characters. The Java platform uses the UTF-16 representation in char arrays and in the String and StringBuffer classes. In this representation, supplementary characters are represented as a pair of char values, the first from the high-surrogates range, (\uD800-\uDBFF), the second from the low-surrogates range (\uDC00-\uDFFF).

A char value, therefore, represents Basic Multilingual Plane (BMP) code points, including the surrogate code points,
or code units of the UTF-16 encoding. An int value represents all Unicode code points, including supplementary code points.
The lower (least significant) 21 bits of int are used to represent Unicode code points and the upper (most significant) 11 bits must be zero.
Unless otherwise specified, the behavior with respect to supplementary characters and surrogate char values is as follows:

The methods that only accept a char value cannot support supplementary characters.
They treat char values from the surrogate ranges as undefined characters. For example,
Character.isLetter('\uD840') returns false, even though this specific value if followed by any low-surrogate value in a string would represent a letter.
The methods that accept an int value support all Unicode characters, including supplementary characters.
For example, Character.isLetter(0x2F81A) returns true because the code point value represents a letter (a CJK ideograph).
In the Java SE API documentation, Unicode code point is used for character values in the range between U+0000 and U+10FFFF,
and Unicode code unit is used for 16-bit char values that are code units of the UTF-16 encoding. For more information on Unicode terminology, refer to the Unicode Glossary.


        http://www.unicode.org/glossary/#code_point
        Code Point. (1) Any value in the Unicode codespace; that is, the range of integers from 0 to 10FFFF16.
        (See definition D10 in Section 3.4, Characters and Encoding.) Not all code points are assigned to encoded characters.
        See code point type. (2) A value, or position, for a character, in any coded character set.
         */

        String strCakeAndChinaSymbol = "a1\uD83C\uDF81\uD83C\uDF82\uD83C\uDF83\uD83C\uDF84\uD87E\uDC1A";
        System.out.println(strCakeAndChinaSymbol);

        char[] charsFromCake = strCakeAndChinaSymbol.toCharArray();
        for (char currentChar : charsFromCake) {
            System.out.println(currentChar);
        }

        System.out.println(strCakeAndChinaSymbol.chars().count());
        System.out.println();

        strCakeAndChinaSymbol.chars().forEach(System.out::println);

        System.out.println(strCakeAndChinaSymbol.codePoints().distinct().count());
        System.out.println();

        strCakeAndChinaSymbol.codePoints().forEach(System.out::println);

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.appendCodePoint((int)'a');
        stringBuilder2.appendCodePoint((int)'1');
        stringBuilder2.appendCodePoint(0x1F381);
        stringBuilder2.appendCodePoint(0x1F382);
        stringBuilder2.appendCodePoint(0x1F383);
        stringBuilder2.appendCodePoint(0x1F384);
        stringBuilder2.appendCodePoint(0x2F81A);
        System.out.println(stringBuilder2.toString());

        String resultChar = strCakeAndChinaSymbol.chars().distinct()
                .collect(StringBuilder::new,
                        (stringBuilder1, charPoint) -> stringBuilder1.append((char) charPoint),
                        StringBuilder::append).toString();
        System.out.println(resultChar);

        String resultCodepoint = strCakeAndChinaSymbol.codePoints().distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append).toString();
        System.out.println(resultCodepoint);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

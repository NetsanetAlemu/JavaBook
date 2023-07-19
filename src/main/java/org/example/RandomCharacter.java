package org.example;

public class RandomCharacter {
    public static void main(String[] args) {

        System.out.println("Random Character: " + randChar());
        System.out.println("Random Character between 0 and Z: " + randChar('0', 'Z'));
        System.out.println("Random Digit Character: " + randDigitChar());
        System.out.println("Random Lowercase Character: " + randLowerChar());
        System.out.println("Random Uppercase Character: " + randUpperChar());
    }

    // Generate random character between char 1 and char 2
    public static char randChar(char char1, char char2){
        return (char)(char1 + Math.random() * (char2 - char1 + 1));
    }

    // Generate random lowercase character
    public static char randLowerChar() {
        return randChar('a', 'z');
    }

    // Generate random uppercase character
    public static char randUpperChar() {
        return randChar('A', 'Z');
    }

    // Generate random digit character
    public static char randDigitChar(){
        return randChar('0', '9');
    }

    // Generate random character
    public static char randChar(){
        return randChar('\u0000', '\uFFFF');
    }
}

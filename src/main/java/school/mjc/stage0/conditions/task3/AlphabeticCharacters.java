package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'o'
                || character == 'u' || character == 'i' || character == 'A' || character == 'O'
                || character == 'E' || character == 'I' || character == 'U') {
            System.out.println("Vowel");
        } else if (((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
                && character != 'a' && character != 'e' && character != 'i' && character != 'o'
                && character != 'u' && character != 'A' && character != 'E' && character != 'I'
                && character != 'О' && character != 'U') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        AlphabeticCharacters alphabeticCharacters = new AlphabeticCharacters();
        alphabeticCharacters.vowelDeterminer('a');
        alphabeticCharacters.vowelDeterminer('b');
        alphabeticCharacters.vowelDeterminer('$');
    }
}

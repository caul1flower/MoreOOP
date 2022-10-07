package lotr;

import java.util.Random;

public class CharacterFactory {
    //- methods: Character createCharacter() {
    //                returns random instance of any existing character
    //              }
    public Character createCharacter() {
        String[] characters =  {"Hobbit", "Elf", "King", "Knight"};
        int rnd = new Random().nextInt(characters.length);
        String chosenChar = characters[rnd];

        if (chosenChar.equals("Hobbit")) return new Hobbit();
        else if (chosenChar.equals("Elf")) return new Elf();
        else if (chosenChar.equals("King")) return new King();
        else return new Knight();
    }
}
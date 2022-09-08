package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        new WordsBuilder().buildPhrase();
    }
    public void buildPhrase(char... chars) {
        int length = chars.length;
        System.out.print(String.valueOf(chars));
        }
    }

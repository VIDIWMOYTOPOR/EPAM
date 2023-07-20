package AggregationAndComposition;

import java.util.ArrayList;
import java.util.List;

public class ex_1 {
    public static void main(String[] args) {
        class Word {
            private String word;

            public Word(String word) {
                this.word = word;
            }

            public String getWord() {
                return word;
            }
        }

        class Sentence {
            private List<Word> words;

            public Sentence(String sentence) {
                words = new ArrayList<>();
                String[] wordsArray = sentence.split(" ");
                for (String word : wordsArray) {
                    words.add(new Word(word));
                }
            }

            public String getSentence() {
                StringBuilder sb = new StringBuilder();
                for (Word word : words) {
                    sb.append(word.getWord()).append(" ");
                }
                return sb.toString().trim();
            }
        }

        class Text {
            private String title;
            private List<Sentence> sentences;

            public Text(String title) {
                this.title = title;
                this.sentences = new ArrayList<>();
            }

            public void addSentence(Sentence sentence) {
                sentences.add(sentence);
            }

            public void appendText(String text) {
                Sentence newSentence = new Sentence(text);
                sentences.add(newSentence);
            }

            public void printText() {
                System.out.println(getTitle());
                for (Sentence sentence : sentences) {
                    System.out.print(sentence.getSentence() + " ");
                }
                System.out.println();
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        Text text = new Text("My Text");

        Sentence sentence1 = new Sentence("This is the first sentence.");
        text.addSentence(sentence1);

        Sentence sentence2 = new Sentence("Here is another sentence.");
        text.addSentence(sentence2);

        text.appendText("And this is a new addition to the text.");

        text.printText();
    }
}

package RegularExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex_1 {
    public static void main(String[] args) {
        String text = "This is the first paragraph. It contains multiple sentences. And here is the second paragraph, shorter.";

        String sortedParagraphs = sortParagraphsBySentenceCount(text);
        System.out.println("Сортировка абзацев по количеству предложений:\n" + sortedParagraphs);

        String sortedSentences = sortWordsInSentencesByLength(text);
        System.out.println("Сортировка слов в предложении по длине:\n" + sortedSentences);

        String sortedLexemes = sortLexemesInSentenceBySymbolCount(text, 'e');
        System.out.println("Сортировка лексем в предложении по убыванию количества вхождений символа 'e':\n" + sortedLexemes);
    }

    public static String sortParagraphsBySentenceCount(String text) {
        String[] paragraphs = text.split("\n");

        Arrays.sort(paragraphs, Comparator.comparingInt(ex_1::countSentences));

        StringBuilder sortedText = new StringBuilder();
        for (String paragraph : paragraphs) {
            sortedText.append(paragraph).append("\n");
        }

        return sortedText.toString();
    }

    public static String sortWordsInSentencesByLength(String text) {
        Pattern sentencePattern = Pattern.compile("[^.!?]+");
        Matcher sentenceMatcher = sentencePattern.matcher(text);

        StringBuilder sortedText = new StringBuilder();
        while (sentenceMatcher.find()) {
            String sentence = sentenceMatcher.group();
            String[] words = sentence.trim().split("\\s+");

            Arrays.sort(words, Comparator.comparingInt(String::length));

            StringBuilder sortedSentence = new StringBuilder();
            for (String word : words) {
                sortedSentence.append(word).append(" ");
            }

            sortedText.append(sortedSentence.toString().trim()).append(". ");
        }

        return sortedText.toString();
    }

    public static String sortLexemesInSentenceBySymbolCount(String text, char symbol) {
        Pattern sentencePattern = Pattern.compile("[^.!?]+");
        Matcher sentenceMatcher = sentencePattern.matcher(text);

        StringBuilder sortedText = new StringBuilder();
        while (sentenceMatcher.find()) {
            String sentence = sentenceMatcher.group();
            String[] lexemes = sentence.trim().split("\\s+|(?=[^\\p{L}])|(?<=[^\\p{L}])");

            Arrays.sort(lexemes, (a, b) -> {
                int countA = countSymbolOccurrences(a, symbol);
                int countB = countSymbolOccurrences(b, symbol);
                if (countA != countB) {
                    return Integer.compare(countB, countA);
                } else {
                    return a.compareTo(b);
                }
            });

            StringBuilder sortedSentence = new StringBuilder();
            for (String lexeme : lexemes) {
                sortedSentence.append(lexeme);
            }

            sortedText.append(sortedSentence.toString()).append(". ");
        }

        return sortedText.toString();
    }

    public static int countSentences(String paragraph) {
        Pattern sentencePattern = Pattern.compile("[^.!?]+");
        Matcher sentenceMatcher = sentencePattern.matcher(paragraph);

        int count = 0;
        while (sentenceMatcher.find()) {
            count++;
        }

        return count;
    }

    public static int countSymbolOccurrences(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}

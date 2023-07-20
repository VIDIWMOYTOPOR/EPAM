package RegularExpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex_2 {
    public static void main(String[] args) {
        String filePath = "C:\\Education\\practice\\Strings_3\\src\\RegularExpressions\\file.xml";
        String xml = readXmlFromFile(filePath);
        if (xml != null) {
            analyzeXml(xml);
        }
    }

    public static String readXmlFromFile(String filePath) {
        StringBuilder xmlContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlContent.append(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return null;
        }
        return xmlContent.toString();
    }

    public static void analyzeXml(String xml) {
        String openingTagPattern = "<(\\w+)[^>]*>"; // Открывающий тег
        String closingTagPattern = "</(\\w+)>"; // Закрывающий тег
        String emptyTagPattern = "<(\\w+)[^>]*\\/>"; // Тег без тела
        String contentPattern = ">([^<]+)<"; // Содержимое тега

        Pattern openingTagPatternCompiled = Pattern.compile(openingTagPattern);
        Pattern closingTagPatternCompiled = Pattern.compile(closingTagPattern);
        Pattern emptyTagPatternCompiled = Pattern.compile(emptyTagPattern);
        Pattern contentPatternCompiled = Pattern.compile(contentPattern);

        Matcher matcher = openingTagPatternCompiled.matcher(xml);
        while (matcher.find()) {
            String tag = matcher.group(1);
            System.out.println("Открывающий тег: " + tag);
        }

        matcher = closingTagPatternCompiled.matcher(xml);
        while (matcher.find()) {
            String tag = matcher.group(1);
            System.out.println("Закрывающий тег: " + tag);
        }

        matcher = emptyTagPatternCompiled.matcher(xml);
        while (matcher.find()) {
            String tag = matcher.group(1);
            System.out.println("Тег без тела: " + tag);
        }

        matcher = contentPatternCompiled.matcher(xml);
        while (matcher.find()) {
            String content = matcher.group(1).trim();
            if (!content.isEmpty()) {
                System.out.println("Содержимое тега: " + content);
            }
        }
    }
}

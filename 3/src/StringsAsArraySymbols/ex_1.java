package StringsAsArraySymbols;

import java.util.Arrays;

public class ex_1 {
    public static void main(String[] args) {
        String[] camelCaseVariables = {"myVariable", "anotherVariable", "someVariableName"};

        System.out.println(Arrays.toString(convertToSnakeCase(camelCaseVariables)));
    }

    public static String[] convertToSnakeCase(String[] camelCaseVariables) {
        String[] snakeCaseVariables = new String[camelCaseVariables.length];

        for (int i = 0; i < camelCaseVariables.length; i++) {
            String camelCase = camelCaseVariables[i];
            StringBuilder snakeCase = new StringBuilder();

            for (int j = 0; j < camelCase.length(); j++) {
                char c = camelCase.charAt(j);

                if (Character.isUpperCase(c)) {
                    snakeCase.append("_").append(Character.toLowerCase(c));
                } else {
                    snakeCase.append(c);
                }
            }

            snakeCaseVariables[i] = snakeCase.toString();
        }

        return snakeCaseVariables;
    }
}

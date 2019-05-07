package maintask2.task3;

public class CheckVowel {
    public static boolean check1(char c) {
        boolean result;
        switch (c) {
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'o':
            case 'i':
            case 'A':
            case 'E':
            case 'Y':
            case 'U':
            case 'O':
            case 'I':
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }

    public static boolean check2(char c) {
        boolean result = false;
        if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u' || c == 'y'
                || c == 'A' || c == 'I' || c == 'U' || c == 'O' || c == 'E' || c == 'Y') {
            result = true;
        }
        return result;
    }

    public static boolean check3(char c) {
        boolean result = false;
        String vowels = "AEYUIOaeyuio";
        char[] vowelsChars = vowels.toCharArray();
        for (char symbol : vowelsChars) {
            if (symbol == c) {
                result = true;
            }
        }
        return result;
    }

    public static boolean check4(char c) {
        boolean result = false;
        String vowels = "AEYUIOaeyuio";
        if (vowels.indexOf(c) != -1) {
            result = true;
        }
        return result;
    }
}

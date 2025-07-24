import java.util.*;

public class ValidStepWords {
    public static List<String> getValidStepWords(String word, List<String> dictionary) {
        List<String> result = new ArrayList<>();
        int[] baseFreq = getFrequency(word);

        for (String dictWord : dictionary) {
            if (dictWord.length() != word.length() + 1) continue;
            int[] dictFreq = getFrequency(dictWord);
            int extraCount = 0;
            boolean isValid = true;

            for (int i = 0; i < 26; i++) {
                if (dictFreq[i] < baseFreq[i]) {
                    isValid = false;
                    break;
                }
                extraCount += dictFreq[i] - baseFreq[i];
            }

            if (isValid && extraCount == 1) result.add(dictWord);
        }

        return result;
    }

    private static int[] getFrequency(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        return freq;
    }
}

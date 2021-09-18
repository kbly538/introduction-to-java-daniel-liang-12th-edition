package utilities;

public class ArrayOps {
    /**
     * Shifts an array starting from indexStart to indexEnd and put the initial element at the startIndex
     * to the end of the array.
     *
     * @param list       to be shifted
     * @param indexStart index for shifting
     * @param indexEnd   index for shifting
     */
    public static void shiftArray(int[] list, int indexStart, int indexEnd) {
        int temp = list[indexStart];

        for (int i = indexStart + 1; i <= indexEnd; i++) {
            list[i - 1] = list[i];
        }
        list[indexEnd] = temp;
    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean notPresent = true;
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            notPresent = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    notPresent = false;
            }
            if (notPresent) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentical(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] != array2[i])
                    return false;
            }
        }
        return true;
    }

    public static String sortString(String s) {
        char[] str = s.toCharArray();
        String result = "";
        boolean completed = true;
        for (int i = 1; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (str[j - 1] > str[j]) {
                    char temp = str[j - 1];
                    str[j - 1] = str[j];
                    str[j] = temp;
                    i = 1;
                    completed = false;
                    break;
                }
                completed = true;
            }
            if (completed) {
                for (int j = 0; j < str.length; j++) {
                    result += str[j];
                }
                return result.trim();

            } else {
                i = 0;
            }
        }
        return result;
    }
}

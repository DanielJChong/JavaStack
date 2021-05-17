public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        // newString.trim()
        String trimString1 = string1.trim();
        String trimString2 = string2.trim();
        // newString.concat()
        String string3 = trimString1.concat(trimString2);
        return string3;
    }

    // public Integer getIndexOrNull(String randString, char randChar) {
    //     if (randString.indexOf(randChar) == -1) {
    //         return null;
    //     }
    //     else {
    //         return randString.indexOf(randChar);
    //     }
    // }

    // public Integer getIndexOrNull(String string1, String string2) {
    //     if (string1.indexOf(string2) == -1) {
    //         return null;
    //     }
    //     else {
    //         return string1.indexOf(string2);
    //     }
    // }

    // public String concatSubstring(String string1, int first, int second, String string2) {
    //     return string1.substring(first, second).concat(string2);
    // }
}
public class Anagram {
    /*Napisz funkcję posiadającą minimum dwa parametry. Do funkcji muszą zostać przekazane dwa "słowa",
     * na ich podstawie ma zostać zwrócona wartość logiczna czy dane słowa są anagramem czy nie*/

    public static void main(String[] args) {

        isAnagram("limak", "kamil");
        isAnagram("limasdk", "kamil");

    }

    private static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            System.out.println("Podane słowa nie są anagramem");
            return false;
        }

        char[] firstWordCharTable = firstWord.toCharArray();
        char[] secondWordCharTable = secondWord.toCharArray();

        sortCharTable(firstWordCharTable);
        sortCharTable(secondWordCharTable);

        for (int i = 0; i < firstWordCharTable.length; i++) {
            if (firstWordCharTable[i] != secondWordCharTable[i]) {
                System.out.println("Podane słowa nie są anagramem");
                return false;
            }


            System.out.println("Podane słowa są Anagramem");
            return true;
        }
        System.out.println("Podane słowa są Anagramem");
        return true;

    }

    private static void sortCharTable(char[] charToSort) {
        for (int i = 0; i < charToSort.length; i++) {
            for (int j = 1; j < charToSort.length; j++) {
                if (charToSort[i] > charToSort[j]) {
                    char temporary = charToSort[i];
                    charToSort[i] = charToSort[j];
                    charToSort[j] = temporary;
                }
            }
        }
    }

    private static void printCharTable(char[] charToPrint) {
        for (char a : charToPrint) {
            System.out.print(a + " ");
        }
        System.out.println("------");
    }
}

import java.util.Arrays;

public class SeventhTask {
    /*
     * Napisz program, który posortuje tablicę 5 elementową rosnąco. Przykład
     * Tablica[5] = {3,2,5,4,1}
     *
     * Wybrałem algorytm bąbelkowy.
     * https://www.youtube.com/watch?v=4s44rXRdmhQ
     * */
    public static void main(String[] args) {
        int[] table = new int[]{3, 2, 5, 4, 1, 24, 55, 231, 643, 34};
        System.out.println(Arrays.toString(table));
        sort(table);
        System.out.println(Arrays.toString(table));
    }

    public static void sort(int[] tab) {
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab.length - 1; j++)
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }

    }
}

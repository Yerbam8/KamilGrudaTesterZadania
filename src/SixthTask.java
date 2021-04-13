public class SixthTask {
    /*Napisz program, który wyświetli schodki z gwiazdek z możliwością zmiany ilości tych schodków poprzez zmienną.
    Przykład:
    Liczba schodków:5
    *
    **
    ***
    ****
    *****
    * */

    public static void main(String[] args) {
        printingStar(5);
        printingStar(3);
    }

    public static void printingStar(int numberOfSteps) {
        for (int i = 1; i < numberOfSteps + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

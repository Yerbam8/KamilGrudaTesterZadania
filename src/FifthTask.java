public class FifthTask {
    /*Napisz czy liczba jest parzysta i czy jest
     większa lub równa 100. Jeśli tak niech wyświetli
     odpowiedni koumunikat, w przeciwnym razie niech wyświetli, że nie spełnia warunków*/
    public static void main(String[] args) {
        isEven(5);
        isEven(100);
        isEven(20);
        isEven(105);
        isEven(230);
        isEven(1055);
        isEven(80);
    }

    public static void isEven(int number) {
        if (number % 2 == 0 && number >= 100) {
            System.out.println("Liczba " + number + " jest parzysta oraz większa od 100. Liczba spełnia warunek");

        } else {
            System.out.println((number % 2 == 0) ? "Liczba jest parzysta, ale nie jest większa od 100." : "Liczba " + number + " nie spełnia warunków.");
        }
    }
}
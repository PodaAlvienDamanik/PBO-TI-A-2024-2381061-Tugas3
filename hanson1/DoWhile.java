package hanson1;

public class DoWhile {
    public static void main(String[] args) {
        String Kumpulanbuah[] = new String[]{"Pisang","Jeruk","Semangka","Nanas"};
        int counter = 0;

        do {
            System.out.println("Elemen ke-1 " + ": " + Kumpulanbuah[counter] );
            counter++;
        }while (counter < Kumpulanbuah.length);
    }
}

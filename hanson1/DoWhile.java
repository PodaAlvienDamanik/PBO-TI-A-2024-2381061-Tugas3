package hanson1;

public class DoWhile {
    public static void main(String[] args) {
        String kumpulanBuah[] = new String[]{"Pisang","Jeruk","Semangka","Nanas"};
        int counter = 0;

        do {
            System.out.println("Elemen ke- " + (counter+1) + ": " + kumpulanBuah[counter]);
            counter++;
        }while (counter < kumpulanBuah.length);
    }
}

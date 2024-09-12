package hanson1;

public class WhileLoop {
    public static void main(String[] args) {
        String Kumpulanbuah[] = new String[]{"Apel","Pisang","Durian","Jeruk"};
            int counter = 0;
            while (counter < Kumpulanbuah.length){
                System.out.println("Element ke-"+ (counter + 1) + ": "+ Kumpulanbuah[counter]);
                counter++;
            }
    }
}

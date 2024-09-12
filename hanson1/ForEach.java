package hanson1;

public class ForEach {
    public static void main(String[] args) {
        String Kumpulanbuah[] = new String[]{"Apel","Pisang","Durian","Jeruk"};
        for (String namabuah : Kumpulanbuah){
            if (namabuah.equals("Mangga") || namabuah.equals("Pisang")){
                continue;
            }
            System.out.println(namabuah);
        }
    }
}

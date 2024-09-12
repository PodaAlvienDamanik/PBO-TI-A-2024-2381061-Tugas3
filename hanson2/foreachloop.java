package hanson2;

public class foreachloop {
    public static void main(String[] args) {
        int[] bilangan = new int[20];
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }

        for (int angka : bilangan) {
            if (angka >= 15) {
                break;
            }
            if (angka % 3 == 0) {
                continue;
            }
            System.out.println(angka);
        }
    }
}

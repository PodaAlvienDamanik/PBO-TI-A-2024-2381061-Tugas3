package hanson2;

public class dowhileloop {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i >= 15) {
                break;
            }
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}

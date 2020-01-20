public class PrintTable{
    public static void main(String[] args) {

        System.out.printf("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3s",i);
        }

        System.out.println();
        System.out.println("------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%1s",i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3s",i * j + " ");
            }
            System.out.println();
        }
    }
}

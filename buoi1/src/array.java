public class array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        int[][] matrix = {
                {1, 2, 33},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int tong = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                tong += matrix[i][j];
            }
        }
        System.out.printf("Tong ma tran la: %d", tong);
        System.out.println();
        int tong2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            tong2 += matrix[i][i];
        }
        System.out.printf("Tong duong cheo chinh la: %d", tong2);
        System.out.println();
        int tong3 = 0;
        for (int i = 0; i < matrix.length; i++) {
            tong3 += matrix[i][matrix.length - i - 1];
        }
        System.out.printf("Tong duong cheo chinh la: %d", tong3);
        System.out.println();


    }
}

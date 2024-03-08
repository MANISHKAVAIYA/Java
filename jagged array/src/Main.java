public class Main {
    public static void main(String[] args) {
        int[][] jag={
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12}
        };
        System.out.println("Element of Jagged Array :");
        for (int i = 0; i < jag.length; i++) {
            for (int j = 0; j < jag[i].length; j++) {
                System.out.print(jag[i][j] + " ");
            }
            System.out.println();
        }
    }
}
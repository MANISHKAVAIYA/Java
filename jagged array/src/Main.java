public class Main {
    public static void main(String[] args) {
        int[][] arr=new int[2][];
        arr[0]=new int[]{11,22,33,44,55};
        arr[1]=new int[]{1,2,3,4,5};
        //loop add
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
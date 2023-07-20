package ArraysOfArrays;

public class ex_10 {
    public static void main(String[] args) {
        int[][] arr = {
                {-1,-2,-3,-4 },
                {-2,2,-3,-5},
                {-1,-1,-1,-1},
                {-1,-1,-1,1}
        };

        for(int i = 0; i < arr.length; i++){
            if(arr[i][i] > 0 ){
                System.out.print(arr[i][i] + " ");
            }
        }
    }
}

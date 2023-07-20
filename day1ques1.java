import java.util.*;
public class day1ques1 {
    public static void setZeroes(int[][] matrix) {
        Vector<Vector<Integer>> v = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0)
                {
                    v2 = new Vector<>();
                    v2.add(i);
                    v2.add(j);
                    v.add(v2);
                    
                }
                
            }
        }
        for(int i=0;i<v.size();i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][v.get(i).get(1)] == 0)
                continue;
                matrix[j][v.get(i).get(1)]=0;
            }
            for(int k=0;k<matrix[0].length;k++){
                if(matrix[v.get(i).get(0)][k] == 0)
                continue;
                matrix[v.get(i).get(0)][k]=0;
            }
        }
        return;
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][]= new int[n][m];
            for(int i =0;i< n;i++){
                for(int j =0; j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            setZeroes(arr);
        }
        
       
}
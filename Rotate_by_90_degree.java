public class Rotate_by_90_degree {
    static void rotateby90(int mat[][], int n) 
    { 
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        for(int i=0; i<n; i++){
            int u = 0;
            int d = n-1;
            
            while(u<d){
                int temp = mat[u][i];
                mat[u][i] = mat[d][i];
                mat[d][i] = temp;
                u++;
                d--;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}

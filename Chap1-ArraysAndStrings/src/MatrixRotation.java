package oneAway;

public class MatrixRotation {
	public void rotate(int[][] matrix){
		int n=matrix.length;
		for(int l=0;l<n/2;l++){
			int first=l;
			int last=n-1-l;
			for(int i=first;i<last;i++){
				int offset=i-first;
				int top=matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String args[]){
		MatrixRotation mr= new MatrixRotation();
		int mat[][]={{1,2,4},{5,6,7},{8,9,10}};
		int n=mat.length;
		System.out.println(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]);
			}
			System.out.print("\n");
		}
		mr.rotate(mat);
	}

}

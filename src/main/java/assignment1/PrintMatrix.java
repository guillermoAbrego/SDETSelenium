package assignment1;

public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int matrix[][] = new int[10][10];
        //llenando matrix
        for(int i = 0; i < 10; i++)
        {
        	for(int j = 0; j < i+1; j++)
        	{
        		matrix [i][j] = 0;
        	}
        }
        //imprimir matrix
        for(int a = 0; a <10; a++) {
			for(int b = 0; b < a+1; b++) {
				System.out.print(matrix[a][b]);
			}
			System.out.println();
		}
	}

}

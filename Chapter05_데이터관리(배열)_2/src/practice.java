import java.util.Random;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int row = 16;
		int column = 16;
		
		int[][] matrix = new int[row][column];
		for(int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				matrix [i][j]=r.nextInt(10);
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
		    System.out.println(java.util.Arrays.toString(matrix[i]));
		}
		
		System.out.println();
		
		
		boolean changed = true;
		while (changed) {
		    changed = false;
		    for (int i = 0; i < matrix.length; i++) {
		    	for (int k = 0; k < matrix[i].length; k++) {
		        	for (int j = 1; j < matrix[i].length; j++) {
		            	if (matrix[i][j] < matrix[i][j-1]) {
		                	int temp = matrix[i][j];
		                	matrix[i][j] = matrix[i][j-1];
		                	matrix[i][j-1] = temp;
		                	changed = true;
		            	}
		        	}
		    	}
			}
		
			for (int j = 0; j < matrix[0].length; j++) {
				for (int k = 0; k < matrix.length; k++) { 
		    		for (int i = 1; i < matrix.length; i++) {
		        		if (matrix[i][j] > matrix[i-1][j]) {
		        			int temp = matrix[i][j];
		                	matrix[i][j] = matrix[i-1][j];
		                	matrix[i-1][j] = temp;
		                	changed = true;
		            	}
		        	}
		    	}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
		    System.out.println(java.util.Arrays.toString(matrix[i]));
		}
		
		
	}

}

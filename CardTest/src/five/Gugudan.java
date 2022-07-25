package five;

public class Gugudan {

	int[][] guguDan = new int[10][9];

	void gugu(int a) { 
	for(int i = a; i == a; i++) {
		for(int j = 0; j < 9; j++) {
			guguDan[i][j] = (i)*(j+1);
			System.out.print(i + " * " + (j+1) 
					+ " = " + guguDan[i][j]+"\t");
		}
		System.out.println();
		}
	}
	
	void gugu2(int a) {
		for(int i = a; i == a; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(i + " * " + (j+1) + " = " + i*(j+1) + "\t");
			}
		}
	}
}
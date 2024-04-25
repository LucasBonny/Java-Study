package matriz;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[l][c];
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int vlr = sc.nextInt();
		for(int i = 0; i < l; i ++) {
			for (int j = 0; j < c; j++) {
				if(mat[i][j] == vlr) {
					System.out.println("Position "+ i + "," + j +":");
					if(j-1 >= 0) {
						System.out.printf("Left: %d\n", mat[i][j-1]);
					}
					if(j+1 <= c -1) {
						System.out.printf("Right: %d\n", mat[i][j+1]);
					}
					if(i-1 >= 0) {
						System.out.printf("Up: %d\n", mat[i-1][j]);
					}
					if(i+1 <= l -1) {
						System.out.printf("Down: %d\n", mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}

}

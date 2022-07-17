package Pattern;

public class Patterns {

	/*
	 * Star pattern
	 *****
	 *****
	 *****
	 *****
	 *****
	 */
	public void startPattern(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/*
	 * Right Angle Triangle Pattren
	 * 
	 * * * * * * * * * * *
	 * 
	 * 
	 */

	public void rightAngleTrianglePattern(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/*
	 * 
	 * * * * * * * *
	 *
	 */
	public void downWardrightAngleTrianglePattern(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/*
	 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
	 */
	public void numberRightAngleTrianglePattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	/*
	 * 
	 * * * * * * * * * * * * * * * * *
	 * 
	 */

	public void symetricRightAngleTrianglePattern(int n) {

		for (int row = 1; row <= 2 * n; row++) {
			int print = row > n ? 2 * n - row : row;
			for (int col = 1; col <= print; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/*
	 * 
	 * * * * * * * * * * *
	 * 
	 * 
	 */
	/*
	 * if we change space near star
	 * 
	 * * * * * * * * * * *
	 */

	public void rightRightAngleTrianglePattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space < n - row + 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/*
	 ****
	  ***
	   **
	    *
	*/

	/*
	 * if we change space near Star * * * * * *
	 * 
	 */

	public void reversableRightTrianglepattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/*
	*
	***
	*****
	*******
	*********
	*/
	public void cristmasTriangle(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}

			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	/*
	*********
	 *******
	  *****
	   ***
	    *
	*/
	public void reverseCristmasTriangle(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * n - (2 * row - 1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 *****
	 * * * *
	 *****
	 */
	public void holloSquare(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == n || col == 1 || col == n || row == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	/*
	 *
	 * 
	 * * * *
	 *********
	 */
	public void holloTriangle(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				if (row == n || col == 1 || col == 2 * row - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*
	 *********
	 * * * *
	 *
	 */

	public void hollReverseTriangle(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * n - (2 * row - 1); col++) {
				if (row == 1 | col == 1 || col == 2 * n - (2 * row - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	/*
	 * 
	 * * * * * * * * * * * * * * * * *
	 * 
	 */

	public void dimondPattern(int n) {

		for (int row = 1; row <= 2 * n; row++) {
			int printCol = row > n ? 2 * n - row : row;
			int printSpace = n - printCol;
			for (int space = 1; space <= printSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= printCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void mountainPattern(int n){
		for(int row=1;row<=n;row++){
			for(int space=;space<=;space++){
				System.out.print(" ");
			}
			for(int col=1;col<=;col++){
				System.out.print("*");
			}
		}
	}

	public void binaryPattern(int n) {
		for (int row = 1; row <= n; row++) {
			int num;
			if (row % 2 == 0) {
				num = 0;
				for (int col = 1; col <= n; col++) {
					System.out.print(num);
					num=(n==0)?1:0;
				}
			} else {
				num = 1;
				for (int col = 1; col <= n; col++) {
					System.out.print(num);
					num = (num==0)?1:0;
				}
			}
			System.out.println();
		}
	}

	/*
	 * 1 212 32123 4321234 543212345
	 */
	public void numberPrymid(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	/*
	 * 1 212 32123 4321234 543212345 4321234 32123 212 1
	 */

	public void dimondNumberPrymid(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int print = row > n ? 2 * n - row : row;
			for (int space = 1; space <= n - print; space++) {
				System.out.print(" ");
			}

			for (int col = print; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= print; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	/*
	 * 111111111 122222221 123333321 123444321 123454321 123444321 123333321
	 * 122222221 111111111
	 */

	public void sprialPattern(int n) {
		n = 2 * n;
		for (int row = 1; row < n; row++) {
			for (int col = 1; col < n; col++) {
				int print = Math.min(Math.min(col, row), Math.min(n - col, n - row));
				System.out.print(print);
			}
			System.out.println();
		}
	}

	/*
	 * 111111111 122222221 123333321 123444321 123454321 123444321 123333321
	 * 122222221 111111111
	 * 
	 */

	public void maxSprialPattern(int n) {
		int max = n;
		n = 2 * n;
		for (int row = 1; row < n; row++) {
			for (int col = 1; col < n; col++) {
				int print = max - Math.min(Math.min(col, row), Math.min(n - col, n - row));
				System.out.print(print);
			}
			System.out.println();
		}
	}

	/*
	 * * * * * * * * * * *
	 * 
	 * 
	 * * * * * * * * * * *
	 */

	public void sandClock(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int print = row > n ? row - n : n - row + 1;
			int printSpace = n - print;
			for (int space = 1; space <= printSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= print; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

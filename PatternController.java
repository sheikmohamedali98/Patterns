package Pattern;

import java.util.Scanner;

public class PatternController {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		Patterns pattern = new Patterns();
		int n = scan.nextInt();
//		pattern.startPattern(n);
//		pattern.rightAngleTrianglePattern(n);
//		pattern.downWardrightAngleTrianglePattern(n);
//		pattern.numberRightAngleTrianglePattern(n);
//		pattern.symetricRightAngleTrianglePattern(n);
//		pattern.rightRightAngleTrianglePattern(n);
//		pattern.reversableRightTrianglepattern(n);
//		pattern.cristmasTriangle(n);
//		pattern.reverseCristmasTriangle(n);
//		pattern.holloTriangle(n);
//		pattern.dimondPattern(n);
//		pattern.numberPrymid(n);
//		pattern.dimondNumberPrymid(n);
//		pattern.sprialPattern(n);
//		pattern.sandClock(n);
//		pattern.holloSquare(n);
//		pattern.hollReverseTriangle(n);
		pattern.binaryPattern(n);
	}

}

package Demo;

public class practicBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 127;
		++a;
		++a;
		++a;
		System.out.println(a);
		
		
		int b = 10;
		int c = 15;
		b = b^c;
		c = b^c;
		b = b^c;
		
		System.out.println("After swap "+"b  "+b+" c  "+c);
		
		
		
		int even = c&1;
		int odd = b&1;
		if(even == 0) {
		System.out.println("given number is even");
		}else {
			System.out.println("given number is add");

		}
		
		//Dilt operator
		System.out.println(~b);
		int d = -10;
		System.out.println("Dilt "+~d);
		System.out.println("right shift + sign");
		
		//right Shift + sign
		System.out.println(10>>2);
		System.out.println(10>>3);
		System.out.println(20>>2);
		System.out.println(15>>4);
		
		
		System.out.println("right shift - sigh");
		
		//right Shift - sign
				System.out.println(-10>>2);
				System.out.println(-10>>3);
				System.out.println(-20>>2);
				System.out.println(-15>>4);
				
				System.out.println("left  shift + sigh");

				
				//left Shift + sign
				System.out.println(10<<2);
				System.out.println(10<<3);
				System.out.println(20<<2);
				System.out.println(15<<4);
				
				
				System.out.println("left  shift - sigh");
				
				//left Shift - sign
						System.out.println(-10<<2);
						System.out.println(-10<<3);
						System.out.println(-20<<2);
						System.out.println(-15<<4);

		
		System.out.println(Integer.toBinaryString(-2>>>2) + " " + (-2>>>2));
		
		System.out.println("Array remove Dublicate");
		
		int[] arr = {1,1,2,2,3,3,5,5,4,4,9};
		int separate = 0;
		for(int i=0;i<arr.length;i++) {
			 separate = separate ^ arr[i];
		}
		System.out.println(separate);
	}

}



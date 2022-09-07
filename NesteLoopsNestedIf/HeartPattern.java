package NesteLoopsNestedIf;


/*
        A
       BBB
      CCCCC
     DDDDDDD
    EEEEEEEEE
   FFFFFFFFFFF
  GGGGGGGGGGGGG
 HHHHHHHHHHHHHHH
IIIIIIIIIIIIIIIII
 JJJJJJ  JJJJJJ
  KKKK    KKKK
   LL      LL
*/
public class HeartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Enter even Number
		printPattern(20);
	}
	
	private static void printPattern(int totalSize) {
		
		
		int smallSize = totalSize/2;
		int lastTri = (smallSize/2)-1;
		char ch ='A';
		int n =1;
		
		for(int i=1;i<smallSize;i++) {
			int space = (totalSize-1)/2;
			for(int j=0;j<space-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print(ch);
				
			}
			ch++;
			System.out.println();
		}
		

		
		
		for(int i=1;i<=lastTri;i++) {
			for(int space =0;space<i;space++) {
				System.out.print(" ");
			}
			for(int print=0;print<(2*lastTri-(2*i));print++) {
				System.out.print(ch);
			}
			for(int space =0;space<2*i;space++) {
				System.out.print(" ");
			}
			for(int print=0;print<(2*lastTri-(2*i));print++) {
				System.out.print(ch);
			}
			
			ch++;
			System.out.println();
		}
		
		
	}
	

}

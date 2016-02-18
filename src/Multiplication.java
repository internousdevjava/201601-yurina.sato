public class Multiplication {
    public static void main(String args[]) {
    	System.out.println("\n九九表\n\n[the multiplication table]\n---\n");
    	for( int i=1; i<=9; i++ ) {
    		for( int j=1; j<=9; j++ ) {
    			if(i*j<=9) System.out.print(" ");
    			System.out.print((i*j) + " ");
			}
    		System.out.println();
		}
	}
}
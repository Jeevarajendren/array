package tcl;

public class Class {
	public static void main(String[] args) {
		int [][] a = new int [2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][1]=30;
		a[1][0]=10;
		int length = a.length;
		System.out.println(length);
	
		
		       //1        2           7
		for (int i = 0; i < a.length; i++) {
			  //3             4              6
			for (int j = 0; j < a[i].length; j++) {
				// 5
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		
		}
		System.out.println();
		
		for (int[] i : a) {
			for (int j : i) {
				System.out.print(j+" ");
				
				
			}
			System.out.println();
			
		}
	
	}

}

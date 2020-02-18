package Example;

public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0,3,7,0,2,0};
		
		int tmp = 0;
		
		
		for(int i = 0; i <x.length-1; i++) {
			for(int j=1; j<x.length-i;j++) {
				if(x[j] == 0) {
					tmp = x[j-1];
					x[j] = tmp;
					x[j-1] = 0;
				}
			}
		}
		
		
		for(int i =0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
}

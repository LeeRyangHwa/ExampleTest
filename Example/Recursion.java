package Example;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Function(4);
		System.out.println(x);
	}
	public static int Function(int n) {
		if(n <=1) {
			return n;
		}else
			return Function(n-1)*n;
	}
}

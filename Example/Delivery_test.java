package Example;

public class Delivery_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {{1,5},{8,3},{4,2},{2,3},{3,1},{3,2},{4,2},{5,2},{4,1}};
		int value = Delivery(x);
		
		System.out.println("return 값 : "+value);
	}
	public static int Delivery(int[][] delivery) {
		int answer = 0;
		int size = delivery.length;
		int line =  (int) Math.sqrt(size);
		System.out.println("행,열 :"+line+"x"+line);
		
		int x =0, y=0;
		int count = 0;
		int tip = 0;
		
		int index = x*line+y;
		
		tip += delivery[index][1];
		System.out.println(tip);
		
		int Maxtime = 0, time = 0;
		for(int[] a : delivery) {
			if(a[0]>Maxtime) {
				Maxtime = a[0];
			}
		}
		
		while(Maxtime > time) {
			time++;
			count++;
			int min = Maxtime+1;
			int n = 0;
			for(int[] a : delivery) {
				n++;
				if(a[0]>min) {
					min = a[0];
					x = n;
				}
			}
			 
			
		}
		
		System.out.println(time);
		
		return answer;
	}
}

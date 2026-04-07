package ArrayLearn;

public class Arraysum {

	public static void main(String[] args) {
		int [] arr= {5,2,4,1,5};
		int sum =0;

		for(int i=0;i<arr.length;i++) {
               sum= sum +arr[i];
               
		}		
		System.out.println("Total ="+ sum);
	}
}

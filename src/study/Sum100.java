package study;

public class Sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int j = 0, k = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i; // sum = sum + i;

			if ((i % 2) == 0) {
				j = j + i;
			} else {
				k = k + i;
			}
		}
		System.out.println(sum);
		System.out.println(j);
		System.out.println(k);
		
		int i=1;
		int count=0;
		while (i<=130) {
			System.out.print(i+"\t");
			i++;
			count++;
			 
			if (count==5) {
				System.out.println();
				count=0;
			}
			
		}
		

	}

}

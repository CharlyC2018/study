package array;

public class Test02 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		Man men[] = { new Man(1, 11), new Man(2, 22) };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < men.length; i++) {
			System.out.print(men[i].getAge() + " ");
			System.out.print(men[i].getId() + " ");
			System.out.println();
		}

		@SuppressWarnings("unused")
		int b[] = new int[2];// Ĭ��ֵ:0,0
		
		@SuppressWarnings("unused")
		boolean c[] = new boolean[2];// Ĭ��ֵ:false,false
		
		String d[] = new String[2];// Ĭ��ֵ:null,null
		
		/*
		 * for-each��ר�����ڶ�ȡ��������������е�Ԫ��
		 * for-each��ǿforѭ���ڱ�����������в����޸�������ĳԪ�ص�ֵ
		 * for-each�������ڱ��������漰�й������Ĳ���
		 *  
		 * */
		d[0]="aa";
		d[1]="bb";
		for (String temp : d) {
			System.out.println(temp);
		}
	}
}
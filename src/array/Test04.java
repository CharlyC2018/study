package array;

//�������鿽��
public class Test04 {
	public static void main(String[] args) { 
		String[] s = { "����", "��ѧ��", "����", "�Ѻ�", "��Ѷ", "�ֽ�" };
		String[] sBak = new String[7];
		
		System.arraycopy(s, 0, sBak, 0, s.length);
		
		for (int i = 0; i < sBak.length; i++) {
			System.out.println(sBak[i] + "\t");
		}
	}
}
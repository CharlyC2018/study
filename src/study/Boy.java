package study;

import encapsulation.Person;

public class Boy extends Person {

	public void play() {
		System.out.println(super.testProtected);
		System.out.println(super.testPublic);

		Person p = new Person();
		System.out.println(p.testPublic);
		// ����protected������ϸ��
		// �������������ͬһ�����У�����ɷ��ʸ���/��������protected��Ա
		// ����������಻��ͬһ�����У�����ɷ��ʸ����protected��Ա
		// ���ǲ��ܷ��ʸ�������protected��Ա
	}
}
package study;

public class Dog{
   public Dog(String name){
      //�������������һ��������name
      System.out.println("С���������� : " + name ); 
   }
   public static void main(String[] args){
      // �������佫����һ��Puppy����
      Dog myDog = new Dog( "tommy" );
      System.out.println(myDog);
   }
}
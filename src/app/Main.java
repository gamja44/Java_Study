package app;

import pack1.A;
import pack2.B;

public class Main {

	public static void main(String[] args) {
		//라이브러리에서 가져온 A클래스 사용
		//my_lib에 있는 라이브러리 파일을 이용
		//A클래스의 a변수를 사용 = new라는 객체생성연산자를 이용하고 A();라는 생성자를 호출하는 코드를 적어준다.
		//마지막에 .와 같은 뜻인 ; 세미콜론을 이용하여 문장을 완성시켜준다.
	    //힙영역에 객체를 생성해서 주소번지를 a라는 변수가 참조한다.
		//A클래스에 있던 method()를 호출하는 코드를 적어준다.
		A a = new A();
		a.method(); //결과값:A-method실행
		
		//라이브러리에서 가져온 B클래스 사용
		B b = new B();
		b.method(); //결과값:B-method실행
		
	}

}

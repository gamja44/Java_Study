package app;

//일반 예외로 선언 - extends키워드를 사용해서 Exception상속해서 일반예외로 선언
public class InsufficientException extends Exception{
	public InsufficientException(){
		//기본생성자
	}
	
	public InsufficientException(String message) {
		//메시지를 매개값으로 받는 생성자 
		super(message);
	}
}

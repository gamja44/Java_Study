package app;

public class Account {
	private long balance;
	
	public Account() {
		//기본생성자 선언
	}
	
	public long getBalance() {
		//getter메서드 사용해서 private필드인 balance를 리턴해준다.
		//즉, 읽기 전용이라고 생각하면 된다.
		return balance;
	}
	
	public void deposit(int money) {
		//잔고에 돈이 들어오면 balance에 들어오게 선언
		//입금하는 메서드 선언
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException{
		//직접 일반예외로 선언한 잔고부족예외로 throws키워드를 사용해서 선언
		//사용자 정의 예외를 직접 코드에서 발생시키기위해서 throw키워드와 함께 예외 객체를 제공 및 호출	
		//출금하는 메서드 선언
		if(balance < money) {
			//직접 코드에서 예외 발생시키기
			System.out.println(this.getBalance() + "현재 잔고");
			throw new InsufficientException("잔고 부족" + (money-balance) + " 모자람");
		}
		balance -= money;
		System.out.println("출금 후 현재 잔고 " + this.getBalance());
	}
	
}

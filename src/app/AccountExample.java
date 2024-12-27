package app;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(1000);
		System.out.println("잔액" + account.getBalance());
		
		//출금하기
		try {
			System.out.println("account.withdraw메서드 호출");
			account.withdraw(500);
		}catch(InsufficientException e) {
			String message = e.getMessage();
		}

	}

}

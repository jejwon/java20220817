package ch06.book.Ex.Ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	

		public static void main(String[] args) {
			boolean run = true;
			while (run) {
				System.out.println("-----------------------------------------");
				System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
				System.out.println("------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = scanner.nextInt();
				
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				deposit();
			} else if (selectNo == 3) {
				withdraw();
			} else if (selectNo == 4) {
				run = false;
			}
		}
			System.out.println("프로그램 종료");
		}
		
		//계좌 생성하기
		private static void createAccount() {
			System.out.println("---------");
			System.out.println("계좌생성");
			System.out.println("---------");
			
			
			
			System.out.print("계좌번호: ");
			String accountNumber = scanner.next();
			System.out.print("계좌주: ");
			String owner = scanner.next();
			System.out.print("초기입금액: ");
			int balance = scanner.nextInt();
			
			
			Account account = findAccount(accountNumber); 
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
		
		
		//계좌목록보기
		private static void accountList() {
			System.out.println("---------");
			System.out.println("계좌목록");
			System.out.println("---------");
			
			for (int i = 0; i < accountArray.length && accountArray[i] != null; i++) {
				System.out.println(accountArray[i]);
				System.out.println(accountArray[i].getAno() 
						+ "\t" + accountArray[i].getOwner()
						+ "\t" + accountArray[i].getBalance());
			}
		}
		
		
		//예금하기 
		private static void deposit() {
			System.out.println("---------");
			System.out.println("예금");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String setAno = scanner.next();
			System.out.print("예금액: ");
			int setOwner = scanner.nextInt();			
			System.out.println("결과: 예금이 성공되었습니다.");
			
			
		}
		
		//출금하기
		private static void withdraw() {
			System.out.println("---------");
			System.out.println("출금");
			System.out.println("---------");
			System.out.print("계좌번호: ");
			String setAno = scanner.next();
			System.out.print("출금액: ");
			int setOwner = scanner.nextInt();			
			System.out.println("결과: 출금이 성공되었습니다.");
			
		}
		
		
		//Account배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String accountNumber) {
			Account result = null;
			for (int i = 0; i < accountArray.length && accountArray[i] != null; i++) {
				if (accountArray[i].getAno().equals(accountNumber)) {
					result = accountArray[i];
					break;
				}
			}
			return result;
		}
	}


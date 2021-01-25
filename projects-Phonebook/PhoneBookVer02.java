/*
 *전화번호부 관리 프로그램
 *Version 0.2
 */
import java.util.Scanner;

class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;

	public PhoneInfo(String name, String num, String birth)
	{
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}
	
	public PhoneInfo(String name, String num)
	{
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}

	public void showPhoneInfo()
	{
		System.out.println("name : "+name);
		System.out.println("phone : "+phoneNumber);
		if(birth!=null)
			System.out.println("birth : "+birth);
		System.out.println("");
	}
}

class PhoneBookVer02
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}

	public static void readData()
	{
		System.out.print("이름 : ");
		String name = keyboard.nextLine();
		System.out.print("전화번호 : ");
		String number = keyboard.nextLine();
		System.out.print("생년월일 : ");
		String birth = keyboard.nextLine();

		PhoneInfo info = new PhoneInfo(name, number, birth);
		System.out.println("\n 입력된 정보 출력...");
		info.showPhoneInfo();

	}
	public static void main(String[] args)
	{
		int choice;
		while(true)
		{
			showMenu();
			choice=keyboard.nextInt();
			keyboard.nextLine();

			switch(choice)
			{
				case 1:
					readData();
					break;
				case 2:
					System.out.println("프로그램을 종료합니다...");
					return;

			}
		}
	}
}
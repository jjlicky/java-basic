package hicreate;
import java.util.Scanner;

public class RandomGame {

	public static void main(String arg[]) {
		
		int random_trans;
		double random;
		int a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~50������ ���� �Է��ϼ���");
		a = scan.nextInt();
		random = Math.random();
		random_trans = (int)((random*50)+1);
		
		if(a<1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if(a>50) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if(a>random_trans) {
			System.out.println("�ٿ�");
		}else if(a<random_trans) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		System.out.println("�������� ���� ���ڴ�" + random_trans + "�Դϴ�.");
	}
}
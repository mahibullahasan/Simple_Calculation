import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		int Add,sub,Multi,Div;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		Add = a+b;
		sub = a-b;
		Multi = a*b;
		Div = a/b;
		System.out.println(Add);
		System.out.println(sub);
		System.out.println(Multi);
		System.out.println(Div);
		
		

	}

}

import java.util.Scanner;
class ascii_add
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char c = sc.next().charAt(0);
		int i = (int) c ;
		i=i+3;
		char c1 = (char) i;
		String res = String.format(" Character after ascii addition is %c",c1);
		System.out.println(res);


	}
}
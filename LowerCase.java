import java.util.Scanner;
public class LowerCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the name: ");
		int size = sc.nextInt();
		System.out.println("Enter your name: ");
		char[] name = new char[size];

		for(int  i =0; i< size;i++) {
			name[i] = sc.next().charAt(0);
		}

		System.out.println("The lowercase used in the name are:");
		for(int i =0; i< size;i++){
			if(name[i]>='a' && name[i]<='z') {
				System.out.println(name[i]);	
				}
		}
	}	
}

import java.util.Scanner;
public class CountConstVowels {

	public static void main(String[] args) {
  
        int vowels=0;
        int constant=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		System.out.println("Enter the characters: ");
		char[] chr = new char[size];

		for(int  i =0; i<size;i++) {
			chr[i] = sc.next().charAt(0);
		}

		System.out.println("The lowercase used in the characters are:");
		for(int i =0; i<size;i++){
			if(chr[i]=='a' || chr[i]=='e' || chr[i]=='i' || chr[i]=='o' || chr[i]=='u') {
				vowels++;		
			}	
			else {
				constant++;
			}
		}
		System.out.println("No Of Vowels:" +vowels);		
		{					
			System.out.println("No Of constant:" +constant);
			
		}
			  
	}	
}
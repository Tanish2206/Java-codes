import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = input.nextInt(),flag = 0;

		if(num == 1 || num == -1) {
			System.out.println("Invalid..");
			return;
		}

		for (int i = 2; i <= Math.sqrt(Math.abs(num)); i++) {
			if(num%i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("NOT PRIME\n");
		}else {
			System.out.println("PRIME\n");
		}
		input.close();
    }
   
}

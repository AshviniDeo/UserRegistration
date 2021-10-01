package bridgeLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
       String userName;
       String lastName;
       String email;
       String mobile;
      
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserRegistrationProblem user = new UserRegistrationProblem();
		System.out.println("Enter First Name :");
		user.userName = scanner.next();
		check(user.userName, "^[A-Z][a-z]{2,15}$");
		System.out.println("Enter Last Name :");
		user.lastName = scanner.next();
		check(user.lastName,"^[A-Z][a-z]{2,15}$");
		System.out.println("Enter Email :");
		user.email = scanner.next();
		check(user.email,"^[a-z.]+[@][a-z.]+[.][a-z]{2,3}$");
		System.out.println("Enter Mobile Number :");
		user.mobile = scanner.next();
		check(user.mobile,"^[1-9]{2}[1-9]{1}[0-9]{9}");
		

	}

	private static void check(String userName2, String string) {
		Pattern pattern = Pattern.compile(string);
		Matcher matcher = pattern.matcher(userName2);
		
			System.out.println(matcher.find());
		
	}

}

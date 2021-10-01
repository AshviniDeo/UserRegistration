package bridgeLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
       String userName;
       String lastName;
       String email;
       String mobile;
       String passWord;
      
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
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
		check(user.mobile,"^[1-9]{2}[\s1-9]{1}[0-9]{9}$");
		System.out.println("Enter PassWord:");
		user.passWord = scanner.next();
		check(user.passWord,"[A-Z]{1,}[a-z]{6,}[0-9]{1,}[#$&%@]{1}");*/
		validEmails();
		invalidEmail();
	}

	private static void invalidEmail() {
		System.out.println("::Invalid Email ::");
		check("abc", "[a-z][-][0-1]{3}[@][a-z.]");
		check("abc@.com.my", "[a-z][-][0-1]{3}[@][a-z][a-z.]");
		check("abc123@gmail.a", "\"[a-z][-][0-1]{3}[@][a-z.][a-z]{3}");
		
	}

	private static void validEmails() {
		System.out.println("::Valid Email::");
		check("abc@yahoo.com", "[a-z][@][a-z.]");
		check("abc-100@yahoo.com","[a-z][-][0-9]{3,}[@][a-z.]");
		check("abc.100@yahoo.com", "[a-z.][0-9]{3}[@][a-z.]+");
		check("abc111@abc.com", "[a-z][1]+[@][a-z.]");
		check("abc-100@abc.net", "[a-z][-][0-1]{3}[@][a-z.]"); 
		check("abc.100@abc.com.au", "[a-z.][0-1]{3}[@][a-z.]");
		check("abc@1.com", "[a-z][@][1][a-z.]");
		check("abc@gmail.com.com", "[a-z][@][a-z.]+");
		check("abc+100@gmail.com", "[a-z][+][0-1]{3}[@][a-z.]");
	}

	private static void check(String userName2, String string) {
		Pattern pattern = Pattern.compile(string);
		Matcher matcher = pattern.matcher(userName2);
		
			System.out.println(matcher.find());
		
	}

}

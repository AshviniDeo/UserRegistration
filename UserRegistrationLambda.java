package bridgeLab;
interface ILambada{
	String function(String str);
}
public class UserRegistrationLambda {
	
	public static void main(String[] args) {
		 ILambada name = (str)-> str.matches("^[A-Z][a-z]{2,15}$")?"Successfully Enter": "Invalid Details";
		 ILambada email = (str)-> str.matches("^[a-z.]+[@][a-z.]+[.][a-z]{2,3}$")?"Successfull": "Invalid";
		 ILambada phone = (str)-> str.matches("^[1-9]{2}[1-9]{1}[0-9]{9}$")?"Successfull": "Invalid";
		 ILambada password = (str)-> str.matches( "[A-Z]{1,}[a-z]{6,}[0-9]{1,}[#$&%@]{1}")?"Successfull": "Invalid";
		 
		System.out.println(name.function("Ashvini"));
		System.out.println(name.function("Deokate"));
		System.out.println(email.function("ashvini@gmail.com"));
		System.out.println(phone.function("917798639808"));
		System.out.println(password.function("Ashvini123@"));

	}

}

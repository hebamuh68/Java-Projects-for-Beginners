package emailApp;
import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswrodLength = 10;
	private String department;
	private String Email;
	private int mail_box_capacity = 576;
	private int capacity ;
	private String AlternateEmail;
	private String companysuffix = "aeycompany.com";
	
	
	public email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswrodLength);
		
		Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companysuffix; }
	
	
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accountant \n0 for none \nEnter the department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";} }
	
	
	
	private String randomPassword(int length) {
		String passowrdSet = "ABCDEFGHIJKLMNOPQSTYZ0123456789";
		char[] password  = new char [length];
		
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passowrdSet.length()); //random index (which is from the length :))
			password[i] = passowrdSet.charAt(rand);  // the variable of the radom index
		}
		return new String(password); }
	
	
	
	public void set_mail_box_capacity (int capacity) {
		this.mail_box_capacity = capacity; }
	
	
	
	public void set_Alternate_Email(String altEmail) {
		this.AlternateEmail = altEmail; }
	
	
	
	public void changePassword(String password) {
		this.password = password; }
	
	
	
	public int get_mail_box_capacity() {return mail_box_capacity;}  
	
	
	public String get_Alternate_Email() {return AlternateEmail;}
	
	
	public String get_password() {return  password;}
	
	
	public String showInfo() {
		return "DISPLY NAME: " + firstName + " " + lastName+
			"\nCOMPANY EMAIL: " + Email +
			"\nMAILBOX CAPACITY: " + mail_box_capacity + "nb"; }
				
}


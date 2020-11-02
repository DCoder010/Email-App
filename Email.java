package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = ".xyzcompany.com";
	
	//Constructor to ask first and last name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department
		this.department = setDepartment();
//		System.out.println("Department: " + department);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" + department + companySuffix;
//		System.out.println("Your email is: " + email);
		
		//Call a method asking for password
		this.password = randomPassword(defaultPasswordLength);
//		System.out.println("Your password is: " + password);
	}
	
	//Ask for department
	private String setDepartment()
	{
		System.out.print("New worker: " + firstName + ". DEPARTMENT CODES"
				+ "\n1 for Sales"
				+ "\n2 for Development"
				+ "\n3 for Accounting"
				+ "\n0 for None"
				+ "\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		while(deptChoice<0 || deptChoice>3)
		{
			System.out.print("Enter valid department code: ");
			deptChoice = in.nextInt();
		}
		in.close();
		if(deptChoice==1)
			return "sales";
		else if(deptChoice==2)
			return "dev";
		else if(deptChoice==3)
			return "accounting";
		else
			return "";
	}
	
	//Generate a random password
	private String randomPassword(int length)
	{
		String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++)
		{
			int randPass = (int) (Math.random()*setPassword.length());
			password[i] = setPassword.charAt(randPass);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email;
	public void setAlternateEmail(String altEmail)
	{
		alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	public int getMailBoxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		System.out.println("=======================================");
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nYOUR PASSWORD: " + password +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}

}

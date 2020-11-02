package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Deepak", "Gowda");
		
//		em1.setAlternateEmail("dg.gmail.com");
//		System.out.println("Alternate email provided: " + em1.getAlternateEmail());
		
//		em1.setMailBoxCapacity(800);
//		System.out.println("New Mailbox capacity: " + em1.getMailBoxCapacity() + "mb");
		
		System.out.println(em1.showInfo());

	}

}

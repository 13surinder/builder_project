
package builder_project;

public class Application {

	public static void main(String[] args) {
		
		User user =new User.UserBuilder("Rahul")
		.setMidName("kumar")
		.setLastName("sharma")
		.setState("himachal")
		.setPin(12321)
		.setId(101404)
		.build();
		
		System.out.println("User details --- "+user);
	}

}
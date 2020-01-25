package builder_project;

public class User {
	private int id;
	private String firstName;
	private String midName;
	private String lastName;
	private String state;
	private int pin;
	
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.midName = builder.midName;
		this.lastName = builder.lastName;
		this.id = builder.id;
		this.state = builder.state;
		this.pin = builder.pin;
	}
	
	public static class UserBuilder{
		private int id;
		private String firstName;
		private String midName;
		private String lastName;
		private String state;
		private int pin;
		
		
		
		public UserBuilder(String firstName) {
			super();
			this.firstName = firstName;
		}
		public int getId() {
			return id;
		}
		public UserBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public String getFirstName() {
			return firstName;
		}
		public UserBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public String getMidName() {
			return midName;
		}
		public UserBuilder setMidName(String midName) {
			this.midName = midName;
			return this;
		}
		public String getLastName() {
			return lastName;
		}
		public UserBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public String getState() {
			return state;
		}
		public UserBuilder setState(String state) {
			this.state = state;
			return this;
		}
		public int getPin() {
			return pin;
		}
		public UserBuilder setPin(int pin) {
			this.pin = pin;
			return this;
		}
		
		public User build() {
			return new User(this);
			
		}
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName
				+ ", state=" + state + ", pin=" + pin + "]";
	}
	
}






package users;

public class User {
	private int id;
	private String role;
	private String name;
	public User(int id, String role, String name) {
		super();
		this.id = id;
		this.role = role;
		this.name = name;
		System.out.println("User.");
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", role=" + role + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public String getRole() {
		return role;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	
	
	
}

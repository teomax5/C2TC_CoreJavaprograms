//Program to define Container class
package Day5.Association.hasa;

//Container class
public class Person {
	private int id;
	private String name;
	
	private Address address;

	public Person(int id,String name, Address address) {
		this.id=id;
		this.name = name;
		this.address = address;
	}

	// Getter and setter methods
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState()
				+ " " + address.getPostalCode());
	}
}
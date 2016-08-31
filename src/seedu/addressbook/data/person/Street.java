package seedu.addressbook.data.person;

/*
 * This contains the street portion of the address
 * 
 */

public class Street {
	
	private String streetAddress = "";
	
	public Street(String streetAddress){
		this.streetAddress = streetAddress;
	}
	
	public String getStreetAddress(){
		return this.streetAddress;
	}
}

package seedu.addressbook.data.person;
/*
 * This contains the postal portion of the address
 */

public class PostalCode {
	
	private String postalCode;
	
	public PostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
}

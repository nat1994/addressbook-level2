/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Nat
 *
 */
public class Contact {
	
	  protected String value;
	  protected boolean isPrivate;
	  
	  @Override
	    public String toString() {
	        return value;
	    }

	    @Override
	    public boolean equals(Object other) {
	        return other == this // short circuit if same object
	                || (other instanceof Address // instanceof handles nulls
	                && this.value.equals(((Address) other).value)); // state check
	    }

	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }

	    public boolean isPrivate() {
	        return isPrivate;
	    }
	    
	    public String getValue(){
	    	return value;
	    }
	    
	    public boolean getIsPrivate(){
	    	return isPrivate;
	    }
}

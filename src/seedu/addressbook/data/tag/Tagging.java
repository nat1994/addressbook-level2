package seedu.addressbook.data.tag;
import java.util.ArrayList;

import seedu.addressbook.data.person.Person;

/*
 * Represents the taggings of the people added and deleted in the order
 */
public class Tagging {
	
	private String name;
	private String tag;
	private String command;
	private static ArrayList<String> listOfTaggings = new ArrayList<String>();
	
	public Tagging(Person person, Tag tag, String command){
			this.name = person.getName().toString();
			this.tag = tag.toString();
			if(command.equals("add")){
				this.command = "+";
			}
			else{
				this.command = "-";
			}
			listOfTaggings.add(command + " " + name + " " + tag);
	}
}
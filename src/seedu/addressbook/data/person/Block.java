/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * This contains the Block portion of the address 
 *
 */
public class Block {	
	
		private String blockNumber = "";
				
		public Block(String block){
			this.blockNumber = block;
		}
		
		public String getBlockNumber(){
			return this.blockNumber;
		}
}

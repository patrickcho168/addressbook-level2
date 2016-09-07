package seedu.addressbook.data.person;

public interface Printable {
	
	public default String getPrintableString(Printable... printables){
		String toBePrinted = "";
		for(Printable value : printables) {
			toBePrinted += " " + value + ","; 
	    }
		toBePrinted = toBePrinted.substring(1, toBePrinted.length()-1);
		
		return toBePrinted;
	}
}

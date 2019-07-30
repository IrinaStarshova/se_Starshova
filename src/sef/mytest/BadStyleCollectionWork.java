package sef.mytest;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class BadStyleCollectionWork {

	/*
	public RadarContact removeContact(String id)
	{
		this.id =id;
		String removed = "";
		for(int i = 0; i < contactList.size();i++)
		{
			if(contactList.get(i).getContactID() == this.id)
			{
				//contactList.add(new RadarContactImpl("0", 0, 0));
				removed = contactList.remove(i);
				break;
				
			}
		}
		return removed;
		//return null;
	} 
*/

	public static void main(String arg[]) {

		String toFind = "two";

		int whatSample = 2;

		List<String> sample = new LinkedList<String>();
		sample.add("one");
		sample.add(toFind);
		sample.add("three");
		sample.add("four");
		sample.add("five");

		try {

			switch (whatSample) {
			case 0:
				for (int i = 0; i < sample.size(); i++) {
					if (sample.get(i).equals(toFind)) {
						sample.remove(sample.get(i));
					}
				}
				break;
			case 1:
				int size = sample.size();
				for (int i = 0; i < size; i++) {
					if (sample.get(i).equals(toFind)) {
						sample.remove(sample.get(i));
					}
				}
				break;
			case 2:
				for(String element : sample){
					if(element.equals(toFind)){
						sample.remove(element);
					}
				}
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator)
	{
		//contactList.set(comparator, contact);
		for(int i = 0;i < contactList.size();i++)
			comparator.compare(contactList.get(i-1), contactList.get(i));
		return contactList;
		//return null;
	}*/
}

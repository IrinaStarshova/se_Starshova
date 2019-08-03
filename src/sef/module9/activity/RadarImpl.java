package sef.module9.activity;

import java.util.*;

/**
 * Implementation of a Radar 
 * 
 *
 */
public class RadarImpl implements Radar{


	private HashMap<String,RadarContact> radarContacts;
	/**
	 *  Constructs a new Radar 
	 */
	public RadarImpl(){
		radarContacts= new HashMap<>();
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {
		if (contact == null)
			return null;
		radarContacts.put(contact.getContactID(), contact);
		return radarContacts.get(contact.getContactID());
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {
		return radarContacts.get(id);
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {
		
		return radarContacts.size();
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
		return radarContacts.remove(id);
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		return new ArrayList<>(radarContacts.values());//radarContacts;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
		//return null;
		ArrayList<RadarContact> radarContacts_= new ArrayList<>(radarContacts.values());
		radarContacts_.sort(new DistanceComparator());
		return radarContacts_;
	}

	
}

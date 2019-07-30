package sef.module9.activity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Implementation of a Radar 
 * 
 *
 */
public class RadarImpl implements Radar{


	
	/**
	 *  Constructs a new Radar 
	 */
	public RadarImpl(){
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
		return null;
//		return Collections.sort(arg0, new DistanceComparator());
	}

	
}

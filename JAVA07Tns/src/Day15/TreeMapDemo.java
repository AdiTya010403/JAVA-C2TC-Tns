package Day15;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.management.MalformedObjectNameException;
import javax.sound.midi.Soundbank;
import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeMapDemo 
{

public static void main(String[] args) 
{
	TreeMap<String,String> personMap = new TreeMap<String , String>();
	
	personMap.put("aditay01@gmail.com", "Aditya");
	personMap.put("kalua01@gmail.com", "Kalua");
	personMap.put("malua01@gmail.com", "Malua");
	personMap.put("kastaa44@gmail.com", "Basataa");
	personMap.put("kunla05@gmail.com", "Kunal");
	
	System.out.println( personMap);
	
	System.out.println("-------------------------------------------------------------------------");
	
	personMap.put("aditay01@gmail.com", "Aditya Thakare");
	System.out.println(personMap);
	
	personMap.put("thakatreaditya01@gmail.com", "Aditya Thakare");
	System.out.println(personMap);
	
//	personMap.put(null," Aditya Thakare");
//	System.out.println(personMap);
	
	Set<String> emailIdSet = personMap.keySet();
	System.out.println(emailIdSet);
	
	personMap.values();
	
	Collection<String> names = personMap.values();
	System.out.println(names);
	System.out.println(personMap.get("aditay01@gmail.com"));
	System.out.println(personMap.get("sddnkduadu"));
	
	Set<Entry<String , String>> persons = personMap.entrySet();
	Iterator<Entry<String,String>> pIterator = persons.iteratot();
	while(personMap.hasNext())
	{
		Map.Entry<String, String> entry= p.next();
		System.out.println("Entry");
	}
}
}

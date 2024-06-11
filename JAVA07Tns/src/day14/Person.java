package day14;

public class Person
{
	private String name;
	private String city;
	private long contactno;
	
	public Person()
	{
		
	}
	public Person(String name, String city, long contactno) {
		super();
		this.name = name;
		this.city = city;
		this.contactno = contactno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "\nPErson [name=" + name + ", city=" + city + ", contactno=" + contactno + "]";
	}
	
	
	
}

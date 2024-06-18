package Day17;

public class Student 
{
	private int rollno;
	private String Name;
	private float per;
	private String stream;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, float per, String stream) {
		super();
		this.rollno = rollno;
		Name = name;
		this.per = per;
		this.stream = stream;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + ", per=" + per + ", stream=" + stream + "]";
	}
	
	

}

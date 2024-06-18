package Day16;

public class StringBufferDemo 
{
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();

		sb.append("! How are you");
		sb.replace(0, 0, "Hi");
		sb  = new StringBuffer(sb.toString().toUpperCase());
		
		System.out.println(sb);
		sb.reverse();
		
		System.out.println(sb.toString());
	}
}

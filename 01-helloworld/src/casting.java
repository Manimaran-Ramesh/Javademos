
public class casting {

	public static void main(String[] args) {
		int i1=8;
		byte b1=10;
		System.out.println(i1);
		
		i1=b1;
		System.out.println(i1);
		
		System.out.println(b1);
		
		i1=9;
		b1=5;
		
		b1=(byte)i1;
		System.out.println(b1);

	}

}

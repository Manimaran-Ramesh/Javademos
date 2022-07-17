
public class strings {

	public static void main(String[] args) {
		String name="max";
		System.out.println("name:"+name);
		System.out.println("length of name:"+name.length());
		
		char[] d= {'p','l','e','a','s','e'};
		String s=new String(d); 
		System.out.println("new strind="+s);
		
		byte[]k= {32,55,24};
		String r=new String(k);
		System.out.println("byte string="+r);

	}

}

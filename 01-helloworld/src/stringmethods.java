
public class stringmethods {

	public static void main(String[] args) {
		String k="cheese";
		System.out.println("length:"+k.length());
		System.out.println("index of h:"+k.indexOf('h'));
		
		System.out.println("character at 5="+k.charAt(5));
		System.out.println("index of second e:"+k.indexOf('e',3));
		System.out.println("index of second e:"+k.indexOf('e',4));
		
		System.out.println("substring:"+k.substring(3));
		System.out.println("splitting:"+k.substring(1,4));
		
		String[] s2=k.split("s");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		System.out.println("replaced:"+k.replace("s","z"));
		
		System.out.println("uppercase:"+k.toUpperCase());
		System.out.println("lowercase:"+k.toLowerCase());
		
		
		
		
		

	}

}

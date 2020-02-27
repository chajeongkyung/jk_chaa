
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		if(v1.equals(v2)) {
			System.out.println("v1과v2는 같습니다");
		}else {
			System.out.println("v1과v2는 다릅니다");

		}
		
		v2 = v1;
		System.out.println("\n\n\nv2 = v1후!!!!!!");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		if(v1.equals(v2)) {
			
			System.out.println("v1과v2는 같습니다");
		}else {
			System.out.println("v1과v2는 다릅니다");
		}
		
//		String s = new String("Hello");		
//		System.out.println(s);
		
//		String s = "Hello";
//		String n = "0123456";
//		char c = s.charAt(1);
//		System.out.println(c);
//		char c2 = n.charAt(1);
//		System.out.println(c2);
		
//		String s = "Hello";
//		String s2 = s.concat(" World");
//		System.out.println(s2);
		
//		String file ="Hello.txt";
//		boolean b = file.endsWith("txt");
//		System.out.println(b);
		
//		String s = "Hello";
//		boolean b = s.equals("Hello");
//		boolean b2 = s.equals("hello");
//		System.out.println(b2);
	
//		String s = "Hello";
//		boolean b = s.equalsIgnoreCase("HELLO");
//		boolean b2 = s.equalsIgnoreCase("heLLo");
//		System.out.println(b2);
		
//		String s = "Hello";
//		int idx1 = s.indexOf('o');
//		int idx2 = s.indexOf(111);
//		int idx3 = s.indexOf('k');
//		System.out.println(idx2);
		
//		String s = "ABCDEFG";
//		int idx1 = s.indexOf("CD");
//		System.out.println(idx1);
		
//		String s = "java.lang.Object";
//		int idx1 = s.lastIndexOf('.');
//		int idx2 = s.indexOf('.');
//		System.out.println(idx2);
		
//		String s = "java.java.java";
//		int idx1 = s.lastIndexOf("java");
//		int idx2 = s.indexOf("java");
//		System.out.println(idx2);
		
//		String s = "Hello";
//		int length = s.length();
//		System.out.println(length);
		
//		String s = "Hello";
//		String s1 = s.replace('H', 'C');
//		System.out.println(s1);
		
//		String ab = "AABBAABB";
//		String r = ab.replaceFirst("BB", "bb");
//		System.out.println(r);
		
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",",2);
//		System.out.println(arr[1]);
		
//		String s = "java.lang.Object";
//		boolean b = s.startsWith("java");
//		boolean b2 = s.startsWith("lang");
//		System.out.println(b2);
		
		
//		String s = "java.lang.Object";
//		String c = s.substring(10);
//		String p = s.substring(0, 4);
//		System.out.println(p);
		
//		String s = "Hello";
//		String s1 = s.toUpperCase();
//		System.out.println(s1);
		
//		String s = "      Hello World     ";
//		System.out.println(s);
//		String s1 = s.trim();
//		System.out.println(s1);
//		
//		String b = String.valueOf(true);
//		String c = String.valueOf('a');
//		String i = String.valueOf(100);
//		String l = String.valueOf(100L);
//		String f = String.valueOf(10.0f);
//		String d = String.valueOf(10.0d);
//		
//		java.util.Date d1 = new java.util.Date();
//		String date = String.valueOf(d1);
//		
//		System.out.println(date);
		
		
		
		
		
		
		
		
		
	}

}

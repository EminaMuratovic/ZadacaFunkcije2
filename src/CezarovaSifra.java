
public class CezarovaSifra {
	/**
	 * Sifrira string pomocu Cezarove sifre
	 * @param s String bilo koji string
	 * @return sifrirani string
	 */
	public static String Sifra(String s)
	{
		String str="";
		char z;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='X')
				z=(char)(s.charAt(i)-23);
			else if(s.charAt(i)=='x')
				z=(char)(s.charAt(i)-23);
			else if(s.charAt(i)=='Z')
				z=(char)(s.charAt(i)-23);
			else if(s.charAt(i)=='z')
				z=(char)(s.charAt(i)-23);
			else if(s.charAt(i)=='Y')
				z=(char)(s.charAt(i)-23);
			else if(s.charAt(i)=='y')
				z=(char)(s.charAt(i)-23);
			else
			z = (char)(s.charAt(i)+3);
			
			str+=z;
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println("Unesite string: ");
		String s=TextIO.getlnString();
		System.out.println(Sifra(s));
	}
	

}

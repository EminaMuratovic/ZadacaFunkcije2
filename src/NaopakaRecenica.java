
public class NaopakaRecenica {
	/**
	 * Okrece zadani string naopako
	 * @param ime String bilo koji string
	 */
	public static char[] Naopako(String ime)
	{
		char[] niz= ime.toCharArray();
		return niz;
		
	}
	public static void main(String[] args) {
		System.out.println("Unesite string: ");
		String ime=TextIO.getlnString();
		char[] niz=Naopako(ime);
		for(int i=niz.length-1; i>=0; i--)
			System.out.print(niz[i]);
	}


}

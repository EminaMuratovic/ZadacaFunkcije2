
public class PomijeranjeClanovaNiza {
	/**
	 * Pomijeranje niza u lijevo, prvi element se oduzima 
	 * a zadnjem je vrijednost nula
	 * @param niz int bilo koji niz
	 * @return novi niz
	 */
	public static void PomjeriLijevo(int[] niz)
	{
		int[] niz2=new int[niz.length];
		for(int i=0; i<niz.length-1; i++)
			niz2[i]=niz[i+1];
		niz2[niz.length-1]=0;
		for(int i=0; i<niz.length; i++)
			System.out.print(niz2[i]);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Unesite broj elemenata niza: ");
		int n=TextIO.getInt();
		int[] niz= new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Unesite element niza: ");
			niz[i]=TextIO.getInt();
		}
		PomjeriLijevo(niz);
	}
}

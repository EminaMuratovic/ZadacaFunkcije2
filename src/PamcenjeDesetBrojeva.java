
public class PamcenjeDesetBrojeva {
	/**
	 * Ispis unesenog niza 
	 * @param niz int[] bilo koji niz
	 * @param vel int velicina niza
	 */
	public static void IspisNiza(int[] niz, int vel)
	{
		System.out.println("Uneseni niz glasi: ");
		for(int i=0; i<vel; i++)
			System.out.print(niz[i]);
	}
	public static void main(String[] args) {
		int i=0;
		int vel=0;
		int[] niz=new int[10000];
		while(niz[i]!=-1){
			System.out.println("Unesite element niza: ");
			niz[i]=TextIO.getInt();
			if(niz[i]==-1) break;
			vel++;
			i++;
		}
		IspisNiza(niz, vel);
	}

}

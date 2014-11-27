
public class DjeljivostSumomCifara {
	/**
	 * Zbir svih cifara nekog broja
	 * @param n int bilo koji broj
	 * @return zbir cifara
	 */
	public static int Suma(int n)
	{
		int suma=0;
		while(n!=0)
		{
			suma=suma+(n%10);
			n/=10;
		}
		return suma;
	}
	/**
	 * Ispisuje brojeve manje od zadanog broja 
	 * koji su djeljivi sa sumom cifara tog broja
	 * @param n int bilo koji broj
	 */
	public static void Djeljivost(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i % Suma(n) == 0) System.out.println(i);		
		}
	}
	public static void main(String[] args) {
		System.out.println("Unesite neki broj: ");
		int broj=TextIO.getInt();
		System.out.println("Suma cifara je: " + Suma(broj));
		System.out.println("Brojevi djeljivi sa " + Suma(broj) + " su: ");
		Djeljivost(broj);
	}

}

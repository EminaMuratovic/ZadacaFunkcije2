
public class SumaCifara {
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
	public static void main(String[] args) {
		System.out.println("Unesite neki broj: ");
		int broj=TextIO.getInt();
		System.out.println("Suma cifara zadanog broja je: " + Suma(broj) );
	}
}

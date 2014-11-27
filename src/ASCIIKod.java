
public class ASCIIKod {
	public static void main(String[] args) {
		System.out.println("Unesite neki znak: ");
		char z=TextIO.getAnyChar();
		int broj= (int)(z);
		System.out.println("Znak " + z + " ima ASCII šifru " + broj);
	}

}

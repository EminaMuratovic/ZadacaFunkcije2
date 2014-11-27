
public class ASCIIVrijednost {
	public static void main(String[] args) {
		System.out.println("Unesite neki broj: ");
		int broj=TextIO.getInt();
		char z= (char)(broj);
		System.out.println("Znak koji ima ASCII šifru " + broj + " je znak " + z);
	}

}

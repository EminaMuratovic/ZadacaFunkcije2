
public class PosljednjaRijecURecenici {
	/**
	 * Izdvaja zadnju rijec iz recenice
	 * @param s String bilo koja recenica
	 * @return zadnja rijec
	 */
	public static String ZadnjaRijec(String s)
	{
		String novaR="";
		String str="";
		int i=s.length()-1;
		while(i>0)
		{
			if(s.charAt(i)!=' ') 
				{
				novaR+=s.substring(i, i+1);
				i--;
				}
			else 
				{
				for(int r=novaR.length()-1; r>=0 ;r--)
					{
					str+=novaR.charAt(r);
					}
				break;
			}
		
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println("Unesite neki string: ");
		String s=TextIO.getlnString();
		System.out.println(ZadnjaRijec(s));
					
	}

}



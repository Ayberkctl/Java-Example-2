package examp;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String mesaj = "hava çok ıyı";
		System.out.println(mesaj);
		System.out.println("eleman sayısı : " + mesaj.length());
		System.out.println("4. elaman : " + mesaj.charAt(3));
		System.out.println(mesaj.concat("yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("h"));
		System.out.println(mesaj.endsWith("ı"));
		char[]karakterler=new char[6];
		mesaj.getChars(0, 6, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("va"));
		System.out.println(mesaj.lastIndexOf("h"));*/
		String mesajTwo="merhaba dünya ben ayberk ";
		String newMesaj=mesajTwo.replace('a','A');
		System.out.println(mesajTwo+" -> "+newMesaj);
		System.out.println(mesajTwo.substring(2,9));
		for (String kelime:mesajTwo.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesajTwo.toLowerCase());
		System.out.println(mesajTwo.toUpperCase());
		System.out.println(mesajTwo.trim());
	}

}

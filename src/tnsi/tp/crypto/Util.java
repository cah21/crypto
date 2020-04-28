package tnsi.tp.crypto;

public class Util {
	private static String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static int getPosition(char lettre) {
		return alpha.indexOf(String.valueOf(lettre));
	}
	public static char getLettre(int pos) {
		return alpha.charAt(pos);
	}
	public static String traiterMessage(String message) {
		String res=message.replaceAll("\\s+","");
		res=res.toUpperCase();
		return res;
	}
}

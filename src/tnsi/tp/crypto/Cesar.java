package tnsi.tp.crypto;

public class Cesar {
	
	/*
	 * private char[] alpha= {'A','B','C','D','E','F','G','H','I','J','K',
	 * 'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	 */
	private String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	
	public Cesar() {
		super();
		// TODO Auto-generated constructor stub
	}

	//ici on va appliquer la formule de cryptage
	
	//E n(x)=(x+n)%26 soit n=decalage(ici cle) et x=position de la lettre dans message dans alpha
	public StringBuilder crypter(String message,int cle) throws Exception {
		StringBuilder result=new StringBuilder();
		//Par securite on met le message en majuscule et enlever espace
		message=message.replaceAll("\\s+","");
		message=message.toUpperCase();
		//on parcours le message
		if(cle>=0 && cle<=25) {
			for(int i=0;i<message.length();i++) {
				if(String.valueOf(message.charAt(i)).isBlank()) {
					continue;
				}else {
					//pour avoir la position de la lettre crypte dans alpha
					int temp1=(Util.getPosition(message.charAt(i))+cle);  
					//Math.floorMod supporte negatif
					int temp=Math.floorMod(temp1, alpha.length());
					//avoir la lettre crypte par rapport a alpha
					 char ch=alpha.charAt(temp); //
					result.append(ch);
				}
				
			}
		}else {
			throw new Exception("Cle invalide veuillez saisir un chiffre en 0 et 25");
		}
		
		return result; 
	}
	
	//ici on va appliquer la formule de cryptage
		//E n(x)=(x+n)%26 soit n=decalage(ici cle) et x=position de la lettre dans message dans alpha
		public StringBuilder decrypter(String message,int cle) throws Exception {
			StringBuilder result=new StringBuilder();
			
			//Par securite on met le message en majuscule et enlever espace
			message=message.replaceAll("\\s+","");
			message=message.toUpperCase();
			
			//on parcours le message
			if(cle>=0 && cle<=25) {
				for(int i=0;i<message.length();i++) {
					if(String.valueOf(message.charAt(i)).isBlank()) {
						continue;
					}else {
						//pour avoir la position de la lettre crypte par rapport a alpha
						int temp1=(Util.getPosition(message.charAt(i))-cle);  
						int temp=Math.floorMod(temp1, alpha.length());
						//avoir la lettre crypte par rapport a alpha
						 char ch=alpha.charAt(temp); //
						result.append(ch);
					}
				}
			}else {
				throw new Exception("Cle invalide veuillez saisir un chiffre en 0 et 25");
			}
			
			return result; 
		}

}

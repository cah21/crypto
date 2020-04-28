package tnsi.tp.crypto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Vigenere {

	private String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private Map<String,Double> reference;
	private Map<String,Double> ICref;
	private static int MAX=30; // nbr maximale de decoupage

	
	
	
	public Vigenere() {
		super();
		initReference();
		// TODO Auto-generated constructor stub
	}

	

	public String getAlpha() {
		return alpha;
	}



	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}



	public Map<String, Double> getReference() {
		return reference;
	}



	public void setReference(Map<String, Double> reference) {
		this.reference = reference;
	}

	//chiffrement message en connaissant la cle vigenere
	public StringBuilder crypter(String message,String cle) {
		StringBuilder result=new StringBuilder();
		//traiter message et cle enlever espace et mettre en majuscule
		message=message.replaceAll("\\s+","");
		message=message.toUpperCase();
		System.out.println(message);
		cle=cle.replaceAll("\\s+","");
		cle=cle.toUpperCase();
		
		
		//traiter la cle changer en tableau
		char[] cletab=cle.toCharArray();
		//initialiser un compteur pour cletab
		int compt=0;
		
		//parcourir le message
		for(int i=0;i<message.length();i++) {
			
			if(compt<cletab.length) {
				//pour avoir la position de la lettre crypte dans alphabet
				int mes=Util.getPosition(message.charAt(i)) + Util.getPosition(cletab[compt]);  
				//Math.floorMod supporte negatif
				int temp=Math.floorMod(mes, alpha.length());
				//avoir la lettre crypte dans l'alphabet
				 char ch=alpha.charAt(temp); 
				 result.append(ch);
				 compt++;
			}else {
				compt=0;
				i--;
			}
			
		}
		
		
	
		return result;
		
	}
	
	//déchiffrement (connaissant la clé) Vigenere
	public StringBuilder decrypter(String message,String cle) {
		StringBuilder result=new StringBuilder();
		//traiter message et cle enlever espace et mettre en majuscule
		message=message.replaceAll("\\s+","");
		message=message.toUpperCase();
		System.out.println("Message initial: "+message);
		cle=cle.replaceAll("\\s+","");
		cle=cle.toUpperCase();
		
		
		//traiter la cle changer en tableau
		char[] cletab=cle.toCharArray();
		//initialiser un compteur pour cletab
		int compt=0;
		
		//parcourir le message
		for(int i=0;i<message.length();i++) {
			
			if(compt<cletab.length) {
				//pour avoir la position de la lettre crypte dans alphabet
				int mes=Util.getPosition(message.charAt(i)) - Util.getPosition(cletab[compt]);  
				//Math.floorMod supporte negatif
				int temp=Math.floorMod(mes, alpha.length());
				//avoir la lettre crypte dans l'alphabet
				 char ch=alpha.charAt(temp); 
				 result.append(ch);
				 compt++;
			}else {
				compt=0;
				i--;
			}
			
		}
		
		
	
		return result;
		
	}
	
	public void initReference() {
		reference=new HashMap<String,Double>();
		ICref=new HashMap<String,Double>();
//		E  15,87%	N	7,15%	D	3,39%	Q	1,06%	H	0,77%
//		A	9,42%	R	6,46%	M	3,24%	G	1,04%	Z	0,32%
//		I	8,41%	U	6,24%	P	2,86%	B	1,02%	X	0,30%
//		S	7,90%	L	5,34%	C	2,64%	F	0,95%	Y	0,24%
//		T	7,26%	O	5,14%	V	2,15%	J	0,89%	K,W	0%
		reference.put("E", 15.87);
		reference.put("A", 9.42);
		reference.put("I", 8.41);
		reference.put("S", 7.90);
		reference.put("T", 7.26);
		reference.put("N", 7.15);
		reference.put("R", 6.46);
		reference.put("U", 6.24);
		reference.put("L", 5.34);
		reference.put("O", 5.14);
		reference.put("D", 3.39);
		reference.put("M", 3.24);
		reference.put("P", 2.86);
		reference.put("C", 2.64);
		reference.put("V", 2.15);
		reference.put("Q", 1.06);
		reference.put("G", 1.04);
		reference.put("B", 1.02);
		reference.put("F", 0.95);
		reference.put("J", 0.89);
		reference.put("H", 0.77);
		reference.put("Z", 0.32);
		reference.put("X", 0.30);
		reference.put("Y", 0.24);
		reference.put("K", 0.0);
		reference.put("W", 0.0);
		
		///IC pour langue
//		allemand	anglais	espagnol	esperanto	français	italien	norvégien	suédois
//		0.072	0.065	0.074	0.069	0.074	0.075	0.073	0.071
		ICref.put("allemand", 0.072);
		ICref.put("anglais", 0.065);
		ICref.put("francais",0.078);
		
		
		
	}
	
	
	
	 // Method to print n equal parts of str 
    public String[] divideString(String str, int n) { 
    	str=Util.traiterMessage(str);
    	 //Stores the length of the string  
        int len = str.length();  
        //n determines the variable that divide the string in 'n' equal parts  
       
        int temp = 0,  chars = len/n, reste=0, compt=0; 
        //Stores the array of string  
       
        String[] equalStr = new String [n];   
      
        	for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring() 
        		//System.out.println("i="+i+",test="+(i+chars)); 
        		if((i+chars)>len) {
        			reste=i;
        			break;
        		}
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;
                
            } 
        	//on va ajouter le reste du texte a la fin
        	if(len % n != 0) {
        		System.out.println("mandalo ato");
    			equalStr[n-1]+=str.substring(reste);
    		}
                
        return equalStr;
    } 
    
    public String[] diviser2(String texte,int longueur) {
    	texte=Util.traiterMessage(texte);
    	String[] lignes = new String[longueur];
    	for (int i = 0; i < longueur; i++)
    	    lignes[i] = "";

    	for (int i = 0; i < texte.length(); i++) {
    	    char c = texte.charAt(i);
    	    // Pour eviter de prendre en compte les espaces
    	    if ('A' <= c && c <= 'Z')
    		lignes[i % longueur] += c;
    	}
    	return lignes;
    }
    
   
    /* Donne un tableau comptant le nombre d'occurrences de
    chaque lettre dans un texte */
	public  int[] compte(String text) {
		int[] occ = new int[26];
	
		for (int i = 0; i < text.length(); i++)
		    occ[text.charAt(i) - (int)'A']++;
	
		return occ;
	 }
    
	 public double[] calulIC(String[] lignes) {
		 double[] ic = new double[lignes.length];
		 

			for (int i = 0; i < ic.length; i++) {
			    int[] occ = compte(lignes[i]);
			    double sum = 0;
			    for (int j = 0; j < 26; j++)
				sum += occ[j] * (occ[j] - 1);
			   
			    double test = sum / (lignes[i].length() * (lignes[i].length() - 1));
			    //BigDecimal bd = new BigDecimal(test).setScale(3, RoundingMode.DOWN);
		        ic[i] = test;
			}
			
			return ic;
	   }
	 
	 public double calulICMoy(String[] lignes) {
		 double[] ic = this.calulIC(lignes);
		 double somme=0.0;
		 for(int i=0;i<ic.length;i++) {
			somme+=ic[i];
		 }
		 double test=somme/lignes.length;
		    //BigDecimal bd = new BigDecimal(test).setScale(3, RoundingMode.DOWN);
			return test ;
	  }
	 
	 //on va mettre dans un tableau variation IC
	 public double[]tableauDecision(String texte){
		 double[] ret=new double[MAX];
		 System.out.println("----tableau decision--");
		 for(int i=0;i<ret.length;i++) {
			 String[]test=this.diviser2(texte, i+1);
			 double IC=this.calulICMoy(test);
			 ret[i]=IC;
			
			 System.out.print((i+1)+"\t");
			 
			  System.out.print(ret[i]+"\t");
			  System.out.println();
		 }
		 System.out.println("---- fin tableau decision--");
		 return ret;
	 }
	 
	 //ici on va avoir les tailles possibles de la cle
	 //retourne un HashMap key=longueur de la cle value=IC
	 public HashMap<Integer,Double> getIC(String texte,int max) {
		 HashMap<Integer,Double> result=new HashMap<Integer,Double>();
		 double[]ret=this.tableauDecision(texte);
		 for(int i=0;i<ret.length;i++) {
//			 Japonais	0,0772
//			 Français	0,0778
//			 Néerlandais	0,0798
			 //selon google
			 //ici on va juste tester la langue francaise
			 if(ret[i]>0.0772 & ret[i]<=0.0800) {
				 result.put(i+1, ret[i]);
			 }
			 
		 }
		 if(result.isEmpty()) {
			 //throw new Exception("Le texte n'est pas en francais");
			 System.out.println("Le texte n'est pas en francais");
		 }
		 return result;
	 }
	 
	 public int[] getIndMax(int[] tab) {
		 int[] max=new int[2];
		  max[0]=0;//indice
		  max[1]=0;//valeur
		 for(int i=0;i<tab.length;i++) {
			 if(max[1]<tab[i]) {
				 max[1]=tab[i];
				 max[0]=i;
			 }
		 }
		 return max;
	 }
	 //find key possible
	 //on va afficher le tableau de decision
	 //vous pouvez changer la longueur du key 
	 public String findKey(String texte,int keyLength) {
		 String result="";
		 HashMap<Integer,Double> ICref=this.getIC(texte, MAX);
		 List<Integer> total = new ArrayList<>();
		 for (Integer lis : ICref.keySet() ){
		     total.add(lis);
		     System.out.println("longueur="+lis.intValue());
		 }
		 //int length=total.get(0);
		 int length=keyLength;
		 String[] lignes=diviser2(texte,length);
		 for(int i=0; i<lignes.length;i++) {
			 int[] occ=this.compte(lignes[i]);
			 int[] lettre=this.getIndMax(occ);
			 double per=(lettre[1]*100)/lignes[i].length();
			 System.out.println("pourcentage="+per);
			 //betement on va juste prendre la lettre E comme reference
			 System.out.println("ind="+lettre[0]+" alpha="+ Util.getLettre(lettre[0]));
			 int temp=Math.floorMod(lettre[0]-4,26);
			 result+=Util.getLettre(temp);
		 }
		 
		 
		 return result;
	 }
	 
   
   
	
	 
}

package tnsi.tp.crypto;


public class Main {

	public static void main(String[] args) throws Exception {
//		test algo cesar
		System.out.println("**************Test Cesar****************");
//		Cesar cesar=new Cesar();
//		String text = "JE TESTE CESAR"; 
//		//System.out.println(text.strip());
//		String text1 = "NIXIWXIGIWEV"; 
//        int s = 4; 
//        System.out.println("Message  : " +text); 
//        System.out.println("Cle : " + s); 
//        try {
//			System.out.println("Message CRYPTE: " + cesar.crypter(text, s));
//			System.out.println("Message DECRYPTE: " + cesar.decrypter(text1, s));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
        
		
		  System.out.println("**************Test Vigenere****************");
		  Vigenere vigenere1=new Vigenere(); 
		  String text="chiffre de vigenere";
		  String cle="MASTER"; 
		  String text1="XATBGYQBJTQVMUUEEZDDWEYEQELIPVGRWTWVROFWVVXEKRILJSGGTVFILYEF ZDWEM TUEMQ EUUSH TVLPA FLPRZ UAMFI GNW";
		  System.out.println("Message  : " +text); 
		  System.out.println("Cle : " + cle);
		  System.out.println("Message CRYPTE: " + vigenere1.crypter(text, cle));
		  System.out.println("Message DECRYPTE: " + vigenere1.decrypter(text1, cle));
		 
        
        System.out.println("**************Test Vigenere find key ****************");
        Vigenere vigenere=new Vigenere();
         text="JCCMF QKDWL FVZQW CSCES XYOAV SXLWA RBBVZ QEQWE GKZSV KZQXC BVDII ZWIUC VWTJS TZUWK OQKXI DOQJS TCSVR JIZHB RBBIS DVRMJ JQJOO VGLVB WPSAR TNCSC IOQVB BRZIJ IZWOK VRCES UVFMK OTVST CSDFM IZHTV GGVIF MSZKG AFIDI WZVHA VFMWS ZDSZT CUDST VGDRZ DVGTV BBVGL LBKFE CZZTR UMVBB ISLVI FVOCO ZMJCU DSQCS UGCZK OQKQM JTITS AUSOZ GIEHA CSAZZ MEQMC OXRWF CSDZR MGFMJ ECVXI MOQJJ CLBNL FMKCC LBMWC CZBMK FIMSZ JSZCS URQIU OUCSZ LPIEE CZRMW WTVSB KCCJQ MJFCS OVJGC IZIIC CKSMK QMLLY LCVEC CJOKT FWTVM JIZCO XFWBI WVVIV ACCIC CCOCK FMJIN WWBUO BKSVU FM";
        //vigenere.diviserTexte(text, 3);
        //text=Util.traiterMessage(text);
         //text="IRTGQ TFTEF KENVR TOVLI GETDN VCITR BXGLV HGKYX VTFPT XCSGC YBKJC TPKPP KEGAC CJPKK TTPRG IFVQR GEBPK KPTOF LICZR QTLGH URGIG KGCEV JPKK";
		text="KIIFSIRV A E NEEF HJYKR SPFCVI GI KRVMMSYI XSLC HZ ZVAX YI EBVY" + 
				"IJG UPM JRHZGYNMIE RH QDPZRY YI C RUPMEBBZ HV PIOXV NRIIV RX" + 
				"KIEQEIX CRUPIC YI WEIBQZXIR XJQSN E NIGG GZRK QMS QZYPDQVGVZW" + 
				"TR JPX LA SPVRTEI WRAW DRKRVHMKGIIGV DYD HLEE YY UVB CYZG EP" + 
				"ZZAKO GZAU HEIF PZW INZVKVF UP MC CVJHLVWDX WHVZRK VQHIEFIN" + 
				"IENQZVZDYZ IE RYMSGR II EJVI NYI HRZ DFAI GEITI YI UVB CYZG GZRKF" + 
				"QDPCRW LYZ FIYIJFMIEZG SWPZDYZQVAX V P VDYVXVHV YIGHMN PV" + 
				"GVZRKR GDRHHMZQV CEMECYIGI EBVY NLFUPEL DYVVRAXDIDR" + 
				"TVVRYPZPV FYY";
//         text="vptnvffuntshtarptymjwzirappljmhhqvsubwlzzygvtyitarptyiougxiuydtgzhhvvmum" + 
//         		"shwkzgstfmekvmpkswdgbilvjljmglmjfqwioiivknulvvfemioiemojtywdsajtwmtcgluy" + 
//         		"sdsumfbieugmvalvxkjduetukatymvkqzhvqvgvptytjwwldyeevquhlulwpkt";
         //text="IRTGQ TFTEF KENVR TOVLI GETDN VCITR BXGLV HGKYX VTFPT XCSGC YBKJC TPKPP KEGAC CJPKK TTPRG IFVQR GEBPK KPTOF LICZR QTLGH URGIG KGCEV JPKK"; 
        	//text="QODBS WWOFO LOFMW MSZFK HSEES FWCSK JOFST SSBEE SVSCP KGOGC CXHKQ AISGO G";
		/*
		 * text="QODBS WWOFO LOFMW MSZFK HSEES FWCSK JOFST SSBEE SVSCP KGOGC" +
		 * "CXHKQ AISGO G";
		 */
         //text="IRTGQ TFTEF KENVR TOVLI GETDN VCITR BXGLV HGKYX VTFPT XCSGC YBKJC TPKPP KEGAC CJPKK TTPRG IFVQR GEBPK KPTOF LICZR QTLGH URGIG KGCEV JPKK"; 
         	//text="XATBGYQBJTQVMUUEEZDDWEYEQELIPVGRWTWVROFWVVXEKRILJSGGTVFILYEF ZDWEM TUEMQ EUUSH TVLPA FLPRZ UAMFI GNW";
         	//text="IRTGQ TFTEF KENVR TOVLI GETDN VCITR BXGLV HGKYX VTFPT XCSGC YBKJC TPKPP KEGAC CJPKK TTPRG IFVQR GEBPK KPTOF LICZR QTLGH URGIG KGCEV JPKK" + 
         		//	"";		
         	
        System.out.println(text.length());
		  //String[] test=vigenere.divideString(text, 5);
		  String[] test=vigenere.diviser2(text, 16);
		  double[] IC=vigenere.calulIC(test);
		  double IC1=vigenere.calulICMoy(test);
		  //double[] tab=vigenere.tableauDecision(text);
		  String key=vigenere.findKey(text,5);
		  
		  System.out.println("cle: "+key);
		  System.out.println("Message decrypte: "+vigenere.decrypter(text, key));
//		  for (int i=0; i<tab.length;i++) {
////			  System.out.println("test"+i+"="+test[i].length());
////			  
////			  System.out.println(test[i]);
////			  System.out.println("IC"+i+"="+IC[i]);
//			  System.out.println("tab"+(i+1)+"="+tab[i]);
//		  }
//		  int[]occ=vigenere.compte(test[0]);
//		  for (int i=0; i<occ.length;i++) {
//			  System.out.print(i+"\t");
//			 
//			  System.out.print(occ[i]+"\t");
//			  System.out.println();
//		  }
		  
		  System.out.println("*************RSA******************");
		  RSA rsa=new RSA();
		  
		  System.out.println("---test nombre premier----");
		  int premier=rsa.getNombrePremierIn(1, 85);
		  System.out.println("nbr premier entre(1,85) =" + premier);
		  System.out.println("------RSA------");
		  int m = 10; // message claire
		  int p = 5, q = 17, n = p * q, e = 5; 
		  //on va crypter le message m = 10;
		  // on choisi e tel que pgcd(e,phi) = 1
		  double messagecryp=rsa.chiffrement(m, n, e);
		  System.out.println("Message crypte: "+ messagecryp);
		  //on va maintenant dechiffrer messagecryp avec cle prive
		  int phi=(p-1)*(q-1);
		  int[]result=rsa.algoEuclide(e,phi);
		  System.out.println("---algo euclide----");
		  System.out.println("pgcd("+e+","+phi+")="+result[0]);
		  System.out.println("u ="+result[1]);
		  System.out.println("v ="+result[2]);
		  int privateKey= rsa.getClePrive(p,q,e);
		  double messagedecryp=rsa.dechiffrement(messagecryp, n, privateKey);
		  System.out.println("Private key: "+privateKey);
		  System.out.println("Message decrypte: "+messagedecryp);
		  
		 
		 
        
   		 
       

	}

}

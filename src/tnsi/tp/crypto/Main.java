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
		 
		 
        
   		 
       

	}

}

package tnsi.tp.crypto;

import java.util.Random;

public class RSA {
	
	
	
	public int[] algoEuclide(int a,int b) throws Exception {
		int[] result=new int[3];
		//pgcd(a,b) = a*u+b*v
		// ind 0= pgcd (a,b)
		// ind[1]= u coefficient de bezout
		//ind[2]= v coefficient de bezout
		int r = a , u = 1, v = 0, r1 = b, u1 = 0, v1 = 1, q, r3 ,u3 ,v3;
		if(a<b) {a=b ; b=a;}
		if(a>=b & b>0) {
			
			while(r1 != 0) {
				q = r / r1;
				r3 = r; u3 = u; v3 = v;
				r = r1; u = u1; v = v1;
				r1 = r3 - q*r1;
				u1 = u3 - q*u1;
				v1 = v3 - q*v1;
				
			}
			result[0]=r;
			result[1]=u;
			result[2]=v;
		}
		
		return result;
	}
	
	//checks whether an int is prime or not.
	boolean isPrime(int num) {
		boolean flag = false;
		int i=2;
		if(num == 1) flag = true;
        while(i <= num/2)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
            i++;
        }

        if (!flag)
           return true;
        else
            return false;
	}
	
	public int getNombrePremierIn(int min,int max) {
		
		Random r=new Random();
		int result=r.nextInt(max-min)+min;
		//tant qu'on ne trouve pas un nombre premier on continue
		while(!this.isPrime(result)) {
			result=r.nextInt(max-min)+min;
		}
		return result;
	}
	
	
	
	

	
	public double  chiffrement(int message,int n,int e) {
		
		return  Math.pow(message, e) % n;
	}
	
	public double  dechiffrement(double messageCryp,int n,int d) {
		
		return  Math.pow(messageCryp, d) % n;
	}
	
	
	//calcul de d l'inverse e mod(phi)
	public int getClePrive(int p, int q,int e) throws Exception {
		int phi = (p - 1) * (q -1);
		int[] euclide=this.algoEuclide(e,phi);
		// a*u+ b*v=pgcd euclide[0]= pgcd  euclide[1]= u  euclide[2]= v
		// ici e*u + phi*v = 1 => d=u donc euclide[1]
		int d = euclide[1];
		return d%phi;
	}
}

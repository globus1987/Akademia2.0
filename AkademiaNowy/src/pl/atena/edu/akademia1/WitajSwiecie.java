/**
 * 
 */
package pl.atena.edu.akademia1;

import java.util.Random;

/**
 * @author Arkadiusz M�j pierwszy program
 * 
 * 
 */

public class WitajSwiecie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String par = " w niedzielny poranek";
		System.out.println("Witaj �wiecie" + par);

		System.out.println((new Random()).nextInt());

		byte bajt = -100;
		short krotki = 10000;
		int integer = -100000;
		long dlugi1 = 1_000_000L;
		long dlugi2 = 10000000L;
		System.out.println(dlugi2);
		dlugi2 = dlugi2 + dlugi1;
		System.out.println(dlugi2);

		dlugi2 = dlugi2 + integer;
		System.out.println(dlugi2);

		dlugi2 = dlugi2 + bajt + krotki;
		System.out.println(dlugi2);
		// System.out.println(Long.MAX_VALUE);
		// System.out.println(Long.MIN_VALUE);
		// System.out.println(Byte.MAX_VALUE);
		// System.out.println(Byte.MIN_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MIN_VALUE);
		// System.out.println(Short.MAX_VALUE);
		// System.out.println(Short.MIN_VALUE);
		float lFloat = 4232.2323f;
		double lDouble = -434.223;
		double lDouble2 = 343434.343d;
		System.out.println(1.0d / 0.0d); // Infinity
		System.out.println(0.0d / 0.0d); // NaN
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		float j = 0f;
		for (double i = 0; i < 1; i += 0.1) {
			System.out.println("double ma " + i + " a float ma " + j);
			j += 0.1;
		}

		char znak = '\u004a';
		System.out.println(znak);

		char[] znaki = "Witaj �wiecie".toCharArray();
		znaki[4] = 'm';
		for (byte i = 0; i < znaki.length; i++) {
			System.out.println(znaki[i]);
		}
		znaki[4] = znak;
		for (byte i = 0; i < znaki.length; i++) {
			System.out.println(znaki[i]);
		}
		final double test = 3.14;
		int liczba1 = 1222;
		liczba1++;
		liczba1+=test;
		System.out.println(liczba1);
		System.out.println(Zwierzak.KOT);

		int l1 = 1234, l2 = 4321;
		System.out.println(l1 + l2);
		System.out.println(l1 - l2);
		System.out.println(l1 * l2);
		System.out.println(l2 / l1);
		System.out.println(17 % 3);
		
		
		int liczba4 = 123;
		liczba4++;
		System.out.println(liczba4);
		liczba4--;
		System.out.println(liczba4);
		liczba4 -= 12;
		System.out.println(liczba4);
		liczba4 += 32;
		System.out.println(liczba4);
		
		String[] tablica = { "raz", "dwa" };
		
		int indeks = 0;
		System.out.println(tablica[indeks++]); // najpierw zwrotka, potem inkrementacja
		System.out.println(tablica[indeks]);

		int indeks2 = 0;
		System.out.println(tablica[++indeks2]); // najpierw inkrementacja potem zwrotka
		System.out.println(tablica[indeks2]);
		//arytmetyka
		double z =Math.pow(5, 2);
		System.out.println(z);
		
		int test2 = 1000000000*3;
		System.out.println(test2);
		int test3=Math.multiplyExact(10000000, 3);
		
		//konwersje typ�w
		
		double x=3.75;
		int n = (int)x;
		System.out.println(n);
		
		int i1=54;
		double d1=2.21+i1;
		System.out.println(d1);
		char c1 = 'K'+1;
		System.out.println(c1);
		
		int i2='J'+1;
		System.out.println(i2);
		byte b1=5;
		short s1=23;
		int i4=1234;
		long l3=111111;
		l3+=i4+s1+b1;
		System.out.println(l3);
		byte b2 = (byte)(b1+s1+i4+l3);
		System.out.println(b2);
		
		byte b=0,c=5;
		boolean bo1=b==0;
		boolean bo2=b!=0;
		boolean bo3=b>0;
		boolean bo4=b<0;
		boolean bo5=b>=0;
		boolean bo6=b<=0;
		boolean bo7=b<=0&&c>=5;
		boolean bo8=b<=0||c>5;
		String testowy=b==0?"zero":"co� innego";
		System.out.println(bo3&&bo4);
		System.out.println(bo5||bo4);
		System.out.println(testowy);
		b=1;
		testowy=b==0?"zero":"co� innego";
		System.out.println(testowy);
		
		//Zadanie 

		
				
	}

}
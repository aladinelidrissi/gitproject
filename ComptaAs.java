package net.aladinidrissi.ComptaA;

public class ComptaAs {
	/* Ara tambe diu quants dels caracters son numeros*/
	private final static String[] a ={"cap","peu","cap","ma","llengua","ma","cap","ma","llengua","cap","ma"};

	public static void main(String[] args) {

            int comptador = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == "ma") {
                comptador++;
                }
            }
            System.out.println("Numero de mans: " + comptador);

	}

}

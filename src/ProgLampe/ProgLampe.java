package ProgLampe;

public class ProgLampe {
	public static void main(String[] args) {
		
        Lampe l = new Lampe(60);
        l.allumer();
        if (l.estAllumee()) {
            System.out.println("La lampe est allumée.");
        } else {
            System.out.println("La lampe est éteinte.");
        }

        System.out.println(l);
    }
}


		
	

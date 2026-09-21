package ProgLampe;

public class Lampe {
	 private int puissance;
	 private boolean allumee;
	 public Lampe(int puissance) {
		    this.puissance = puissance;
		    this.allumee = false;
		}
	 public boolean estAllumee() {
		 return this.allumee;
	 }
	 public void allumer () {
		 this.allumee = true;
	 }
	 public void eteindre() {
		 this.allumee = false ;
	 }
	 public int getPuissance() {
		 return this.puissance;
	 }
	 
	 @Override
	    public String toString() {
	        return "Lampe{" +
	               "puissance=" + puissance +
	               ", allumee=" + allumee +
	               '}';
	    }
}


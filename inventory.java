package test;
import java.util.ArrayList;

public class inventory {
	 String nom;
	 int prixv;
	 
	 public inventory(int pV,String name){
	        prixv=pV;
	        nom=name;
	    }
	 
	 public void info()     {
	        System.out.println("Nom du produit:" + nom);
	        System.out.println("Prix de vente: " + prixv);
	 }

	 public  static void addproduct(ArrayList<String> lenom,ArrayList<Integer> leprix , ArrayList<Integer> quant ,String nprod,
			 int pprod, int adquant){
		 lenom.add(nprod);
		 leprix.add(pprod);
		 quant.add(adquant);
		 }

	 public  static void afficher1(ArrayList<String> nom,ArrayList<Integer> leprix,   ArrayList<Integer> quant, int nb){
		 
		 for (	 int	 i=0; i<nb; i++){
			 System.out.println(" nom	: ");
			 System.out.println(nom.get(i));
			 System.out.println("Prix: ");
			 System.out.println(leprix.get(i));
			 System.out.println(" quantité:	 ");
			 System.out.println(quant.get(i));
		 }
		 }
	 
	 public static  int totale1(ArrayList<Integer> prix,ArrayList<Integer> quant, int nbb){
		 int cumul = 0, save;
		 for ( int i=0; i<nbb; i++){
		 save=prix.get(i)*quant.get(i);
		 cumul=cumul+save;
		 }
		 return cumul;
		 }
		 	
	 	 
	 
}

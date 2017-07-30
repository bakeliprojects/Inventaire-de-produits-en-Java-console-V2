package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import test.*;

public class product {
	 int id;  
	 int prix; 
	 int quant;
	 
	 public product(Integer pId, int pPrix, int pQuant)  {  
		System.out.println("Sasi de l id , du prix et de la quatité");

		id = pId;

	    prix = pPrix;

	    quant = pQuant;
		

	 } 
	 
	 public Integer getid()  {        
		 return id; 
		 }   

	 public Integer getprix() 
	 {        
		 return prix;  
	 } 
	 
	 
	 public Integer getquant()
	 {        
		 return quant; 
		 }
	 
	 public Integer setid()  {        
		 return id; 
		 }   

	 public Integer setprix() 
	 {        
		 return prix;  
	 } 
	 
	 
	 public Integer setquant()
	 {        
		 return quant; 
		 }
	 
		private  static void addproduct(ArrayList<String> lenom,ArrayList<Integer> leprix , ArrayList<Integer> quant ,String nprod,
				 int pprod, int adquant){
			 lenom.add(nprod);
			 leprix.add(pprod);
			 quant.add(adquant);
			 }

		 private  static void afficher1(ArrayList<String> nom,ArrayList<Integer> leprix,   ArrayList<Integer> quant, int nb){
			 
			 for (	 int	 i=0; i<nb; i++){
				 System.out.print(" nom	"+i+": ");
				 System.out.println(nom.get(i));
				 System.out.print("Prix "+i+" : ");
				 System.out.println(leprix.get(i));
				 System.out.print(" quantité "+i+" :	 ");
				 System.out.println(quant.get(i));
				 System.out.println("\n");
				 
			 }
			 }
		 
		 private static  int totale1(ArrayList<Integer> prix,ArrayList<Integer> quant, int nbb){
			 int cumul = 0, save;
			 for ( int i=0; i<nbb; i++){
			 save=prix.get(i)*quant.get(i);
			 cumul=cumul+save;
			 }
			 return cumul;
			 }
			 	

	public static void main(String[] args) {
		
		ArrayList<String> lenom = new ArrayList<String>();
		ArrayList<Integer> leprix = new ArrayList<Integer>();
		ArrayList<Integer> lequant = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		String nmprod;
		
	product produit2 = new product(112,1000,3);
		
		System.out.println("l id du produit est " + produit2.id +"  le prix du produit est " + produit2.prix +" et la quant est " + produit2.quant +" \n");
         
		
		System.out.println("Veuillez saisir le nombre de produit à ajouter   :");

		  int nbprod = sc.nextInt();
		  		
		for (int i=0; i<nbprod; i++) {
		
		   System.out.println("Veuillez saisir un nom de produit "+i+": \n");
			 		  
		    nmprod = sc.next();
		   
		    System.out.println("le nom de produit est : " + nmprod  );
		
	       System.out.println("Veuillez saisir le prix de produit "+i+": \n");

		   int pprod = sc.nextInt();
		
		   System.out.println("Veuillez saisir la quantité de produit "+i+": \n");

		   int qprod = sc.nextInt();
		
		   addproduct(lenom, leprix,lequant,nmprod,pprod,qprod);
		}
		
		afficher1( lenom, leprix,lequant, nbprod);
		

		int letotale = totale1(leprix,lequant, nbprod);
		
		   System.out.println("le total s eleve à :"+ letotale);
				        
         
	}


}

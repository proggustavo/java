package exemplos;


import java.util.*;

public class exemploarraylist {

	public static void main(String[] args) {
		
		  ArrayList<String> nomes = new ArrayList<String>(); 
	      nomes.add("Steve");
	      nomes.add("Tim");
	      nomes.add("Lucy");
	      nomes.add("Pat");
	      nomes.add("Angela");
	      nomes.add("Tom");

	      //displaying elements
	      System.out.println(nomes);

	      //Removing "Steve" and "Angela"
	      nomes.remove("Steve");
	      nomes.remove("Angela");

	      //displaying elements
	      System.out.println(nomes);

	      //Removing 3rd element
	      nomes.remove(2);

	      //displaying elements
	      System.out.println(nomes);
		
	}

}

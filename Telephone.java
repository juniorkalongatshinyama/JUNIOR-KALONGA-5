package Bac3.ig2023;

public class Telephone {

	//Attributs
	private String marque;
	protected int code;
	private String ram;
	private String camera;
    
	//Constructeur
	public Telephone(String marque,int code,String ram, String camera) {
this.marque = marque;	
this.code = code;	
this.ram = ram;	
this.camera = camera;	
	}
    //Methode pour allumer le telephone
	public void allumer() { 
		}
	//Methode pour etteindre le telephone
	public void atteindre() { 
	}
	//Methode pour appeler le telephone	
	public void appeler() { 
			}
		
	//Methode pour retourner l'etat d'un telephone
	@Override
      public String toString () {
	return "telephone[marque"+marque+", code="
         +code +",ram="+ram+",camera"+camera+"]";
							
		}
		}
		
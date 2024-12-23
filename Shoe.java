package lld.abstractFactory;

public class Shoe {
	private Sole sole;
	
	private ShoeLace  shoelace;
	
	private String shoeType;
	
	public Shoe(Sole sole, ShoeLace shoelace , String shoeType) {
		
		this.sole = sole;
		this.shoelace = shoelace;
		this.shoeType = shoeType;
	}
	
	
	public void displayShoeBuild() {
		System.out.println("The shoe soleBuild : " + this.sole.soleBuild() + "\tshoeType : " + this.shoeType );
		System.out.println("The shoe soleMaterail  : " + this.sole.soleMaterail()  +  "\tshoeType : " + this.shoeType);
 
		System.out.println("The shoe LaceBuild : " + this.shoelace.shoelaceBuild() +  "\tshoeType : " +this.shoeType);
		System.out.println("The shoe LaceMaterial : " + this.shoelace.shoelaceMaterial() +   "\tshoeType : " + this.shoeType);

	}
	
}

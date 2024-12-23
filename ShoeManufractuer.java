package lld.abstractFactory;

public class ShoeManufractuer {
		static ShoeFactory shoeFactory;
		
		public static Shoe producer(String shoeType) {
			if(shoeType=="Formal") {
				//System.out.println(shoeType);
				shoeFactory = new FormalShoeFactory();
			}
			if(shoeType=="Sports") {
				//System.out.println(shoeType);
				shoeFactory = new SportsShoeFactory();
			}
			if(shoeType == "Casual") {
				//System.out.println(shoeType);
				shoeFactory = new CasualShoeFactory();
			}
			
			return new Shoe(shoeFactory.createsole(),shoeFactory.createshoelace(),shoeType);
		}
		public static void main(String [] args) {
			
			Shoe FormalShoe = producer("Formal");
			Shoe  CasualShoe = producer("Casual");

			Shoe SportsShoe = producer("Sports");

			Shoe ForShoe = producer("Formal");
			
		   FormalShoe.displayShoeBuild();
		   CasualShoe.displayShoeBuild();
		   SportsShoe.displayShoeBuild();
		   ForShoe.displayShoeBuild();

		}
}

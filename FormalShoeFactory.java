package lld.abstractFactory;

public class FormalShoeFactory implements ShoeFactory{

	@Override
	public Sole createsole() {
		// TODO Auto-generated method stub
		//System.out.println("Formal ShoeSole");
		return new ThinSole();
	}

	@Override
	public ShoeLace createshoelace() {
		// TODO Auto-generated method stub
		//System.out.println("Formal ShoeLace");
		return new TapeShoeLace();
	}
	
	

}

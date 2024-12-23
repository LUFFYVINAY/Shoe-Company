package lld.abstractFactory;

public class CasualShoeFactory implements ShoeFactory{
	@Override
	public Sole createsole() {
		
		return new BumpySole();
	}
	
	@Override
	public ShoeLace createshoelace() {
		return new RoundShoeLace();
	}
}

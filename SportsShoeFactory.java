package lld.abstractFactory;

public class SportsShoeFactory implements ShoeFactory {

	@Override
	public Sole createsole() {
		// TODO Auto-generated method stub
		return new BumpySole();
	}

	@Override
	public ShoeLace createshoelace() {
		// TODO Auto-generated method stub
		return new RoundShoeLace();
	}

}

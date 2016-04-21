package com.adapter.cn;

public class TwoToThreeAdapter implements ThreePlug{
	private TwoPlug twoPlug;

	public TwoToThreeAdapter(TwoPlug twoPlug) {
		super();
		this.twoPlug = twoPlug;
	}


	@Override
	public void PowerWithThree() {
		twoPlug.PowerWithTwo();
		System.out.println("The two-phase current into three phase current....");
	}

}

package com.adapter.cn;

public class Notebook {
	private ThreePlug threePlug;

	public Notebook(ThreePlug threePlug) {
		super();
		this.threePlug = threePlug;
	}

	public void charge() {
		threePlug.PowerWithThree();
	}
}

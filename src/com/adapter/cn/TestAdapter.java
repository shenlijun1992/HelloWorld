package com.adapter.cn;

public class TestAdapter {
	public static void main(String[] args) {
		TwoPlug twoPlug = new TwoPlug();
		ThreePlug threePlug = new TwoToThreeAdapter(twoPlug);
		Notebook notebook = new Notebook(threePlug);
		notebook.charge();
	}
}

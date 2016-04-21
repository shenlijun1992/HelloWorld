package com.Cor.cn;

public class VP extends PriceHander {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.45) {
			System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),
					discount);
		} else {
			successor.processDiscount(discount);
		}
	}
}

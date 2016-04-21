package com.Cor.cn;

/**
 * 客户，请求折扣
 * 
 * @author Leonard
 * 
 */
public class Customer {
	private PriceHander priceHander;

	/**
	 * 客户选择处理折扣请求的处理人
	 * 
	 * @param priceHander
	 */
	public void setPriceHandler(PriceHander priceHander) {
		this.priceHander = priceHander;
	}

	/**
	 * 请求折扣，并将期望的折扣数以参数的形式传过去
	 * 
	 * @param discount
	 */
	public void requestDiscount(float discount) {
		priceHander.processDiscount(discount);
	}
}

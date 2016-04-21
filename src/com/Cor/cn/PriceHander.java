package com.Cor.cn;

/**
 * PriceHander: 价格处理人:会处理客户的折扣申请
 * 
 * @author luoluo
 * 
 */
public abstract class PriceHander {
	protected PriceHander successor;

	/**
	 * 直接后继，用于传递请求
	 * 
	 * @param successor
	 */
	public void setSuccessor(PriceHander successor) {
		this.successor = successor;
	}

	/**
	 * 处理折扣的方法
	 * 
	 * @param discount
	 *       
	 */
	public abstract void processDiscount(float discount);

	public static PriceHander creatPriceHandler() {
		PriceHander sales = new Sales();
		PriceHander man = new Manager();
		PriceHander vp = new VP();
		PriceHander ceo = new CEO();
		
		sales.setSuccessor(man);
		man.setSuccessor(vp);
		vp.setSuccessor(ceo);
		return sales;
	}
	

}

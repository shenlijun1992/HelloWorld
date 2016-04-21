package com.Cor.cn;

/**
 * sales，最底层一级的销售人员：能处理百分之5以下的折扣，大于百分之五则由他的上一级主管来处理
 * 
 * @author Leonard
 * 
 */
public class Sales extends PriceHander {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.05) {
			System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),
					discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}

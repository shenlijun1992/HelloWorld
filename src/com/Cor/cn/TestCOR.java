package com.Cor.cn;

import java.util.Random;

public class TestCOR {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setPriceHandler(PriceHander.creatPriceHandler());
		// 使用随机数来生成折扣
		Random random = new Random();
		for (int i = 1; i < 100; i++) {
			System.out.println(i + ":");
			customer.requestDiscount(random.nextFloat());
		}
	}
}

package com.test.concurrent.decorator;

import java.math.BigDecimal;

/**
 * 优惠券
 * @author admin
 *
 */
public class UserCoupon {
	
	private int id; // 优惠券 ID
	private int userId; // 领取优惠券用户 ID
	private String sku; // 商品 SKU
	private BigDecimal coupon; // 优惠金额

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public BigDecimal getCoupon() {
		return coupon;
	}

	public void setCoupon(BigDecimal coupon) {
		this.coupon = coupon;
	}
}

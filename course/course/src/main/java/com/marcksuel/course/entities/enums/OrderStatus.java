package com.marcksuel.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private Integer code;
	private OrderStatus(Integer code) {
		this.code=code;
	}
	public Integer getCode() {
		return code;
	}
	public static OrderStatus valueOff(Integer code) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}

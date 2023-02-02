package com.sacavix.entity;

import lombok.Data;

@Data
public class Customer {
	private Long id;
	private String document;
	private String numberCell;
	private String imei;
	private String email;
}

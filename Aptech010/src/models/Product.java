package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import helper.RegexConst;
import helper.Validation;

public class Product {
	
	private int proId;
	private String proName;
	private boolean status;
	private LocalDate mfgDate;
	private double price;
	
	public Product() {}

	public Product(int proId, String proName, boolean status, LocalDate mfgDate, double price) {
		this.proId = proId;
		this.proName = proName;
		this.status = status;
		this.mfgDate = mfgDate;
		this.price = price;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", status=" + status + ", mfgDate=" + mfgDate
				+ ", price=" + price + "]";
	}
	
	public void insertProduct() {
		proId = Integer.parseInt(Validation.CheckRegex(RegexConst.NUM,"Enter product ID: "));
		proName = Validation.CheckRegex(RegexConst.NUM,"Enter product Name: ");
		status = Boolean.parseBoolean(Validation.CheckRegex(RegexConst.STATUS,"Enter status: (1-in stock) or (0-out of stock)"));
		mfgDate = LocalDate.parse(Validation.CheckRegex(RegexConst.STATUS,"Enter manufactoring date: (yyyy-MM-dd or yyyy/MM/DD) "), DateTimeFormatter.ofPattern("[yyyy-MM-dd][yyyy/MM/DD]"));
		price = Double.parseDouble(Validation.CheckRegex(RegexConst.NUM, "enter price: "));
	}
	
}

package dao;

import java.util.*;

import helper.RegexConst;
import helper.Validation;
import models.Product;

public class ListProduct {

	private List<Product> listPro;
	
	public ListProduct () {
		listPro = new ArrayList<>();
	}
	
	public List<Product> getListPro(){
		return listPro;
	}

	public void setListPro(List<Product> listPro) {
		this.listPro = listPro;
	}
	
	public void insertListProduct() {
		Product pro = new Product();
		pro.insertProduct();
		listPro.add(pro);
	}
	
	public void selectListProduct() {
		listPro.forEach(System.out::println);
	}
	
	public void deleteProIdInList(int proId) {
		listPro.removeIf(pro->pro.getProId() == proId);
	}
	
	public void updateProIdInList(int proId) {
		listPro.stream().forEach(pro->{
			if(pro.getProId()==proId) {
				pro.setProName(Validation.CheckRegex(RegexConst.NUM,"Enter product Name: "));
				pro.setStatus(Validation.CheckRegex(RegexConst.STATUS,"Enter status: (1-in stock) or (0-out of stock)").equals("1")?true:false);
				
				
			}
		});
	}
	
	public void sortListProduct() {
		//sort dung rieng cho list
		//sort theo sản phẩm có chứa ID
		listPro.sort(Comparator.comparing(Product::getProId));
		listPro.sort(
			Comparator.comparing(Product::getProId)
					  .thenComparing(Product::getPrice)
//					  .reversed()
		);
		// dung cho tat ca cac collection
		Collections.sort(listPro, Comparator.comparing(Product::getProName));
		
		//theo thu tu desc
		Collections.sort(listPro, Collections.reverseOrder(Comparator.comparing(Product::getProName)));
		
	}
	
}

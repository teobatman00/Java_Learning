package menu;

import dao.ListProduct;
import helper.RegexConst;
import helper.Validation;

public class MenuShow {
	
	public static void callMenu() {
		ListProduct listPro = new ListProduct();
		boolean check = false;
		while(check) {
			System.out.println("===================");
			System.out.println("1. add product");
			System.out.println("2. show list product");
			System.out.println("3. delete product with proId ");
			System.out.println("4. update product with proId ");
			System.out.println("5. sort product by asc ");
			System.out.println("6. sort product by desc ");
			System.out.println("exit program, please enter anything else");
			System.out.println("===================");
			int choice = Integer.parseInt(Validation.CheckRegex(RegexConst.NUM, "enter choice")) ;
			switch (choice) {
				case 1 -> listPro.insertListProduct();
				case 2 -> listPro.selectListProduct();	
				case 3 -> {
					int proId = Integer.parseInt(Validation.CheckRegex(RegexConst.NUM, "enter choice")) ;
					listPro.deleteProIdInList(proId);
				} 
				case 4 -> {
					int proId = Integer.parseInt(Validation.CheckRegex(RegexConst.NUM, "enter choice")) ;
					listPro.deleteProIdInList(proId);
				} 
//				case 5 ->
				default -> check = false;
				
			}
	     }
	}
}

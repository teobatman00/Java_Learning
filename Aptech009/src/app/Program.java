package app;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import entity.Cat;

public class Program {

	public static void main(String[] args) {
//		int[] arr = new int[10];
		
		// Mang kieu Cat
		Cat[] arrCat = new Cat[3];
		arrCat[0] = new Cat("Con meo thu 0",1);
		arrCat[1] = new Cat("Con meo thu 0",2);
		arrCat[2] = new Cat("Con meo thu 0",3);
		
		for (int i = 0; i < arrCat.length; i++) {
			System.out.println(arrCat[i]);
		}
		
		for (Cat cat : arrCat) {
			System.out.println(cat);
		}
		
		//Arraylist: tương tự như mảng nhưng nhằm trong collection
		
		ArrayList<Object> alCat = new ArrayList<Object>();
		alCat.add(new Cat("Con mèo thứ 0",1));
		alCat.add("ahihihi");
		alCat.add(4);
		
//		for (Iterator iterator = alCat.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}

		for (Object obj : alCat) {
			System.out.println(obj);
		}
		
		System.out.println("==================================");
		
		for (Object object : alCat) {
			if (object instanceof Cat) {
				System.out.println(object);
			}
		}
		
		//generic (khi thấy có dấu <"?"> với ? là kiểu đưa vào => đưa về một kiểu chung nhất
		//java old
		ArrayList<Cat> arrayListCat = new ArrayList<Cat>();
		arrayListCat.add(new Cat("Con meo thu 3",1));
		arrayListCat.add(new Cat("Con meo thu 4",2));
		arrayListCat.add(new Cat("Con meo thu 5",3));
		
		//java new		
		ArrayList<Cat> arrayListCat2 = new ArrayList<>();
		arrayListCat2.add(new Cat("Con meo thu 3",1));
		arrayListCat2.add(new Cat("Con meo thu 4",2));
		arrayListCat2.add(new Cat("Con meo thu 5",3));
		
		//List cao hơn arrayList
		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("Con meo thu 3",4));
		list.add(new Cat("Con meo thu 4",5));
		list.add(new Cat("Con meo thu 5",6));
		
		//java 1.7 trở về trước
		for (Cat cat : list) {
			System.out.println(cat);
		}
		
		//java 1.8 => lambda cho phép duyệt qua các collection nhanh chóng
		//style viết theo lambda => method reference
		list.forEach(System.out::println);
		
		//style viết lambda theo truyền thống
		// -> tương đương {}
		// new trong dấu {} có nhiều hơn 1 câu lệnh thì vẫn để sau dấu ->
		list.forEach(cat->System.out.println(cat));
		
		//=== xét điều kiện
		System.out.println("111111111111");
		for(Cat cat: list) {
			if(cat.getAge()==2) {
				System.out.println(cat);
			}
		}
		
		System.out.println("2222222222222");
		list.forEach(cat->{
			if(cat.getAge()==2) {
				System.out.println(cat);
			}
		});
		
		//Len cao 1 chut nua
		//tang toc
		//buffer => stream
		//if =>filter trong stream
		list.stream().filter(cat->cat.getAge()==2).forEach(System.out::println);
		
		list.stream().filter(cat->cat.getAge()==2).forEach(cat->System.out.println(cat));
		
		//Xet nhieu dieu kien
		list.stream()
				.filter(cat->cat.getAge()==2 && cat.getName().contains("t"))
				.forEach(cat->System.out.println(cat));
		
		System.out.println("-----------------------");
		list.parallelStream()
		.filter(cat->Pattern.matches("[1-2]", cat.getAge()+" "))
		.forEach(cat->System.out.println(cat));

	}
}

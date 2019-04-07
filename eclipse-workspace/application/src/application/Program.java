package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		System.out.println("Enter the number of products: ");
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = s.next().charAt(0);
			System.out.print("Name: ");
			s.nextLine();
			String name = s.nextLine();
			System.out.print("Price: ");
			double price = s.nextDouble();
			if(c == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = s.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if (c == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date dt = sdf.parse(s.next());
				list.add(new UsedProduct(name, price, dt));
			}
			else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		s.close();
	}

}

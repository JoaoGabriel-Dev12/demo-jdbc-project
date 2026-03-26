package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellerDao dao = DaoFactory.createSellerDao();
		
		System.out.println("--------------- TEST 1 ---------------");
		Seller seller = dao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n--------------- TEST 2 ---------------");
		Department dep = new Department(2, null);
		List<Seller> list = dao.findbyDepartment(dep);
		list.forEach(s -> {
			System.out.println(s);
		});
		
		System.out.println("\n--------------- TEST 3 ---------------");
		list = dao.findAll();
		list.forEach(s -> {
			System.out.println(s);
		});
	}

}

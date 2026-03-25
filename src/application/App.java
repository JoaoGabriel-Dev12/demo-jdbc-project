package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellerDao dao = DaoFactory.createSellerDao();
		Seller seller = dao.findById(3);
		
		System.out.println(seller);
	}

}

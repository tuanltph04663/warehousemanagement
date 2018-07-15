package controller;

import java.util.List;

import model.Kho;
import model.KhoDAO;

public class Application {

	public static void main(String[] args) {
		
		KhoDAO khoDAO = new KhoDAO();
		List<Kho> khos = khoDAO.getAll();
		for (Kho kho : khos) {
			System.out.println(kho);
		}
	}

}

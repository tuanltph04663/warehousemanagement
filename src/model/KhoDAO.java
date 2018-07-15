package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBConn;

public class KhoDAO implements IDAO<Kho>{

	private Connection conn = null;
	
	public List<Kho> getAll(){
		List<Kho> khos = new ArrayList<>();
		
		try {
			conn = DBConn.getSQLServerConnection();
			String sql = "SELECT * FROM KHO";
			
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("TEN_KHO");
				Kho kho = new Kho(id, name);
				khos.add(kho);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
		
		return khos;
	}

	@Override
	public Kho findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Kho t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Kho t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Kho t) {
		// TODO Auto-generated method stub
		
	}
	
}

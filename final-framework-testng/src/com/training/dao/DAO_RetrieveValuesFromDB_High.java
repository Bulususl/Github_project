package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.Bean_RetrieveValuesFromDB_High;
import com.training.bean.LoginBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class DAO_RetrieveValuesFromDB_High {
	
	Properties properties; 

	
	public DAO_RetrieveValuesFromDB_High() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Bean_RetrieveValuesFromDB_High> getUniforms(){
		
String sql = properties.getProperty("get.uniform"); 
		
		GetConnection gc  = new GetConnection(); 
		List<Bean_RetrieveValuesFromDB_High> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<Bean_RetrieveValuesFromDB_High>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				Bean_RetrieveValuesFromDB_High temp = new Bean_RetrieveValuesFromDB_High(); 
				temp.setName(gc.rs1.getString(1));
				temp.setDescription(gc.rs1.getString(2));
				temp.setMetaTag(gc.rs1.getString(3));
				temp.setMetaTagD(gc.rs1.getString(4));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
		
	}
	
	public static void main(String[] args) {
		new DAO_RetrieveValuesFromDB_High().getUniforms().forEach(System.out :: println);
	}
	
}

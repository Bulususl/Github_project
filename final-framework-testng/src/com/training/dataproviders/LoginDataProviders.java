package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.Bean_RetrieveValuesFromDB_High;
import com.training.dao.ELearningDAO;
import com.training.dao.DAO_RetrieveValuesFromDB_High;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		//List<LoginBean> list = new ELearningDAO().getLogins();
		List<Bean_RetrieveValuesFromDB_High> list = new DAO_RetrieveValuesFromDB_High().getUniforms();
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(Bean_RetrieveValuesFromDB_High temp : list){
			Object[]  obj = new Object[4]; 
			obj[0] = temp.getName(); 
			obj[1] = temp.getDescription();
			obj[2] = temp.getMetaTag();
			obj[3] = temp.getMetaTagD();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:/Users/Naveen/Desktop/Testing.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}

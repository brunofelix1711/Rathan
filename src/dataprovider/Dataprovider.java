package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	  @DataProvider(name="rathan")
	public String [][] getdatafromdataprovider () {
		  return new String [][] {
			  {"felixbruno1993@gmail.com","password5"},
			  {"sarath@gmail.com","password5"}};
	  
  }
}


package assessmentchaining;

import io.restassured.RestAssured;

public class RestAssuredBase {
	
public static String sys_id;	

@BeforeMethod	
public void setup() 
{
	RestAssured.baseURI="https://dev83629.service-now.com/api/now/table";

}

}

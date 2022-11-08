package assessmentchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentchaining.PutIncidentWithFile.put")
	public void delete() {
    	
    	Response response = RestAssured.given().header("Authorization","Bearer tmTohkhJERJZKfqy4TNfJwVlS6uTUb5ozvmVgjFguQ3iCQVbkJfelfumjm80renOu_0ZFqhZ6217g_r9HCUInR")
    			.delete("/incident/"+sys_id);
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}

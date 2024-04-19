// ********RoostGPT********
/*
Test generated by RoostGPT for test dmtest-content-type using AI Type Azure Open AI and AI Model roostgpt-4-32k

Test generated for /kafka/v3/clusters/{cluster_id}/topics_get for http method type GET in rest-assured framework

RoostTestHash=5a89adf6e3


*/

// ********RoostGPT********
package org.springframework.RoostTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.Arrays;

public class kafkaV3ClustersClusterIdTopicsGetTest {

	List<Map<String, String>> envList = new ArrayList<>();

	@BeforeEach
	public void setUp() {
		TestdataLoader dataloader = new TestdataLoader();
		String[] envVarsList = { "cluster_id" };
		envList = dataloader.load(
				"src/test/java/org/springframework/RoostTest/kafka_v3_clusters_cluster_id_topicsGetTest.csv",
				envVarsList);
	}

	@Test
    public void kafkaV3ClustersClusterIdTopicsGet_Test() throws JSONException {
        this.setUp();
        Integer testNumber = 1;
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = (testData.get("BASE_URL") != null && !testData.get("BASE_URL").isEmpty()) ? testData.get("BASE_URL"): "https://api.confluent.cloud";

                Response responseObj = given()
				.header("Authorization", "Bearer " + testData.get("basic"))
                .when()
                .get("/kafka/v3/clusters/{cluster_id}/topics")
                .then()
                .extract().response();
              JsonPath response;
              String contentType = responseObj.getContentType();

              System.out.printf("Test Case %d: kafkaV3ClustersClusterIdTopicsGet_Test \n", testNumber++);
              System.out.println("Request: GET /kafka/v3/clusters/{cluster_id}/topics");
              System.out.println("Status Code: " + responseObj.statusCode());
              if (testData.get("statusCode") != null) {
                MatcherAssert.assertThat(responseObj.statusCode(),
                    equalTo(Integer.parseInt(testData.get("statusCode"))));
              }
             else{
                 List<Integer> expectedStatusCodes = Arrays.asList(200,400,401,403,429,5XX);
              MatcherAssert.assertThat(responseObj.statusCode(), is(in(expectedStatusCodes)));
                 }

        switch(responseObj.statusCode()){

          case 200:

          case 400:

          case 401:

          case 403:

          case 5XX:

           MatcherAssert.assertThat(contentType, equalTo("application/json"));
           break;

    }

              if (contentType.contains("application/xml") || contentType.contains("text/xml")) {
                String xmlResponse = responseObj.asString();
                JSONObject jsonResponse = XML.toJSONObject(xmlResponse);
                JSONObject jsonData = jsonResponse.getJSONObject("xml");
                String jsonString = jsonData.toString();
                response = new JsonPath(jsonString);

              } else if(contentType.contains("application/json")){
                response = responseObj.jsonPath();
              } else {
                System.out.println("Response content type found: "+contentType+", but RoostGPT currently only supports the following response content types: application/json,text/xml,application/xml");
                continue;
              }

                if (responseObj.statusCode() == 200) {
					System.out.println("Description: The list of topics.");
				}
if (responseObj.statusCode() == 400) {
					System.out.println("Description: Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure.");

              if (response.get("id") != null) {
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

          }

              if (response.get("status") != null) {
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
          }

              if (response.get("code") != null) {
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
          }

              if (response.get("title") != null) {
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
          }

              if (response.get("detail") != null) {
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
          }

              if (response.get("source") != null) {
              if (response.get("source.pointer") != null) {
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
          }

              if (response.get("source.parameter") != null) {
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
          }

          }

              if (response.get("error_code") != null) {
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
          }

              if (response.get("message") != null) {
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
          }
				}
if (responseObj.statusCode() == 401) {
					System.out.println("Description: Indicates a client authentication error. Kafka authentication failures will contain error code 40101 in the response body.");

              if (response.get("id") != null) {
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

          }

              if (response.get("status") != null) {
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
          }

              if (response.get("code") != null) {
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
          }

              if (response.get("title") != null) {
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
          }

              if (response.get("detail") != null) {
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
          }

              if (response.get("source") != null) {
              if (response.get("source.pointer") != null) {
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
          }

              if (response.get("source.parameter") != null) {
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
          }

          }

              if (response.get("error_code") != null) {
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
          }

              if (response.get("message") != null) {
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
          }
				}
if (responseObj.statusCode() == 403) {
					System.out.println("Description: Indicates a client authorization error. Kafka authorization failures will contain error code 40301 in the response body.");

              if (response.get("id") != null) {
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

          }

              if (response.get("status") != null) {
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
          }

              if (response.get("code") != null) {
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
          }

              if (response.get("title") != null) {
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
          }

              if (response.get("detail") != null) {
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
          }

              if (response.get("source") != null) {
              if (response.get("source.pointer") != null) {
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
          }

              if (response.get("source.parameter") != null) {
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
          }

          }

              if (response.get("error_code") != null) {
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
          }

              if (response.get("message") != null) {
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
          }
				}
if (responseObj.statusCode() == 429) {
					System.out.println("Description: Indicates that a rate limit threshold has been reached, and the client should retry again later.");
				}
if (responseObj.statusCode() == 5XX) {
					System.out.println("Description: A server-side problem that might not be addressable from the client side. Retriable Kafka errors will contain error code 50003 in the response body.");

              if (response.get("id") != null) {
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

          }

              if (response.get("status") != null) {
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
          }

              if (response.get("code") != null) {
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
          }

              if (response.get("title") != null) {
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
          }

              if (response.get("detail") != null) {
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
          }

              if (response.get("source") != null) {
              if (response.get("source.pointer") != null) {
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
          }

              if (response.get("source.parameter") != null) {
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
          }

          }

              if (response.get("error_code") != null) {
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
          }

              if (response.get("message") != null) {
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
          }
				}


            }
    }

}

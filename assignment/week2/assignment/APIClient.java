package week2.assignment;

public class APIClient{
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint+" "+requestBody+" "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient client=new APIClient();
		client.sendRequest("https://www.facebook.com/");
		client.sendRequest("https://theqalead.com/managing-leading/qa-interview-questions/", "valueData", true);
	}


}

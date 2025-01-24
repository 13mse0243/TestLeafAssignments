package week3.assignment.Polymorphism;

public class APIClient {
	public void sendRequest(String endpoint) {
        // Simulate sending a request to the endpoint
        System.out.println("Sending request to endpoint: " + endpoint);
    }
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        // Simulate sending a request with a request body
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        // Simulate a response based on request status
        if (requestStatus) {
            System.out.println("Request to " + endpoint + " was successful.");
        } else {
            System.out.println("Request to " + endpoint + " failed.");
        }
	}
	public static void main(String[] args) {
		APIClient apiClient = new APIClient();

        // Call the first version of sendRequest
        apiClient.sendRequest("https://api.com/data");

        // Call the overloaded version of sendRequest
        apiClient.sendRequest("https://api.com/data", "{ \"key\": \"value\" }", true);
	}
	

}

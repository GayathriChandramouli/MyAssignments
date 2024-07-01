package week2.assignment;

public class JavaConnection implements DataBaseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection Established");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update query executed");
	}
	
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}

}

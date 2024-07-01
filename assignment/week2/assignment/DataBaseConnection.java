package week2.assignment;

public interface DataBaseConnection {

	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();
	}

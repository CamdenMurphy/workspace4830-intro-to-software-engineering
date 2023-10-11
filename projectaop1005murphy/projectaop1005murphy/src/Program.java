
public class Program {
	public static void main(String[] args) {
		ComponentApp componentApp = new ComponentApp("COM");
		DataApp dataApp = new DataApp("DATA");
		ServiceApp serviceApp = new ServiceApp("SRC");

		String comName = componentApp.getName();
		System.out.println("  COM NAME: " + comName);

		String dataName = dataApp.getName();
		System.out.println("  DAT NAME: " + dataName);

		String srcName = serviceApp.getName();
		System.out.println("  SRC NAME: " + srcName);
	}
}



public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filePathName = "a.a.mp3";
		String extName=filePathName.substring( filePathName.lastIndexOf("."),filePathName.length());
		System.out.print(extName);
		System.out.print(extName.equalsIgnoreCase(".Mp3"));
	}

}

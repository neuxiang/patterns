package test.xstream;

public class TestXStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User a = new User();
		a.name="fdas!@##$%&**";
		a.set(10);
		a.marital=false;
		a.x.add("fdsafdsa");
		System.out.println(XmlUtil.toXml(a));
	}

}

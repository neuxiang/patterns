package test;

public interface Element {

	public String getName();
	public int getAge();
	public boolean getMartal();
	public <T extends BaseAdt>T getBaseAdt();
}

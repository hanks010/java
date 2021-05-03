package java0422;

public class GenericPrinter <T>{
	private T material;	//재료

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}

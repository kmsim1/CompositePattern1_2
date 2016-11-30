
public abstract class Item {
	private String name;
	private int size;
	
	public Item(String name) {
		this.name = name;
	}
	
	public abstract int getSize();
	public abstract void addItem(Item item);
}

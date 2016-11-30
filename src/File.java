
public class File extends Item {
	
	private int size;
	private int depth = 0;
	
	public File(String name, int size) {
		super(name);
		this.size = size;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public void addItem(Item item) {
		return;
	}
}

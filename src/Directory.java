import java.util.ArrayList;
import java.util.List;

public class Directory extends Item {
	
	private List<Item> items = new ArrayList<Item>();
	private int depth = 0;
	
	public Directory(String name) {
		super(name);
	}
	
	@Override
	public void addItem(Item item) {
		items.add(item);
	}
	
	@Override
	public int getSize() {
		int totalsize = 0;

		for (Item item: items) {
			totalsize += item.getSize();
		}
		
		return totalsize;
	}
}

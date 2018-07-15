package model;

public class Kho {

	private int id;
	private String name;

	public Kho(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kho [id=" + id + ", name=" + name + "]";
	}

}

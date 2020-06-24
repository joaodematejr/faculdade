package cesusc.edu.models;

public class Charters {

	private int id;
	private String merchandise;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerchandise() {
		return merchandise;
	}

	public void setMerchandise(String merchandise) {
		this.merchandise = merchandise;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Charters [id=" + id + ", merchandise=" + merchandise + ", description=" + description + "]";
	}

	public Charters(int id, String merchandise, String description) {
		super();
		this.id = id;
		this.merchandise = merchandise;
		this.description = description;
	}

}

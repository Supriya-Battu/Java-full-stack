package src;

public class WorkOut {

	//fields
	private String type;
	private String equiment;
	private int weight;
	private int repetitions;
	private String reason;
	//methods
	public String getType() {
		return type;
	}
	//Constructors
	public WorkOut(String type, String equiment, int weight, int repetitions, String reason) {
		super();
		this.type = type;
		this.equiment = equiment;
		this.weight = weight;
		this.repetitions = repetitions;
		this.reason = reason;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEquiment() {
		return equiment;
	}
	public void setEquiment(String equiment) {
		this.equiment = equiment;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getRepetitions() {
		return repetitions;
	}
	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	//to string
	@Override
	public String toString() {
		return "WorkOut [type=" + type + ", equiment=" + equiment + ", weight=" + weight + ", repetitions="
				+ repetitions + ", reason=" + reason + "]";
	}
	
}

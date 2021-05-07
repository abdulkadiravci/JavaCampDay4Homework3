
public class Campaign {

	private int campaingId;
	private String campaingName;
	private int campaingDay;
	private double discount;
	
	public Campaign(int campaingId, String campaingName, int campaingDay, double discount) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingDay = campaingDay;
		this.discount=discount;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getCampaingDay() {
		return campaingDay;
	}

	public void setCampaingDay(int campaingDay) {
		this.campaingDay = campaingDay;
	}
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}

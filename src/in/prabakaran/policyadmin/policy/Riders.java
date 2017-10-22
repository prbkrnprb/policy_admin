package in.prabakaran.policyadmin.policy;

public class Riders {
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPremium() {
		return premium;
	}
	public void setPremium(float premium) {
		this.premium = premium;
	}
	public double getFaceAmount() {
		return faceAmount;
	}
	public void setFaceAmount(double faceAmount) {
		this.faceAmount = faceAmount;
	}
	private String type;
	private float premium;
	private double faceAmount;
}

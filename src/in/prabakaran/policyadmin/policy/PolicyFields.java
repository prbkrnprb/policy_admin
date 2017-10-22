package in.prabakaran.policyadmin.policy;

import java.time.LocalDate;
import java.util.List;

public class PolicyFields {
	private String policyNumber;
	private String insuredName;
	private String ownerName;
	private String benName;
	private LocalDate policyDate;
	private LocalDate issueDate;
	private double faceAmount;
	private String product;
	private String type;
	private String rating;
	private short age;
	private float basePremium;
	private float modalPremium;
	private String modePremium;
	private String billType;
	private LocalDate paidToDate;
	private List<Riders> riders;
	
	public PolicyFields() {
		issueDate = LocalDate.now();
	}
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getBenName() {
		return benName;
	}
	public void setBenName(String benName) {
		this.benName = benName;
	}
	public LocalDate getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(LocalDate policyDate) {
		this.policyDate = policyDate;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public double getFaceAmount() {
		return faceAmount;
	}
	public void setFaceAmount(double faceAmount) {
		this.faceAmount = faceAmount;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public float getBasePremium() {
		return basePremium;
	}
	public void setBasePremium(float basePremium) {
		this.basePremium = basePremium;
	}
	public float getModalPremium() {
		return modalPremium;
	}
	public void setModalPremium(float modalPremium) {
		this.modalPremium = modalPremium;
	}
	public String getModePremium() {
		return modePremium;
	}
	public void setModePremium(String modePremium) {
		this.modePremium = modePremium;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public LocalDate getPaidToDate() {
		return paidToDate;
	}
	public void setPaidToDate(LocalDate paidToDate) {
		this.paidToDate = paidToDate;
	}
	public List<Riders> getRiders() {
		return riders;
	}
	public void setRiders(List<Riders> riders) {
		this.riders = riders;
	}
	
}

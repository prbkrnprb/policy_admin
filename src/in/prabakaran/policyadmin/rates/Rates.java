package in.prabakaran.policyadmin.rates;
import static in.prabakaran.policyadmin.rates.RateFactors.*;

public class Rates{
	
	public float getPremiumRate(String type) throws Exception {
		switch (type) {
		case "A":
			return TYPE_A;
		case "B":
			return TYPE_B;
		default:
			throw new Exception("Invalid type or type not supported");
		}
	}
	
	public float getCashValueFactor(String product, String type) throws Exception{
		float productFactor;
		float typeFactor;
		
		switch(product) {
		case "A":
			productFactor = PRODUCT_A;
			break;
		case "B":
			productFactor = PRODUCT_B;
			break;
		default:
			throw new Exception("Invalid type or type not supported");
		}
		switch(type) {
		case "A":
			typeFactor = PRODUCT_A;
			break;
		case "B":
			typeFactor = PRODUCT_B;
			break;
		default:
			throw new Exception("Invalid type or type not supported");
		}
		return productFactor * typeFactor;
	}

}

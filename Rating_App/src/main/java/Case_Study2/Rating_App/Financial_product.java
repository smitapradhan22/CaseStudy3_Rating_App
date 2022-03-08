package Case_Study2.Rating_App;

public class Financial_product {
private int financial_product;
private String financial_product_name;
private int rating;
private Review review;

public int getFinancial_product() {
	return financial_product;
}
public void setFinancial_product(int financial_product) {
	this.financial_product = financial_product;
}
public String getFinancial_product_name() {
	return financial_product_name;
}
public void setFinancial_product_name(String financial_product_name) {
	this.financial_product_name = financial_product_name;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public Review getReview() {
	return review;
}
public void setReview(Review review) {
	this.review = review;
}
public Financial_product(Review review) {
	super();
	this.review = review;
}

public Financial_product() {
	super();
	// TODO Auto-generated constructor stub
}


}

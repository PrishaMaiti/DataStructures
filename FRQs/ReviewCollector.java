import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> productReviewList;

    public ReviewCollector() {
        productReviewList = new ArrayList<ProductReview>();
    }

    public ReviewCollector(ArrayList<ProductReview> prList) {
        productReviewList = prList;
    }

    public void addReview(ProductReview prodReview) {
        productReviewList.add(prodReview);
    }

    public int getNumGoodReviews(String prodName) {
        int numGoodReviews = 0;
        for(int i = 0; i < productReviewList.size(); i++) {
            ProductReview pr = productReviewList.get(i);
            if(pr.getName().equals(prodName) && pr.getReview().contains("best")) {
                numGoodReviews++;
            }
        }
        return numGoodReviews;
    }
}
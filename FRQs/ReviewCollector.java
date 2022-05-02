public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        productList.add(prodReview.name);
    }

    public int getNumGoodReviews(String prodName) {
        int numGoodReviews = 0;
        for(int i = 0; i < productList.size(); i++) {
            if(productList.get(i).contains("best")) {
                numGoodReviews++;
            }
        }
        return numGoodReviews;
    }
}
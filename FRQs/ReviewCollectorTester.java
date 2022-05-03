import java.util.ArrayList;

public class ReviewCollectorTester {

    public static ArrayList<ProductReview> buildProductReviewList() {
        ArrayList<ProductReview> prList = new ArrayList<ProductReview>();
        prList.add(new ProductReview("iPhone13", "This is the best product I've ever used!"));
        prList.add(new ProductReview("iPhone7", "This is very good!"));
        prList.add(new ProductReview("iPhone13", "Not the best I have used so far"));
        prList.add(new ProductReview("iPhone13", "Best Best!"));
        return prList;
    }

    public static void testCase1() {
        ReviewCollector reviewCollect = new ReviewCollector(); // use ctor empty
        reviewCollect.addReview(new ProductReview("iPhone13", "This is the best product I've ever used!"));
        reviewCollect.addReview(new ProductReview("iPhone7", "This is very good!"));
        reviewCollect.addReview(new ProductReview("iPhone13", "Not the best I have used so far"));
        reviewCollect.addReview(new ProductReview("iPhone13", "Best Best best!"));

        System.out.println("Good Reviewes = " + reviewCollect.getNumGoodReviews("iPhone7"));
    }

    public static void testCase2() { // test case for part b
        ReviewCollector reviewCollect = new ReviewCollector(buildProductReviewList());
        System.out.println("Good Reviewes = " + reviewCollect.getNumGoodReviews("iPhone13"));
    }

    public static void main(String[] args) {
        testCase1();
        //testCase2();
    }
}
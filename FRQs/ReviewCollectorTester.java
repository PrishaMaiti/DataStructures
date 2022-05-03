import java.util.ArrayList;

public class ReviewCollectorTester {

    public static ArrayList<String> buildReviewList() { // test case for part a
        
    }

    public static void testCase2() { // test case for part b
        ArrayList<String> reviewList = buildReviewList();
        ReviewCollector reviewCollect = new ReviewCollector();
        System.out.println(reviewCollect.getNumGoodReviews("games"));
    }

    public static void main(String[] args) {
        //testCase1();
        testCase2();
    }
}
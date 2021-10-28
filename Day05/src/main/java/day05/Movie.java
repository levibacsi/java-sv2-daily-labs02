package day05;

public class Movie {
    private String title;
    private int year;
    private double avgRating;
    private int numberOfRatings;
    private int sumOfRatings;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public int getSumOfRatings() {
        return sumOfRatings;
    }

    public void setSumOfRatings(int sumOfRatings) {
        this.sumOfRatings = sumOfRatings;
    }

    public double calculateRating (int rating){
        numberOfRatings ++;
        sumOfRatings += rating;
        avgRating = (double) sumOfRatings/numberOfRatings;
        return avgRating;
    }
}

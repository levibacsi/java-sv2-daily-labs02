package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("WALL-E", 2008);
        Viewer viewer = new Viewer();

        viewer.watchMovie(movie, 4);
        viewer.watchMovie(movie, 5);
        viewer.watchMovie(movie, 3);
        viewer.watchMovie(movie, 5);
        viewer.watchMovie(movie, 5);


        System.out.println(movie.calculateRating(4));
        System.out.println(movie.calculateRating(5));
    }
}

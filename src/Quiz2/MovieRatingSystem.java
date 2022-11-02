package Quiz2;

import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Movie[] movies = new Movie[9];
        movies[0] = new Movie("Movie 1", 'A', 9, 2022, 5);
        movies[1] = new Movie("Movie 2", 'B', 8, 2021, 4);
        movies[2] = new Movie("Movie 3", 'C', 7, 2021, 3);
        movies[3] = new Movie("Movie 4", 'D', 6, 2020, 1);
        movies[4] = new Movie("Movie 5", 'A', 8, 2010, 1);
        movies[5] = new Movie("Movie 6", 'B', 8, 2019, 5);
        movies[6] = new Movie("Movie 7", 'C', 6, 2022, 4);
        movies[7] = new Movie("Movie 8", 'D', 7, 1988, 3);
        movies[8] = new Movie("Movie 9", 'E', 2, 1994, 2);
        System.out.println("Choice the sorting method:");
        System.out.println("1. Sort by rating");
        System.out.println("2. Sort by popularity");
        System.out.println("3. Sort by year");
        System.out.print("Your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                MyPriorityQueue<MovieRating> movieRatingQueue = new MyPriorityQueue<>();
                for (int i = 0; i < movies.length; i++) {
                    movieRatingQueue.enqueue(new MovieRating(movies[i].getMovieName(), movies[i].getRating()));
                }
                System.out.println("The movies (sorted by rating) are:");
                while (movieRatingQueue.getSize() > 0) {
                    System.out.println(movieRatingQueue.dequeue());
                }
                break;
            case 2:
                MyPriorityQueue<MoviePopularity> moviePopularityQueue = new MyPriorityQueue<>();
                for (int i = 0; i < movies.length; i++) {
                    moviePopularityQueue.enqueue(new MoviePopularity(movies[i].getMovieName(), movies[i].getPopularity()));
                }
                System.out.println("The movies (sorted by popularity) are:");
                while (moviePopularityQueue.getSize() > 0) {
                    System.out.println(moviePopularityQueue.dequeue());
                }
                break;
            case 3:
                MyPriorityQueue<MovieDate> movieDateQueue = new MyPriorityQueue<>();
                for (int i = 0; i < movies.length; i++) {
                    movieDateQueue.enqueue(new MovieDate(movies[i].getMovieName(), movies[i].getYear(), movies[i].getMonth()));
                }
                System.out.println("The movies (sorted by date) are:");
                while (movieDateQueue.getSize() > 0) {
                    System.out.println(movieDateQueue.dequeue());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}

class Movie {
    String movieName;
    char rating;
    int popularity;
    int year;
    int month;

    public Movie(String name, char rating, int popularity, int year, int month) {
        this.movieName = name;
        this.rating = rating;
        this.popularity = popularity;
        this.year = year;
        this.month = month;
    }

    public String getMovieName() {
        return movieName;
    }

    public char getRating() {
        return rating;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

}

class MovieRating implements Comparable<MovieRating> {
    String movieName;
    char rating;

    public MovieRating(String movieName, char rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public String toString() {
        return movieName + " " + rating;
    }

    public int compareTo(MovieRating o) {
        return o.rating - rating;
    }

}

class MoviePopularity implements Comparable<MoviePopularity> {
    String movieName;
    int popularity;

    public MoviePopularity(String movieName, int popularity) {
        this.movieName = movieName;
        this.popularity = popularity;
    }

    public String toString() {
        return movieName + " " + popularity;
    }

    public int compareTo(MoviePopularity o) {
        return this.popularity - o.popularity;
    }

}

class MovieDate implements Comparable<MovieDate> {
    String movieName;
    int year, month;

    public MovieDate(String movieName, int year, int month) {
        this.movieName = movieName;
        this.year = year;
        this.month = month;
    }

    public String toString() {
        return movieName + " " + year + "." + month;
    }

    public int compareTo(MovieDate o) {
        if (this.year > o.year) {
            return 1;
        } else if (this.year < o.year) {
            return -1;
        } else {
            return this.month - o.month;
        }
    }
}

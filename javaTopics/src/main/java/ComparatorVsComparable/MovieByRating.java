package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class MovieByRating implements Comparable<MovieByRating> {
    String name;
    int year;
    double rating;

    public MovieByRating() {
    }

    public MovieByRating(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(MovieByRating o) {
        if(this.getRating() == o.getRating())
            return 0;
        else if(this.getRating() > o.getRating())
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        ArrayList<MovieByRating> list = new ArrayList<>();
        list.add(new MovieByRating("Up",2015,8.2));
        list.add(new MovieByRating("Dragon Balls", 2020,5.0));
        list.add(new MovieByRating("Transformers", 2009,7.5));
        list.add(new MovieByRating("Hulk",2022,7.0));
        System.out.println("sorted sequence by rating: ");
        Collections.sort(list);
        for(MovieByRating movie: list){
            System.out.println(movie.getRating()+" "+movie.getName()+" "+movie.getYear());
        }
    }
}

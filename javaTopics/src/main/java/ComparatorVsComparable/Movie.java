package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{

    String name;
    int year;
    double rating;

    public Movie() {
    }

    public Movie(String name, int year, double rating) {
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
    public int compareTo(Movie o) {
        return this.getName().compareTo(o.getName());

    }

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Up",2015,8.2));
        list.add(new Movie("Dragon Balls", 2020,5.0));
        list.add(new Movie("Transformers", 2009,7.5));
        list.add(new Movie("Hulk",2022,7.0));
        System.out.println("sorted sequence by names: ");
        Collections.sort(list);
        for(Movie movie:list){
            System.out.println(movie.getName()+" "+movie.getRating()+ " "+ movie.getYear());
        }
    }
}

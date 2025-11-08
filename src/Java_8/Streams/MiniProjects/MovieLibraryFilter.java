package Java_8.Streams.MiniProjects;

import java.util.List;
import java.util.stream.Collectors;

public class MovieLibraryFilter{
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Inception", "Action", 8.8),
                new Movie("Frozen", "Animation", 7.4),
                new Movie("John Wick", "Action", 8.5),
                new Movie("Parasite", "Thriller", 9.1),
                new Movie("Avengers: Endgame", "Superhero", 8.9),
                new Movie("The Shawshank Redemption", "Drama", 9.9),
                new Movie("Joker", "Crime", 9.2),
                new Movie("Titanic", "Romance", 8.8),
                new Movie("The Godfather", "Crime", 9.9),
                new Movie("Forrest Gump", "Drama", 9.6),
                new Movie("Gladiator", "Action", 9.3),
                new Movie("Whiplash", "Drama", 9.4),
                new Movie("The Matrix", "Sci-Fi", 9.7),
                new Movie("Spider-Man: No Way Home", "Superhero", 8.7),
                new Movie("Oppenheimer", "Biography", 9.8),
                new Movie("La La Land", "Musical", 8.9),
                new Movie("The Social Network", "Biography", 8.8),
                new Movie("Mad Max: Fury Road", "Action", 9.2),
                new Movie("The Prestige", "Mystery", 9.3),
                new Movie("Dune", "Sci-Fi", 9.4),
                new Movie("The Martian", "Sci-Fi", 8.9),
                new Movie("Gravity", "Sci-Fi", 8.7),
                new Movie("Edge of Tomorrow", "Action", 8.6),
                new Movie("Gone Girl", "Thriller", 8.5),
                new Movie("Blade Runner 2049", "Sci-Fi", 9.0),
                new Movie("Arrival", "Sci-Fi", 8.8),
                new Movie("The Hateful Eight", "Western", 8.4),
                new Movie("Django Unchained", "Western", 9.1),
                new Movie("The Irishman", "Crime", 8.6),
                new Movie("Prisoners", "Thriller", 8.9),
                new Movie("No Country for Old Men", "Crime", 9.0),
                new Movie("Fight Club", "Drama", 9.8),
                new Movie("The Silence of the Lambs", "Thriller", 9.2),
                new Movie("Se7en", "Crime", 9.1),
                new Movie("The Departed", "Crime", 9.0),
                new Movie("Shrek", "Animation", 8.5),
                new Movie("Finding Nemo", "Animation", 8.8),
                new Movie("Toy Story", "Animation", 9.0),
                new Movie("Up", "Animation", 8.9),
                new Movie("Ratatouille", "Animation", 8.9),
                new Movie("Zootopia", "Animation", 8.7),
                new Movie("Encanto", "Animation", 8.3),
                new Movie("Frozen", "Animation", 8.6),
                new Movie("Moana", "Animation", 8.7),
                new Movie("WALL·E", "Animation", 9.3),
                new Movie("Inside Man", "Thriller", 8.6),
                new Movie("John Wick", "Action", 8.8),
                new Movie("Top Gun: Maverick", "Action", 9.1),
                new Movie("Skyfall", "Action", 8.7),
                new Movie("Casino Royale", "Action", 8.8),
                new Movie("A Beautiful Mind", "Biography", 9.0),
                new Movie("The Theory of Everything", "Biography", 8.8),
                new Movie("The Pursuit of Happyness", "Drama", 9.1),
                new Movie("Cast Away", "Adventure", 8.7),
                new Movie("The Truman Show", "Drama", 8.9),
                new Movie("The Green Mile", "Drama", 9.6),
                new Movie("Good Will Hunting", "Drama", 9.2),
                new Movie("The Curious Case of Benjamin Button", "Fantasy", 8.8),
                new Movie("The Sixth Sense", "Mystery", 9.0),
                new Movie("Interstate 60", "Fantasy", 8.5)
        );
        System.out.println(movies.stream().filter( x -> x.genre.equals("Action") && x.rating > 8).map( x -> x.title).collect(Collectors.toList()));
    }
}
class Movie{
    String title , genre;
    double rating;
    Movie(String title , String genre , double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
}
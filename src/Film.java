public class Film {
    private int id;
    private String name;
    private int year;
    private double rating;

    public Film(int id, String name, int year, double rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public int getId() {
        return id;
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
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    static class FilmApp {
        private Film[] films;

        public FilmApp() {
            // Inisialisasi data film
            films = new Film[5];
            films[0] = new Film(1, "The Flash", 2023, 7.3);
            films[1] = new Film(2, "Spiderman", 2023, 9.0);
            films[2] = new Film(3, "Transformer", 2023, 6.6);
            films[3] = new Film(4, "Avatar", 2022, 7.6);
            films[4] = new Film(5, "The Little Mermaid", 2023, 7.2);
        }

        public void displayFilms() {
            for (Film film : films) {
                System.out.println(film);
            }
        }

        public void sortByRating() {
            int n = films.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (films[j].getRating() < films[minIndex].getRating()) {
                        minIndex = j;
                    }
                }
                Film temp = films[minIndex];
                films[minIndex] = films[i];
                films[i] = temp;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            FilmApp filmApp = new FilmApp();
            System.out.println("Daftar Film Sebelum Diurutkan:");
            filmApp.displayFilms();

            System.out.println("\nDaftar Film Setelah Diurutkan berdasarkan Rating:");
            filmApp.sortByRating();
            filmApp.displayFilms();
        }
    }
}

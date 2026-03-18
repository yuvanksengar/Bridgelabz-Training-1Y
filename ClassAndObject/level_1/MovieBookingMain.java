class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";
        this.price = 0.0;
    }

    void bookTicket(String seat, double ticketPrice) {
        this.seatNumber = seat;
        this.price = ticketPrice;
        System.out.println("Booking confirmed for " + movieName);
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

public class MovieBookingMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.bookTicket("A12", 250.0);
        ticket.displayTicket();
    }
}
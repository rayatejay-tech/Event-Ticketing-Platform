public class LoadHandler {

    public synchronized void bookTicket(Event event, int tickets) {

        if (event.getAvailableSeats() >= tickets) {

            event.setAvailableSeats(event.getAvailableSeats() - tickets);

            System.out.println("Booking Successful");

            System.out.println("Remaining Seats : "
                    + event.getAvailableSeats());

        } else {

            System.out.println("Tickets Sold Out");

        }

    }

}
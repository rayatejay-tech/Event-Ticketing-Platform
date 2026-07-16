public class Booking {

    private int bookingId;
    private int userId;
    private int eventId;
    private int tickets;

    public Booking() {
    }

    public Booking(int bookingId, int userId, int eventId, int tickets) {

        this.bookingId = bookingId;
        this.userId = userId;
        this.eventId = eventId;
        this.tickets = tickets;

    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

}
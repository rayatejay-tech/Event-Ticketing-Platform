import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== EVENT TICKETING PLATFORM =====");
            System.out.println("1. View Events");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        Connection con = DBConnection.getConnection();
                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery("SELECT * FROM events");

                        System.out.println("\n===== EVENTS =====");

                        while (rs.next()) {
                            System.out.println("Event ID : " + rs.getInt("event_id"));
                            System.out.println("Event Name : " + rs.getString("event_name"));
                            System.out.println("Total Seats : " + rs.getInt("total_seats"));
                            System.out.println("Available Seats : " + rs.getInt("available_seats"));
                            System.out.println("------------------------------");
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.print("Enter Event ID:");
                    int id = sc.nextInt();

                    System.out.print("Enter Tickets:");
                    int tickets = sc.nextInt();

                    try{
                        Connection con = DBConnection.getConnection();
                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery("SELECT available_seats FROM events WHERE event_id = " + id);

                        if(rs.next()){
                            int available= rs.getInt("available_seats");

                            if(available >= tickets){

                                int remaining = available - tickets;

                                st.executeUpdate("UPDATE events SET available_seats = " + remaining + " WHERE event_id = " + id);

                                st.executeUpdate("INSERT INTO bookings (user_id,event_id, tickets) VALUES (1," + id + ", " + tickets + ")");

                                System.out.println("Booking Successful");

                                System.out.println("Remaining Seats : " + remaining);
                            } else {
                                System.out.println("Not enough tickets available.");
                            }
                        } else {
                            System.out.println("Invalid Event ID.");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
                            // Update the available seats in the database
                            
                
                    

                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
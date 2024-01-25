import java.sql.*;

public class Showstudentjdbc {
    public static void main(String[] args) throws Exception {
        /*
            1. import package
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process & result
            7. close
        */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "root";
        String sql = "select * from student";

        // Loading the driver and this is the option part JDBC automatically handel this.
        Class.forName("org.postgresql.Driver");
        // creating a connection. As Connection is an interface we can't create object of it. So, we need to check the implementation and getConnection method return the Connection object from DriverManager class.
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

        Statement st = con.createStatement(); // sending the sql statement to the database.
        ResultSet rs = st.executeQuery(sql); // executing the given sql statement
//        rs.next();  // checking result is present in not in next data
//        String name = rs.getString("sname"); // storing the sname column data
//        System.out.println("Name of the student is: " + name);

        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }


        con.close(); // JDBC connection close.
        System.out.println("Connection closed");
    }
}

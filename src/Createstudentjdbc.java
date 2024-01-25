import java.sql.*;

public class Createstudentjdbc {
    public static void main(String[] args) throws Exception {

        int sid = 101;
        String name = "Ritesh";
        int marks = 51;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "root";
        String sql = "insert into student values (?,?,?)";

        // creating a connection. As Connection is an interface we can't create object of it. So, we need to check the implementation and getConnection method return the Connection object from DriverManager class.
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

        PreparedStatement st = con.prepareStatement(sql); // create a preparedstatement object sending parameterized a sql statement to database
        st.setInt(1, sid);
        st.setString(2, name);
        st.setInt(3, marks);
        st.execute(); // executing the given sql statement
        con.close(); // JDBC connection close.
        System.out.println("Connection closed");
    }
}

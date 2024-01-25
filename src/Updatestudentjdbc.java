import java.sql.*;

public class Updatestudentjdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "root";

        String sql = "update student set sname='Max' where sid=101";
        Connection con = DriverManager.getConnection(url,user,password); // connection established
        System.out.println("Connection Established");
        Statement st = con.createStatement(); // sending SQL statement to the database
        boolean status = st.execute(sql); // execute the sql query
        System.out.println(status);
        con.close();
        System.out.println("Connection close...!");


    }

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Deletestudentjdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "root";

        String sql = "delete from student where sid=101";
        Connection con = DriverManager.getConnection(url,user,password); // connection established
        System.out.println("Connection Established");
        Statement st = con.createStatement(); // sending sql statement to the database.
        st.execute(sql);
        con.close();
        System.out.println("Connection close...!");
    }
}

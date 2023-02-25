
package Orange.DataBase;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConetionDataBase {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://AV-27365:1433; databaseName= OrangeHrm", "SAP", "Londres2024%");

        }catch (Exception e){
            con = null;
            e.printStackTrace();
        }
        return con;
    }
}
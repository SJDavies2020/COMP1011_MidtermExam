import java.sql.*;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DBUtil {
    // User Name and Password
    private static String user="stevendavies";
    private static String password="Bonnied029$";

    public static ArrayList<AthleteModel> getAllAthletes() throws SQLException {

        ArrayList<AthleteModel> Athletes = new ArrayList<>();

        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1 Define the Connection String
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/f20comp1011test1", user, password);
            // 2 Create the SQL Command to Retrieve Data

            statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // 3 Execute the SQL to get the data and place in

            ResultSet rs = statement.executeQuery("SELECT * FROM tblCharsStat");

            rs.last();

            int totalRowsResult = rs.getRow() ;

            resultSet = statement.executeQuery("SELECT * FROM tblCharsStat");
            // 4 Loop over Data (12 Rows make up 1 Object)
            resultSet.first();

            for (int b = 1; b <= totalRowsResult ; b++)
            {
                int id;
                int year ;
                String firstName;
                String lastName;
                String gender;
                double run1;
                double run2;

                ArrayList<String> arrlist = new ArrayList<String>(totalRowsResult);

                arrlist.add(resultSet.getString(String.valueOf("id")));

                String fullName = resultSet.getString(String.valueOf("FullName"));

                String[] splitName = fullName.split(" ");
                arrlist.add(resultSet.getString(splitName[1]));
                arrlist.add(resultSet.getString(splitName[2]));
                arrlist.add(resultSet.getString(String.valueOf("Gender")));
                arrlist.add(resultSet.getString(String.valueOf("yearOfBirth")));
                arrlist.add(resultSet.getString(String.valueOf("run1")));
                arrlist.add(resultSet.getString(String.valueOf("run2")));

                AthleteModel newCharCharacter = new AthleteModel(Integer.parseInt(arrlist.get(0)), Integer.parseInt(arrlist.get(1)), arrlist.get(2), arrlist.get(3), arrlist.get(4), Double.parseDouble(arrlist.get(5)), Double.parseDouble(arrlist.get(6)));

                Athletes.add(newCharCharacter);
            }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            if (conn != null)
            {
                conn.close();
            }
            if (statement != null)
            {
                statement.close();
            }
            if (resultSet !=null)
            {
                resultSet.close();
            }
            return Athletes;
        }
    }
    public static int getRows(ResultSet res){
        int totalRows = 0;
        try {
            res.last();
            totalRows = res.getRow();
            res.beforeFirst();
        }
        catch(Exception ex)  {
            return 0;
        }
        return totalRows ;
    }
}

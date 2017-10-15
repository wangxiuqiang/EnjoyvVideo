package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class selectSql {
    private String url = "jdbc:mysql://localhost:3306/exam";
    private String user = "root";
    private String password = "root";

    /**
     * jdbc查询的类
     *
     * @throws Exception
     */
    public String select() {
        String result2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select name from teacher where name LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "jack");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                result2 = rs.getString("name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result2;
    }


}

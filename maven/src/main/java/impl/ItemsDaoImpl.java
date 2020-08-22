package impl;

import dao.ItemsDao;
import domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsDaoImpl implements ItemsDao {
    public List<Items> findAll() throws Exception {List<Items>list = new ArrayList<Items>();
        Connection connection=null;
        PreparedStatement pst=null;
        ResultSet rs =null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven?useSSL=false&serverTimezone=UTC"
                    ,"root", "19980928");
            pst = connection.prepareCall("select * from items");
            rs = pst.executeQuery();

            while (rs.next()){
                Items items = new Items();
                items.setId(rs.getInt("id"));
                items.setName(rs.getString("name"));
                list.add(items);
            }
        }
        catch (Exception e  )
        {
            e.printStackTrace();
        }finally {


            rs.close();connection.close();pst.close();
        }
        return list;
    }
}

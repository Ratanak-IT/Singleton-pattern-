package co.istad.jdbc.dao;

import co.istad.jdbc.config.DbConfig;
import co.istad.jdbc.model.Items;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsImpl implements ItemsDao {

    private final Connection conn;
    public ItemsImpl() {
        conn = DbConfig.getConn();
    }
    @Override
    public List<Items> findAll() {
        //step 4 : create connect object
        try {
            Statement stmt= conn.createStatement();
            //step 5: start executing SQL Query
            final String sql= """
                    SELECT * 
                    FROM items
                    """;
            //step 6: handle the ResultSet
            ResultSet rs=stmt.executeQuery(sql);
            List<Items> itemsList=new ArrayList<>();
            //multiple rows
            while (rs.next()){
                Items items=new Items();
                items.setId(rs.getInt("id"));
                items.setCode(rs.getString("code"));
                items.setName(rs.getString("name"));
                items.setPrice(BigDecimal.valueOf(rs.getDouble("price")));
                items.setQuantity(rs.getInt("qty"));
                items.setDeleted(rs.getBoolean("is_deleted"));
                itemsList.add(items);
            }
            return itemsList;
        }catch (SQLException e){
            System.out.println("SQL error..."+e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}

package co.istad.jdbc.dao;

import co.istad.jdbc.model.Items;

import java.util.List;

public interface ItemsDao {
    //1. Read all records from DB
    //* Expected return value
    //* parameters if have
    List<Items> findAll();
}

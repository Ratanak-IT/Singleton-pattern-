package co.istad.jdbc;

import co.istad.jdbc.config.DbConfig;
import co.istad.jdbc.dao.ItemsImpl;
import co.istad.jdbc.inputUtil.InputUtil;
import co.istad.jdbc.model.Items;
import co.istad.jdbc.view.View;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        DbConfig.init();
        Connection conn = DbConfig.getConn();
//        System.out.println(conn);
        do {
            View.printAppMenu();
            int menu= InputUtil.readInt("Enter your option: ");
            switch (menu){
                case 1-> {
                    System.out.println("List Items");
                    List<Items> itemsList=new ItemsImpl().findAll();
                    View.table(itemsList);
                }
                case 2-> System.out.println("Add Item");
                case 3-> System.out.println("Update Item");
                case 4-> System.out.println("Delete Item");
                case 0-> System.exit(0);
                default -> System.out.println("Invalid option");
            }
        }while (true);

    }
}

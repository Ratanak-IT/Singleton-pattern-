package co.istad.jdbc.view;

import co.istad.jdbc.model.Items;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class View {
    public static void printAppMenu() {
        System.out.println("Welcome to JDBC System");
        System.out.println("--------------");
        System.out.println("""
                1. List Articles
                2. Add Article
                3. Update Article
                4. Delete Article
                5. Exit
                """);
    }
    public static void table(Items items) {
        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("PRICE");
        table.addCell("QTY");
        table.addCell("IS_DELETED");

        table.addCell(String.valueOf(items.getId()));
        table.addCell(items.getCode());
        table.addCell(items.getName());
        table.addCell(items.getPrice().toString());
        table.addCell(String.valueOf(items.getQuantity()));
        table.addCell(String.valueOf(items.getIsDeleted()));

        print(table.render(), true);
    }


    public static void table(List<Items> itemsList) {
        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("PRICE");
        table.addCell("QTY");
        table.addCell("IS_DELETED");

        for (Items items : itemsList) {
            table.addCell(String.valueOf(items.getId()));
            table.addCell(items.getCode());
            table.addCell(items.getName());
            table.addCell(items.getPrice().toString());
            table.addCell(String.valueOf(items.getQuantity()));
            table.addCell(String.valueOf(items.getIsDeleted()));
        }

        print(table.render(), true);
    }

    public static void print(String text, boolean b){
        System.out.println(text);
    }
}

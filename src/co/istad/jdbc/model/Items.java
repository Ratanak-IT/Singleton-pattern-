package co.istad.jdbc.model;

import java.math.BigDecimal;

public class Items {
    private int id;
    private String code;
    private String name;
    private BigDecimal price;
    private int quantity;
    private boolean isDeleted;

    public Items() {
    }
    public Items(boolean isDeleted, int quantity, BigDecimal price, String name, String code) {
        this.isDeleted = isDeleted;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
    public boolean getIsDeleted() {
        return isDeleted;
    }
}

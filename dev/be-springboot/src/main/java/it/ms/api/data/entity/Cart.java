package it.ms.api.data.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cart_id;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "product_id")
    private long product_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "added_at")
    private Timestamp added_at;

    public Cart() {
        
    }

    public Cart(long user_id, long product_id, int quantity, Timestamp added_at) {
        this.user_id = user_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.added_at = added_at;
    }

    public long getCartId() {
        return cart_id;
    }

    public long getUserId() {
        return user_id;
    }

    public void setUserId(long user_id) {
        this.user_id = user_id;
    }

    public long getProductId() {
        return product_id;
    }

    public void setProductId(long product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Timestamp getAddedAt() {
        return added_at;
    }

    public void setAddedAt(Timestamp added_at) {
        this.added_at = added_at;
    }

    @Override
    public String toString() {
        return "Cart [cart_id=" + cart_id + ", user_id=" + user_id + ", product_id=" + product_id + ", quantity=" + quantity + ", added_at=" + added_at + "]";
    }
}

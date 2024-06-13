package com.productservice.productservice.TrxProduct;

import com.productservice.productservice.Product.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trx_data_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrxProduct {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "product_id")
    private String productId;
    
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "qty")
    private String qty;

    @Column(name = "total_harga")
    private String totalHarga;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

}

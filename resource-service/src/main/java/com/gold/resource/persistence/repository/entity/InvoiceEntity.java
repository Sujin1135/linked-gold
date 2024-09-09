package com.gold.resource.persistence.repository.entity;

import com.gold.core.code.InvoiceType;
import com.gold.core.code.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "invoice")
public class InvoiceEntity {

    @Id
    @Column(name = "id", length = 20, nullable = false)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "invoice_type", length = 20, nullable = false)
    private InvoiceType invoiceType;

    @Column(name = "amount", nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 30, nullable = false)
    private OrderStatus status;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "product_id", nullable = false)
    private BigDecimal productId;
}

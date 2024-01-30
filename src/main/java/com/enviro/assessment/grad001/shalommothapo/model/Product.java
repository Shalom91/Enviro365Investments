package com.enviro.assessment.grad001.shalommothapo.model;

import com.enviro.assessment.grad001.shalommothapo.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @Column(columnDefinition = "LONG AUTO_INCREMENT")
    private Long id;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private Investor investor;
}

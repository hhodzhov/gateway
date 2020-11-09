package com.hhodzhov.gateway.model;

import com.hhodzhov.gateway.enumeration.BaseRate;
import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private BaseRate baseRate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rateId", nullable = false)
    private Rate rate;

}

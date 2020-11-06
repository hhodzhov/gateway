package com.hhodzhov.gateway.model;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    private LocalDateTime dateReceived;

    private BigDecimal aed;

    private BigDecimal afn;

    @Column(name = "`all`")
    private BigDecimal all;

    @Column(name = "`amd`")
    private BigDecimal amd;

    @Column(name = "`ang`")
    private BigDecimal ang;

    @Column(name = "`aoa`")
    private BigDecimal aoa;

    @Column(name = "`ars`")
    private BigDecimal ars;

    private BigDecimal aud;

    private BigDecimal awg;

    private BigDecimal azn;

    private BigDecimal bam;

    private BigDecimal bbd;

    private BigDecimal bdt;

    private BigDecimal bgn;

    private BigDecimal bhd;

    private BigDecimal bif;

    private BigDecimal bmd;

    private BigDecimal bnd;

    private BigDecimal bob;

    private BigDecimal brl;

    private BigDecimal bsd;

    private BigDecimal btc;

    private BigDecimal btn;

    private BigDecimal bwp;

    private BigDecimal byn;

    private BigDecimal byr;

    private BigDecimal bzd;

    private BigDecimal cad;

    private BigDecimal cdf;

    private BigDecimal chf;

    private BigDecimal clf;

    private BigDecimal clp;

    private BigDecimal cny;

    private BigDecimal cop;

    private BigDecimal crc;

    private BigDecimal cuc;

    private BigDecimal cup;

    private BigDecimal cve;

    private BigDecimal czk;

    private BigDecimal djf;

    private BigDecimal dkk;

    private BigDecimal dop;

    private BigDecimal dzd;

    private BigDecimal egp;

    private BigDecimal ern;

    private BigDecimal etb;

    private Integer eur;

    private BigDecimal fjd;

    private BigDecimal fkp;

    private BigDecimal gbp;

    private BigDecimal gel;

    private BigDecimal ggp;

    private BigDecimal ghs;

    private BigDecimal gip;

    private BigDecimal gmd;

    private BigDecimal gnf;

    private BigDecimal gtq;

    private BigDecimal gyd;

    private BigDecimal hkd;

    private BigDecimal hnl;

    private BigDecimal hrk;

    private BigDecimal htg;

    private BigDecimal huf;

    private BigDecimal idr;

    private BigDecimal ils;

    private BigDecimal imp;

    private BigDecimal inr;

    private BigDecimal iqd;

    private BigDecimal irr;

    private BigDecimal isk;

    private BigDecimal jep;

    private BigDecimal jmd;

    private BigDecimal jod;

    private BigDecimal jpy;

    private BigDecimal kes;

    private BigDecimal kgs;

    private BigDecimal khr;

    private BigDecimal kmf;

    private BigDecimal kpw;

    private BigDecimal krw;

    private BigDecimal kwd;

    private BigDecimal kyd;

    private BigDecimal kzt;

    private BigDecimal lak;

    private BigDecimal lbp;

    private BigDecimal lkr;

    private BigDecimal lrd;

    private BigDecimal lsl;

    private BigDecimal ltl;

    private BigDecimal lvl;

    private BigDecimal lyd;

    private BigDecimal mad;

    private BigDecimal mdl;

    private BigDecimal mga;

    private BigDecimal mkd;

    private BigDecimal mmk;

    private BigDecimal mnt;

    private BigDecimal mop;

    private BigDecimal mro;

    private BigDecimal mur;

    private BigDecimal mvr;

    private BigDecimal mwk;

    private BigDecimal mxn;

    private BigDecimal myr;

    private BigDecimal mzn;

    private BigDecimal nad;

    private BigDecimal ngn;

    private BigDecimal nio;

    private BigDecimal nok;

    private BigDecimal npr;

    private BigDecimal nzd;

    private BigDecimal omr;

    private BigDecimal pab;

    private BigDecimal pen;

    private BigDecimal pgk;

    private BigDecimal php;

    private BigDecimal pkr;

    private BigDecimal pln;

    private BigDecimal pyg;

    private BigDecimal qar;

    private BigDecimal ron;

    private BigDecimal rsd;

    private BigDecimal rub;

    private BigDecimal rwf;

    private BigDecimal sar;

    private BigDecimal sbd;

    private BigDecimal scr;

    private BigDecimal sdg;

    private BigDecimal sek;

    private BigDecimal sgd;

    private BigDecimal shp;

    private BigDecimal sll;

    private BigDecimal sos;

    private BigDecimal srd;

    private BigDecimal std;

    private BigDecimal svc;

    private BigDecimal syp;

    private BigDecimal szl;

    private BigDecimal thb;

    private BigDecimal tjs;

    private BigDecimal tmt;

    private BigDecimal tnd;

    private BigDecimal top;

    private BigDecimal tRY;

    private BigDecimal ttd;

    private BigDecimal twd;

    private BigDecimal tzs;

    private BigDecimal uah;

    private BigDecimal ugh;

    private BigDecimal usd;

    private BigDecimal uyu;

    private BigDecimal uzs;

    private BigDecimal vef;

    private BigDecimal vnd;

    private BigDecimal vuv;

    private BigDecimal wst;

    private BigDecimal xaf;

    private BigDecimal xag;

    private BigDecimal xau;

    private BigDecimal xcd;

    private BigDecimal xdr;

    private BigDecimal xof;

    private BigDecimal xpf;

    private BigDecimal yer;

    private BigDecimal zar;

    private BigDecimal zmk;

    private BigDecimal zmw;

    private BigDecimal zwl;


}

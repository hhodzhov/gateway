package com.hhodzhov.gateway.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@JsonPropertyOrder({
        "AED",
        "AFN",
        "ALL",
        "AMD",
        "ANG",
        "AOA",
        "ARS",
        "AUD",
        "AWG",
        "AZN",
        "BAM",
        "BBD",
        "BDT",
        "BGN",
        "BHD",
        "BIF",
        "BMD",
        "BND",
        "BOB",
        "BRL",
        "BSD",
        "BTC",
        "BTN",
        "BWP",
        "BYN",
        "BYR",
        "BZD",
        "CAD",
        "CDF",
        "CHF",
        "CLF",
        "CLP",
        "CNY",
        "COP",
        "CRC",
        "CUC",
        "CUP",
        "CVE",
        "CZK",
        "DJF",
        "DKK",
        "DOP",
        "DZD",
        "EGP",
        "ERN",
        "ETB",
        "EUR",
        "FJD",
        "FKP",
        "GBP",
        "GEL",
        "GGP",
        "GHS",
        "GIP",
        "GMD",
        "GNF",
        "GTQ",
        "GYD",
        "HKD",
        "HNL",
        "HRK",
        "HTG",
        "HUF",
        "IDR",
        "ILS",
        "IMP",
        "INR",
        "IQD",
        "IRR",
        "ISK",
        "JEP",
        "JMD",
        "JOD",
        "JPY",
        "KES",
        "KGS",
        "KHR",
        "KMF",
        "KPW",
        "KRW",
        "KWD",
        "KYD",
        "KZT",
        "LAK",
        "LBP",
        "LKR",
        "LRD",
        "LSL",
        "LTL",
        "LVL",
        "LYD",
        "MAD",
        "MDL",
        "MGA",
        "MKD",
        "MMK",
        "MNT",
        "MOP",
        "MRO",
        "MUR",
        "MVR",
        "MWK",
        "MXN",
        "MYR",
        "MZN",
        "NAD",
        "NGN",
        "NIO",
        "NOK",
        "NPR",
        "NZD",
        "OMR",
        "PAB",
        "PEN",
        "PGK",
        "PHP",
        "PKR",
        "PLN",
        "PYG",
        "QAR",
        "RON",
        "RSD",
        "RUB",
        "RWF",
        "SAR",
        "SBD",
        "SCR",
        "SDG",
        "SEK",
        "SGD",
        "SHP",
        "SLL",
        "SOS",
        "SRD",
        "STD",
        "SVC",
        "SYP",
        "SZL",
        "THB",
        "TJS",
        "TMT",
        "TND",
        "TOP",
        "TRY",
        "TTD",
        "TWD",
        "TZS",
        "UAH",
        "UGX",
        "USD",
        "UYU",
        "UZS",
        "VEF",
        "VND",
        "VUV",
        "WST",
        "XAF",
        "XAG",
        "XAU",
        "XCD",
        "XDR",
        "XOF",
        "XPF",
        "YER",
        "ZAR",
        "ZMK",
        "ZMW",
        "ZWL"
})
@Data
public class RateDTO {

    @JsonProperty("AED")
    private BigDecimal aed;

    @JsonProperty("AFN")
    private BigDecimal afn;

    @JsonProperty("ALL")
    private BigDecimal all;

    @JsonProperty("AMD")
    private BigDecimal amd;

    @JsonProperty("ANG")
    private BigDecimal ang;

    @JsonProperty("AOA")
    private BigDecimal aoa;

    @JsonProperty("ARS")
    private BigDecimal ars;

    @JsonProperty("AUD")
    private BigDecimal aud;

    @JsonProperty("AWG")
    private BigDecimal awg;

    @JsonProperty("AZN")
    private BigDecimal azn;

    @JsonProperty("BAM")
    private BigDecimal bam;

    @JsonProperty("BBD")
    private BigDecimal bbd;

    @JsonProperty("BDT")
    private BigDecimal bdt;

    @JsonProperty("BGN")
    private BigDecimal bgn;

    @JsonProperty("BHD")
    private BigDecimal bhd;

    @JsonProperty("BIF")
    private BigDecimal bif;

    @JsonProperty("BMD")
    private BigDecimal bmd;

    @JsonProperty("BND")
    private BigDecimal bnd;

    @JsonProperty("BOB")
    private BigDecimal bob;

    @JsonProperty("BRL")
    private BigDecimal brl;

    @JsonProperty("BSD")
    private BigDecimal bsd;

    @JsonProperty("BTC")
    private BigDecimal btc;

    @JsonProperty("BTN")
    private BigDecimal btn;

    @JsonProperty("BWP")
    private BigDecimal bwp;

    @JsonProperty("BYN")
    private BigDecimal byn;

    @JsonProperty("BYR")
    private BigDecimal byr;

    @JsonProperty("BZD")
    private BigDecimal bzd;

    @JsonProperty("CAD")
    private BigDecimal cad;

    @JsonProperty("CDF")
    private BigDecimal cdf;

    @JsonProperty("CHF")
    private BigDecimal chf;

    @JsonProperty("CLF")
    private BigDecimal clf;

    @JsonProperty("CLP")
    private BigDecimal clp;

    @JsonProperty("CNY")
    private BigDecimal cny;

    @JsonProperty("COP")
    private BigDecimal cop;

    @JsonProperty("CRC")
    private BigDecimal crc;

    @JsonProperty("CUC")
    private BigDecimal cuc;

    @JsonProperty("CUP")
    private BigDecimal cup;

    @JsonProperty("CVE")
    private BigDecimal cve;

    @JsonProperty("CZK")
    private BigDecimal czk;

    @JsonProperty("DJF")
    private BigDecimal djf;

    @JsonProperty("DKK")
    private BigDecimal dkk;

    @JsonProperty("DOP")
    private BigDecimal dop;

    @JsonProperty("DZD")
    private BigDecimal dzd;

    @JsonProperty("EGP")
    private BigDecimal egp;

    @JsonProperty("ERN")
    private BigDecimal ern;

    @JsonProperty("ETB")
    private BigDecimal etb;

    @JsonProperty("EUR")
    private Integer eur;

    @JsonProperty("FJD")
    private BigDecimal fjd;

    @JsonProperty("FKP")
    private BigDecimal fkp;

    @JsonProperty("GBP")
    private BigDecimal gbp;

    @JsonProperty("GEL")
    private BigDecimal gel;

    @JsonProperty("GGP")
    private BigDecimal ggp;

    @JsonProperty("GHS")
    private BigDecimal ghs;

    @JsonProperty("GIP")
    private BigDecimal gip;

    @JsonProperty("GMD")
    private BigDecimal gmd;

    @JsonProperty("GNF")
    private BigDecimal gnf;

    @JsonProperty("GTQ")
    private BigDecimal gtq;

    @JsonProperty("GYD")
    private BigDecimal gyd;

    @JsonProperty("HKD")
    private BigDecimal hkd;

    @JsonProperty("HNL")
    private BigDecimal hnl;

    @JsonProperty("HRK")
    private BigDecimal hrk;

    @JsonProperty("HTG")
    private BigDecimal htg;

    @JsonProperty("HUF")
    private BigDecimal huf;

    @JsonProperty("IDR")
    private BigDecimal idr;

    @JsonProperty("ILS")
    private BigDecimal ils;

    @JsonProperty("IMP")
    private BigDecimal imp;

    @JsonProperty("INR")
    private BigDecimal inr;

    @JsonProperty("IQD")
    private BigDecimal iqd;

    @JsonProperty("IRR")
    private BigDecimal irr;

    @JsonProperty("ISK")
    private BigDecimal isk;

    @JsonProperty("JEP")
    private BigDecimal jep;

    @JsonProperty("JMD")
    private BigDecimal jmd;

    @JsonProperty("JOD")
    private BigDecimal jod;

    @JsonProperty("JPY")
    private BigDecimal jpy;

    @JsonProperty("KES")
    private BigDecimal kes;

    @JsonProperty("KGS")
    private BigDecimal kgs;

    @JsonProperty("KHR")
    private BigDecimal khr;

    @JsonProperty("KMF")
    private BigDecimal kmf;

    @JsonProperty("KPW")
    private BigDecimal kpw;

    @JsonProperty("KRW")
    private BigDecimal krw;

    @JsonProperty("KWD")
    private BigDecimal kwd;

    @JsonProperty("KYD")
    private BigDecimal kyd;

    @JsonProperty("KZT")
    private BigDecimal kzt;

    @JsonProperty("LAK")
    private BigDecimal lak;

    @JsonProperty("LBP")
    private BigDecimal lbp;

    @JsonProperty("LKR")
    private BigDecimal lkr;

    @JsonProperty("LRD")
    private BigDecimal lrd;

    @JsonProperty("LSL")
    private BigDecimal lsl;

    @JsonProperty("LTL")
    private BigDecimal ltl;

    @JsonProperty("LVL")
    private BigDecimal lvl;

    @JsonProperty("LYD")
    private BigDecimal lyd;

    @JsonProperty("MAD")
    private BigDecimal mad;

    @JsonProperty("MDL")
    private BigDecimal mdl;

    @JsonProperty("MGA")
    private BigDecimal mga;

    @JsonProperty("MKD")
    private BigDecimal mkd;

    @JsonProperty("MMK")
    private BigDecimal mmk;

    @JsonProperty("MNT")
    private BigDecimal mnt;

    @JsonProperty("MOP")
    private BigDecimal mop;

    @JsonProperty("MRO")
    private BigDecimal mro;

    @JsonProperty("MUR")
    private BigDecimal mur;

    @JsonProperty("MVR")
    private BigDecimal mvr;

    @JsonProperty("MWK")
    private BigDecimal mwk;

    @JsonProperty("MXN")
    private BigDecimal mxn;

    @JsonProperty("MYR")
    private BigDecimal myr;

    @JsonProperty("MZN")
    private BigDecimal mzn;

    @JsonProperty("NAD")
    private BigDecimal nad;

    @JsonProperty("NGN")
    private BigDecimal ngn;

    @JsonProperty("NIO")
    private BigDecimal nio;

    @JsonProperty("NOK")
    private BigDecimal nok;

    @JsonProperty("NPR")
    private BigDecimal npr;

    @JsonProperty("NZD")
    private BigDecimal nzd;

    @JsonProperty("OMR")
    private BigDecimal omr;

    @JsonProperty("PAB")
    private BigDecimal pab;

    @JsonProperty("PEN")
    private BigDecimal pen;

    @JsonProperty("PGK")
    private BigDecimal pgk;

    @JsonProperty("PHP")
    private BigDecimal php;

    @JsonProperty("PKR")
    private BigDecimal pkr;

    @JsonProperty("PLN")
    private BigDecimal pln;

    @JsonProperty("PYG")
    private BigDecimal pyg;

    @JsonProperty("QAR")
    private BigDecimal qar;

    @JsonProperty("RON")
    private BigDecimal ron;

    @JsonProperty("RSD")
    private BigDecimal rsd;

    @JsonProperty("RUB")
    private BigDecimal rub;

    @JsonProperty("RWF")
    private BigDecimal rwf;

    @JsonProperty("SAR")
    private BigDecimal sar;

    @JsonProperty("SBD")
    private BigDecimal sbd;

    @JsonProperty("SCR")
    private BigDecimal scr;

    @JsonProperty("SDG")
    private BigDecimal sdg;

    @JsonProperty("SEK")
    private BigDecimal sek;

    @JsonProperty("SGD")
    private BigDecimal sgd;

    @JsonProperty("SHP")
    private BigDecimal shp;

    @JsonProperty("SLL")
    private BigDecimal sll;

    @JsonProperty("SOS")
    private BigDecimal sos;

    @JsonProperty("SRD")
    private BigDecimal srd;

    @JsonProperty("STD")
    private BigDecimal std;

    @JsonProperty("SVC")
    private BigDecimal svc;

    @JsonProperty("SYP")
    private BigDecimal syp;

    @JsonProperty("SZL")
    private BigDecimal szl;

    @JsonProperty("THB")
    private BigDecimal thb;

    @JsonProperty("TJS")
    private BigDecimal tjs;

    @JsonProperty("TMT")
    private BigDecimal tmt;

    @JsonProperty("TND")
    private BigDecimal tnd;

    @JsonProperty("TOP")
    private BigDecimal top;

    @JsonProperty("TRY")
    private BigDecimal tRY;

    @JsonProperty("TTD")
    private BigDecimal ttd;

    @JsonProperty("TWD")
    private BigDecimal twd;

    @JsonProperty("TZS")
    private BigDecimal tzs;

    @JsonProperty("UAH")
    private BigDecimal uah;

    @JsonProperty("UGX")
    private BigDecimal ugh;

    @JsonProperty("USD")
    private BigDecimal usd;

    @JsonProperty("UYU")
    private BigDecimal uyu;

    @JsonProperty("UZS")
    private BigDecimal uzs;

    @JsonProperty("VEF")
    private BigDecimal vef;

    @JsonProperty("VND")
    private BigDecimal vnd;

    @JsonProperty("VUV")
    private BigDecimal vuv;

    @JsonProperty("WST")
    private BigDecimal wst;

    @JsonProperty("XAF")
    private BigDecimal xaf;

    @JsonProperty("XAG")
    private BigDecimal xag;

    @JsonProperty("XAU")
    private BigDecimal xau;

    @JsonProperty("XCD")
    private BigDecimal xcd;

    @JsonProperty("XDR")
    private BigDecimal xdr;

    @JsonProperty("XOF")
    private BigDecimal xof;

    @JsonProperty("XPF")
    private BigDecimal xpf;

    @JsonProperty("YER")
    private BigDecimal yer;

    @JsonProperty("ZAR")
    private BigDecimal zar;

    @JsonProperty("ZMK")
    private BigDecimal zmk;

    @JsonProperty("ZMW")
    private BigDecimal zmw;

    @JsonProperty("ZWL")
    private BigDecimal zwl;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}

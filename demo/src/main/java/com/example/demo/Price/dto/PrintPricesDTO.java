package com.example.demo.Price.dto;

import java.math.BigDecimal;
import java.util.Date;

public class PrintPricesDTO {
    Long productId;
    Long brandId;
    Long feeId;
    Date applicationDate;
    BigDecimal finalPrice;

    public PrintPricesDTO(Long productId, Long brandId, Long feeId, Date applicationDate, BigDecimal finalPrice) {
        this.productId = productId;
        this.brandId = brandId;
        this.feeId = feeId;
        this.applicationDate = applicationDate;
        this.finalPrice = finalPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getFeeId() {
        return feeId;
    }

    public void setFeeId(Long feeId) {
        this.feeId = feeId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }
}

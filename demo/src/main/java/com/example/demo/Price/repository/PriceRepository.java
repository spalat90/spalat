package com.example.demo.Price.repository;

import com.example.demo.Price.dto.PrintPricesDTO;
import com.example.demo.Price.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    PrintPricesDTO findPricesByParameters(
            Long brandId, Date applicationDate, Long productId);
}

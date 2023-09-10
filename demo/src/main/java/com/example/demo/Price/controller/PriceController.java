package com.example.demo.Price.controller;


import com.example.demo.Price.dto.PrintPricesDTO;
import com.example.demo.Price.services.PriceService;
import com.example.demo.Price.model.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PriceController {
    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping(value = "/prices")
    @ResponseBody
    public List<PrintPricesDTO> getPrices(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date applicationDate,
            @RequestParam(value = "productId") Long productId,
            @RequestParam(value = "brandId") Long brandId) {
        PrintPricesDTO printPricesDTO = priceService.findPricesByParameters(applicationDate, productId, brandId);
        return new ResponseEntity<>(printPricesDTO, HttpStatus.OK);

    }
}

package com.example.demo.Price.services;

import com.example.demo.Price.dto.PrintPricesDTO;
import com.example.demo.Price.model.Price;
import com.example.demo.Price.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PriceService {
    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public PrintPricesDTO findPricesByParameters(Date applicationDate, Long productId, Long brandId) {
        // Implementa la lógica para buscar precios según los parámetros
        // Puedes usar el repository para consultar la base de datos
        // y aplicar la lógica necesaria aquí.
        // Retorna la lista de precios encontrados.

        PrintPricesDTO prices = priceRepository.findPricesByParameters(brandId, applicationDate, productId);

        return prices;
    }
}

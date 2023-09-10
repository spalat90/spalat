package com.example.demo;


import com.example.demo.Price.controller.PriceController;
import com.example.demo.Price.dto.PrintPricesDTO;
import com.example.demo.Price.repository.PriceRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Date;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class PriceControllerTest {

    @InjectMocks
    private PriceController priceController;

    @Mock
    private PriceRepository priceRepository;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consultarPrecioTest() {
        Date applicationDate = new Date();
        Long productId = 12L;
        Long brandId = 123L;
        Long feeId = 1L;
        BigDecimal finalPrice = new BigDecimal(12).setScale(2);
        PrintPricesDTO printPricesDTO = new PrintPricesDTO(productId,brandId,feeId,applicationDate,finalPrice);

        when(this.priceController.getPrices(applicationDate,productId,brandId)).thenReturn(printPricesDTO);
        ResponseEntity<?> response = priceController.getPrices(applicationDate,productId,brandId);

        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(response.getBody(), printPricesDTO);

    }


}

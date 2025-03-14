package com.credibanco.cards.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import com.credibanco.cards.domain.model.*;

public class CardRequestDto {
    @NotBlank
    @Size(min = 6, max = 6)
    @Pattern(regexp = "\\d{6}", message = "El productId debe ser numérico y tener 6 dígitos.")
    private String productId;
    @NotBlank
    private String titularName;
    private CardType cardType;

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getTitularName() {
        return titularName;
    }
    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }
    public CardType getCardType() {
        return cardType;
    }
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}


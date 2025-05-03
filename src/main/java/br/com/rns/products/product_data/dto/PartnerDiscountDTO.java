package br.com.rns.products.product_data.dto;

public record PartnerDiscountDTO(
        String partner,
        int weightDiscount,
        String expiresAt
) {
}

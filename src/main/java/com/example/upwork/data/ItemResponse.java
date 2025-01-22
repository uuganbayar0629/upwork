package com.example.upwork.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemResponse {

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("isMarketPlaceItem")
    private boolean isMarketPlaceItem;

    @JsonProperty("images")
    private List<Image> images;

    @JsonProperty("freeShipping")
    private boolean freeShipping;

    @JsonProperty("offerCount")
    private int offerCount;

    @JsonProperty("price")
    private Price price;

    @JsonProperty("description")
    private String description;

    @JsonProperty("title")
    private String title;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("productType")
    private String productType;

    @JsonProperty("properties")
    private Properties properties;

    // Getters and Setters

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isMarketPlaceItem() {
        return isMarketPlaceItem;
    }

    public void setMarketPlaceItem(boolean marketPlaceItem) {
        isMarketPlaceItem = marketPlaceItem;
    }

    public List<Image> getImages() {
        if (images == null) {
            this.images = new ArrayList<>();
        }
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public int getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(int offerCount) {
        this.offerCount = offerCount;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    // Include nested classes for Image, Price, and Properties

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image {
        @JsonProperty("url")
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Price {
        @JsonProperty("amount")
        private String amount;

        @JsonProperty("currency")
        private String currency;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Properties {

        @JsonProperty("categories")
        private List<String> categories;

        @JsonProperty("variants")
        private List<Variants> variants;


        public List<String> getCategories() {
            if (categories == null) {
                categories = new ArrayList<>();
            }
            return categories;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }


        @JsonIgnoreProperties(ignoreUnknown = true)
        public class Variants {

            @JsonProperty("VariantData")
            private List<VariantData> VariantData;


            public List<VariantData> getVariantData() {
                if (VariantData == null) {
                    VariantData = new ArrayList<>();
                }
                return VariantData;
            }

            public void setVariantData(List<VariantData> variantData) {
                VariantData = variantData;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class VariantData {

                @JsonProperty("productImageUrl")
                private List<String> productImageUrl;

                public List<String> getProductImageUrl() {
                    if (productImageUrl == null) {
                        productImageUrl = new ArrayList<>();
                    }
                    return productImageUrl;
                }


                public void setProductImageUrl(List<String> productImageUrl) {
                    this.productImageUrl = productImageUrl;
                }
            }
        }

        public List<Variants> getVariants() {
            if (variants == null) {
                variants = new ArrayList<>();
            }
            return variants;
        }

        public void setVariants(List<Variants> variants) {
            this.variants = variants;
        }






    }


    @Override
    public String toString() {
        return "ItemResponse{" +
                "itemId='" + itemId + '\'' +
                ", isMarketPlaceItem=" + isMarketPlaceItem +
                ", images=" + images +
                ", freeShipping=" + freeShipping +
                ", offerCount=" + offerCount +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", productType='" + productType + '\'' +
                ", properties=" + properties +
                '}';
    }
}

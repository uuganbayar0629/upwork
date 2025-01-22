package com.example.upwork.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DemoResponse {

    @JsonProperty("combinedUrls")
    String combinedUrls;

    @JsonProperty("itemResponse")
    ItemResponse itemResponse;

    public DemoResponse(String combinedUrls, ItemResponse itemResponse) {
        this.combinedUrls = combinedUrls;
        this.itemResponse = itemResponse;
    }
}

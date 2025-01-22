package com.example.upwork.service;

import com.example.upwork.data.DemoResponse;
import com.example.upwork.data.ItemResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {


    public Object getItems() {
        // get a sample data
        ItemResponse itemResponse = getSampleItemResponse();

        // Combine all productImageUrl fields into a single string
        String combinedUrls = itemResponse.getProperties().getVariants().stream()
                .flatMap(variant -> variant.getVariantData().stream()) // Flatten VariantData list
                .flatMap(variantData -> variantData.getProductImageUrl().stream()) // Flatten productImageUrl list
                .collect(Collectors.joining(",")); // Join URLs with commas

        System.out.println(combinedUrls);
        return new DemoResponse(combinedUrls, itemResponse);
//        return itemResponse;
    }

    // create a sample ItemResponse
    private ItemResponse getSampleItemResponse() {
        ItemResponse itemResponse = new ItemResponse();

        ItemResponse.Properties properties = new ItemResponse.Properties();
        List<ItemResponse.Properties.Variants> variantsList = new ArrayList<>();

        // Add sample VariantData
        ItemResponse.Properties.Variants variant1 = properties.new Variants();
        ItemResponse.Properties.Variants.VariantData variantData1 = new ItemResponse.Properties.Variants.VariantData();
        variantData1.setProductImageUrl(List.of("url1", "url2"));
        variant1.setVariantData(List.of(variantData1));

        ItemResponse.Properties.Variants variant2 = properties.new Variants();
        ItemResponse.Properties.Variants.VariantData variantData2 = new ItemResponse.Properties.Variants.VariantData();
        variantData2.setProductImageUrl(List.of("url3"));
        variant2.setVariantData(List.of(variantData2));

        variantsList.add(variant1);
        variantsList.add(variant2);

        properties.setVariants(variantsList);
        itemResponse.setProperties(properties);

        return itemResponse;
    }
}

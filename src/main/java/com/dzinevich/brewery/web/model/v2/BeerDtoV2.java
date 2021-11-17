package com.dzinevich.brewery.web.model.v2;

import com.dzinevich.brewery.web.model.Style;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String name;
    private Style style;
    private Long upc;
}
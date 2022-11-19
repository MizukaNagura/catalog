package jp.co.nagura.sample.catalog.mappers.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal{
    
    // 好きな動物ID
    private Integer animalId;

    // 名前
    private String animalName;

}

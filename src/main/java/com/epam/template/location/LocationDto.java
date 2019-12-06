package com.epam.template.location;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
@ApiModel(value = "Office location")
public class LocationDto {

    @ApiModelProperty(value = "ID", example = "1")
    private Long id;

    @ApiModelProperty(value = "Address", example = "г. Москва Кутузовский проспект 17, 3 этаж, офис №28")
    private String address;

    @ApiModelProperty(value = "Location type", example = "service")
    private String locationTypeInt;

    @ApiModelProperty(value = "Location type display name", example = "Пункт обслуживания")
    private String locationTypeLoc;
}

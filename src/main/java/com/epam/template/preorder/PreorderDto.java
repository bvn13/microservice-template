package com.epam.template.preorder;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class PreorderDto {

    @ApiModelProperty(value = "ID", example = "1")
    private Long id;

    @ApiModelProperty(value = "Customer's Name", example = "Иван Иванов")
    private String clientName;

    @ApiModelProperty(value = "Customer's Email", example = "test@example.com")
    private String clientEmail;

    @ApiModelProperty(value = "Customer's Telephone Number", example = "+79070000000")
    private String clientPhoneNumber;

    @ApiModelProperty(value = "Car Pick-up Location ID", example = "2")
    private Long carTakePoint;

    @ApiModelProperty(value = "Car Drop-off Location ID", example = "3")
    private Long carReturnPoint;

    @ApiModelProperty(value = "Booking Start Date", example = "2018-05-29")
    private Date dateFrom;

    @ApiModelProperty(value = "Booking End Date", example = "2018-05-29")
    private Date dateTo;

}

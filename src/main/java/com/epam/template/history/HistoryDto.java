package com.epam.template.history;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * DTO истории изменений автомобиля.
 *
 * @author Roman_Meerson
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel(value = "Car status history")
public class HistoryDto {

  @ApiModelProperty(value = "ID", example = "1")
  private Long id;

  @ApiModelProperty(value = "Car Id", example = "1")
  private Long carId;

  @ApiModelProperty(value = "Car model", example = "BMW X6")
  private String model;

  @ApiModelProperty(value = "Car registration number", example = "А777АА777")
  private String regNumber;

  @ApiModelProperty(value = "Car year", example = "2017")
  private Date dateOfManufacture;

  @ApiModelProperty(value = "Mileage", example = "10000")
  private int mileage;

  @ApiModelProperty(value = "Last maintenance date", example = "2018-01-01T00:00:00.000+0000")
  private Date dateOfLastCheck;

  @ApiModelProperty(value = "Next maintenance date", example = "2019-01-01T00:00:00.000+0000")
  private Date dateOfNextCheck;

  @ApiModelProperty(value = "Current status", example = "В Наличии")
  private String currentStatus;

  @ApiModelProperty(value = "Current status last change date", example = "2018-05-29T00:00:00.000+0000")
  private Date dateOfCurrentStatus;

  @ApiModelProperty(value = "Next status", example = "В Прокате")
  private String nextStatus;

  @ApiModelProperty(value = "Planned next status change date", example = "2018-05-29T00:00:00.000+0000")
  private Date dateOfNextStatus;

  @ApiModelProperty(value = "Event record position", example = "10")
  private Long sequenceId;

  @ApiModelProperty(value = "Event date", example = "2018-05-30T00:00:00.000+0000")
  private Date eventDate;

  @ApiModelProperty(value = "Event type", example = "STATUS_CHANGE")
  private String eventType;

  @ApiModelProperty(value = "Event type display name", example = "Смена статуса")
  private String eventTypeDisplayName;

  @ApiModelProperty(value = "Car location ID", example = "1")
  private Long locationId;

  @ApiModelProperty(value = "Car location address",
      example = "г. Москва Кутузовский проспект 17, 3 этаж, офис №28")
  private String locationAddress;

  @ApiModelProperty(value = "Car location type", example = "service")
  private String locationType;

  @ApiModelProperty(value = "Car location type display name", example = "Пункт обслуживания")
  private String locationTypeDisplayName;

}
package com.epam.template.history;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@RequestMapping("ui/histories")
//@FunctionalInterface
public interface HistoryResource {

  /**
   * Выгрузить историю автомобилей за промежуток времени.
   * @param dateFrom дата начала выгрузки
   * @param dateTo дата окончания выгрузки
   * @param pageNumber номер страницы
   * @param pageSize размер выгружаемой страницы
   * @return {@link HistoryPageDto}
   */
//  @ApiOperation(value = "Get status car history for period", response = HistoryPageDto.class)
//  @ApiResponses({
//      @ApiResponse(code = 200, message = "Response OK")
//  })
//  @GetMapping(value = "/events")
//  HistoryPageDto getCarEvents(@RequestParam(name = "dateFrom")
//  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date dateFrom,
//      @RequestParam(name = "dateTo")
//      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date dateTo,
//      @RequestParam(name = "pageNumber", defaultValue = "0") Integer pageNumber,
//      @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize);

}

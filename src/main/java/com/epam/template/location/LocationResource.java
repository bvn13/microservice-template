package com.epam.template.location;

import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/ui/locations")
public interface LocationResource {

    /**
     * Returns list of LocationDto objects.
     *
     * @return list of LocationDto objects
     */
    @ApiOperation(value = "Get all locations")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    List<LocationDto> getLocations();

    /**
     * Returns LocationDto by Id.
     *
     * @param id identifier of Location
     * @return LocationDto objects
     */
    @ApiOperation(value = "Get location by id")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    LocationDto getLocation(@PathVariable("id") Long id);
}

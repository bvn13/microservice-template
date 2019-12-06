package com.epam.template.preorder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/ui/preorder")
public interface PreorderResource {

    /**
     * Creates preorder.
     *
     * @param preorderDto preorder
     * @return created preorder
     */
    @ApiOperation(value = "Create a preorder")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    PreorderDto createPreorder(@ApiParam(value = "Preorder body", required = true)
    @RequestBody PreorderDto preorderDto);

    /**
     * Gets Preorder by id.
     *
     * @param id preorder id
     * @return found preorder
     */
    @ApiOperation("Get Preorder by ID")
    @GetMapping("/{id}")
    ResponseEntity<PreorderDto> getPreorder(@PathVariable("id") Long id);

    /**
     * Updates Preorder.
     *
     * @param id          preorder id
     * @param preorderDto Preorder
     * @return updated preorder
     */
    @ApiOperation(
            value = "Update a preorder with specific ID",
            notes = "Method provides validation errors")
    @PutMapping("/{id}")
    ResponseEntity<PreorderDto> updatePreorder(
        @ApiParam(value = "Preorder ID", required = true)
        @PathVariable("id") Long id,
        @ApiParam(value = "Preorder body", required = true)
        @RequestBody PreorderDto preorderDto);

    /**
     * Deletes Preorder.
     *
     * @param id preorder id
     */
    @ApiOperation(value = "Delete a Preorder")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deletePreorder(@PathVariable("id") Long id);
}

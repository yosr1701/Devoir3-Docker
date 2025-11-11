package com.yosr.vetement.restControllers;

import com.yosr.vetement.dto.APIResponseDto;
import com.yosr.vetement.dto.VetementDto;
import com.yosr.vetement.service.VetementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/vetements")
@AllArgsConstructor

public class VetementController {

    private VetementService vetementService;
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getVetementById(@PathVariable("id") Long id )
    {
        return new ResponseEntity<APIResponseDto>(
                vetementService.getVetementById(id), HttpStatus.OK);
    }

}

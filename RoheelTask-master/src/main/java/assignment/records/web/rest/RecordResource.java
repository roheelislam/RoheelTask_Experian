package assignment.records.web.rest;


import assignment.records.entity.DataRecords;
import assignment.records.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Class for Data Records
 */

@RestController
@RequestMapping("/record")
@CrossOrigin("*")
public class RecordResource {

    private final RecordService recordService;

    @Autowired
    RecordResource(RecordService recordService) { this.recordService = recordService; }

    @PostMapping("save-user")
    ResponseEntity<?> insert(@RequestBody DataRecords record) {
        this.recordService.saveFilm(record);
        return ResponseEntity.ok().body("Record inserted successfully");
    }
}

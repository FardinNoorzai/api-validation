package test.apivalidation.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.apivalidation.dtos.UserDTO;

import java.util.Map;

@RestController
@RequestMapping("api/v1/users")
public class Controller {


    @PostMapping
    public ResponseEntity<Void> post(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok().build();
    }

}

package test.apivalidation.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.apivalidation.dtos.TransactionDTO;

@RestController
@RequestMapping("api/v1/transactions")
public class TransactionController {

    @PostMapping
    public ResponseEntity<Void> post(@Valid @RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.ok().build();
    }
}

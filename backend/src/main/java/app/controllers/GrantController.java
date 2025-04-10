package app.controllers;

import app.services.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grant")
public class GrantController {

    @Autowired
    private GrantService grantService;

    @PostMapping("/process")
    public ResponseEntity<String> processGrant() {
        String result = grantService.grantPrivileges();
        return ResponseEntity.ok(result);
    }
}


package com.workshop.AmigosSpringSecurity.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class FreatingsController {
    @GetMapping
    public ResponseEntity<String> show() {
        return ResponseEntity.ok().body("Hey Good Morning");
    }
    @GetMapping("/bye")
    public ResponseEntity<String> End() {
        return ResponseEntity.ok().body("Hey Bad Night");
    }

}

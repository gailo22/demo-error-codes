package com.example.demoerrorcodes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/200")
    public ResponseEntity response200() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ErrorResponse("200-code", "ok", 200));
    }

    @GetMapping("/403")
    public ResponseEntity response403() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                .body(new ErrorResponse("403-code", "no permission", 403));
    }

    @GetMapping("/500")
    public ResponseEntity response500() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorResponse("500-code", "internal server error", 500));
    }

    public class ErrorResponse {
        private String code;
        private String description;
        private int statusCode;

        public ErrorResponse(String code, String description, int statusCode) {
            this.code = code;
            this.description = description;
            this.statusCode = statusCode;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }
    }
}



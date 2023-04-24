package co.develhope.Swagger01.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "name-controller", description = "This is a rest controller")
public class NameController {
	@Operation(summary = "Welcome", description = "Welcomes the visitors")
	@GetMapping("/")
	public String welcome() {
		return "Welcome visitor!";
	}
	
	@Operation(summary = "Return name", description = "Returns a given name")
	@GetMapping("/name")
	public String random(@RequestParam String name) {
		return name;
	}
}

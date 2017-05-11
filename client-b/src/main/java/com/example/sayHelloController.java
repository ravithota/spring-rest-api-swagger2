package com.example;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ravi on 5/10/2017.
 */

@RestController
@RequestMapping("/say-hello")
@Api("say hello application")
public class sayHelloController {

    @RequestMapping(value = "/ping/{name}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns  Name ", notes = "Name", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of Name", response = String.class),
            @ApiResponse(code = 400, message = "Invalid input provided"),
            @ApiResponse(code = 404, message = " Name does not exist"), })
    @ResponseStatus(value = HttpStatus.OK)
    public String sayHello(@PathVariable String name){

        return "Hello " + name ;
    }
}

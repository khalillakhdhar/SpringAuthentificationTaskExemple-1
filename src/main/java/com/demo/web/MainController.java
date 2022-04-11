package com.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@GetMapping("")
public String welcome()
{
return "hello spring";	

}
}

package asg.train.azure.controller

import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("api/home")
class HomeController {
    @GetMapping
    fun index() : String = "jangkrik bos!!!"
}
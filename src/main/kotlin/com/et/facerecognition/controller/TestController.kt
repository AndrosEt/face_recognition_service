package com.et.facerecognition.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by William on 2020/10/23
 */
@RestController
@CrossOrigin
class TestController {

    @GetMapping("/aa")
    fun test(): String {

        val test = ""
        return test
    }

}
package com.et.facerecognition

import com.et.facerecognition.test.TranslateFromFile
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FacerecognitionApplication

fun main(args: Array<String>) {
    runApplication<FacerecognitionApplication>(*args)
//    TranslateFromFile.translateFromFile()
}

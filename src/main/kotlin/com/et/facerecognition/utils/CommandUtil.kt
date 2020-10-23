package com.et.facerecognition.utils

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * Created by William on 2020/10/22
 */
object CommandUtil {

    /**
     * Exec the command
     */
    fun execCommand(cmd: Array<String>): String {
        val process = ProcessBuilder(*cmd)
        val p: Process
        try {
            p = process.start()
            val reader = BufferedReader(InputStreamReader(p.inputStream))
            val builder = StringBuilder()
            var line: String? = null
            while (reader.readLine().also { line = it } != null) {
                builder.append(line)
                builder.append(System.getProperty("line.separator"))
            }
            return builder.toString()
        } catch (e: IOException) {
            print("error")
            e.printStackTrace()
        }
        return ""
    }

}
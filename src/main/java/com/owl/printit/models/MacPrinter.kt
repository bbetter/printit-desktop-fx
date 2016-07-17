package com.owl.printit.models

import com.owl.printit.utils.toList
import models.Doc
import java.nio.charset.Charset
import java.util.stream.Collectors

/**
 * Created by mac on 7/3/16.
 */
class MacPrinter : IPrinter {
    override fun getName(): String {
        val p = Runtime.getRuntime().exec("lpstat -p")
        val stdInput = p.inputStream.bufferedReader(charset = Charset.defaultCharset())
        return stdInput.lines().collect(Collectors.joining(",")).split(" ")[1]
    }

    override fun getQueue(): List<Doc> {
        val p = Runtime.getRuntime().exec("lpq -a")
        val stdInput = p.inputStream.bufferedReader(charset = Charset.defaultCharset())
        return stdInput.lineSequence().drop(1).map{
            val items = it.split(" +".toRegex())
            Doc(items[2], items[3], 0.0, "pending", 0)
        }.toList()
    }

    override fun print(doc: Doc) {

    }
}
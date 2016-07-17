package com.owl.printit.models

import models.Doc
import java.nio.charset.Charset

/**
 * Created by mac on 7/3/16.
 */

class WindowsPrinter : IPrinter {
    override fun getQueue(): List<Doc> {
        val p = Runtime.getRuntime().exec("wmic printjob get")
        val stdInput = p.inputStream.bufferedReader(charset = Charset.defaultCharset())
        return stdInput.lineSequence().drop(1).map {
            val items = it.split(" +".toRegex())
            Doc(items[2], items[3], 0.0, "pending", 0)
        }.toList()
    }

    override fun print(doc: Doc) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String = "windows printer"

}
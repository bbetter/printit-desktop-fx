package com.owl.printit.models

import com.owl.printit.models.IPrinter
import models.Doc

/**
 * Created by mac on 7/15/16.
 */

class LinuxPrinter : IPrinter {

    override fun getName(): String {
        throw UnsupportedOperationException()
    }

    override fun getQueue(): List<Doc> {
        throw UnsupportedOperationException()
    }

    override fun print(doc: Doc) {
        throw UnsupportedOperationException()
    }

}

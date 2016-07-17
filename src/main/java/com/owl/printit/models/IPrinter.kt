package com.owl.printit.models

import models.Doc

/**
 * Created by mac on 7/2/16.
 */
interface IPrinter {
    fun getName(): String;
    fun getQueue(): List<Doc>
    fun print(doc: Doc)
}
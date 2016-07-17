package com.owl.printit.models

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by mac on 7/17/16.
 */
class IPrinterFactoryTest {

    @Test
    fun testOsSpecificPrinter() {
        assert(IPrinterFactory.printer is MacPrinter)
    }
}
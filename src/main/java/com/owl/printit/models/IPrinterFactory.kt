package com.owl.printit.models

import models.Doc

/**
 * Created by mac on 7/16/16.
 */
object IPrinterFactory {

    val printer: IPrinter?
        get() {
            val osName = System.getProperty("os.name").toLowerCase()

            if (osName.contains("mac os") || osName.contains("macOS") || osName.contains("macOs")) {
                return MacPrinter()
            } else if (osName.contains("windows") || osName.contains("Windows")) {
                return WindowsPrinter()
            } else if (osName.contains("linux") || osName.contains("Linux"))
                return LinuxPrinter();
            else return object : IPrinter {
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
        }
}
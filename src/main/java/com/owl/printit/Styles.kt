package com.owl.printit

import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.Stylesheet
import tornadofx.c


/**
 * Created by mac on 24.05.16.
 */
class Styles : Stylesheet() {
    companion object {
        val defaultBg: Paint = c(255, 255, 255, 0.5)
    }

    init {
        s(tableView){
            backgroundColor = defaultBg
        }
    }
}
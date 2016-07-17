package com.owl.printit

import com.owl.printit.views.MainScreen
import javafx.stage.Stage
import tornadofx.App
import tornadofx.importStylesheet
import javax.print.PrintServiceLookup

/**
 * Created by mac on 24.05.16.
 */

class PrintItApp : App(){
    override val primaryView = MainScreen::class

    init{
        importStylesheet(Styles::class)
    }

    override fun start(stage: Stage) {
        stage.isResizable = true
        super.start(stage)
    }
}


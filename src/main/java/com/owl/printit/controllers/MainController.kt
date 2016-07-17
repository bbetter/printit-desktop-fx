package com.owl.printit.controllers

import com.owl.printit.models.*
import com.owl.printit.views.MainScreen
import models.Doc
import tornadofx.Controller
import tornadofx.FX

/**
 * Created by mac on 25.05.16.
 */
class MainController : Controller() {

    val mainScreen: MainScreen by inject()
    var printer: IPrinter? = IPrinterFactory.printer;

    init {
        if (FX.primaryStage.scene.root != mainScreen.root) {
            FX.primaryStage.scene.root = mainScreen.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }
}

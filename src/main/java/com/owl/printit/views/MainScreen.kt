package com.owl.printit.views

import com.owl.printit.controllers.MainController
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.layout.VBox
import models.Doc
import tornadofx.*


/**
 * Created by mac on 24.05.16.
 */

class MainScreen : View() {
    override val root = VBox()
    val controller: MainController by inject()
    val documents: ObservableList<Doc> = FXCollections.observableArrayList()

    init {
        title = "PrintiT"
        with(root) {
            hbox {
                button(text = "Click ME !") {
                    isFillWidth = true
                    setOnAction {
                        val docs = controller.printer?.getQueue()
                        if (docs != null) {
                            documents.setAll(docs)
                        }
                    }
                }
            }
            tableview(documents) {
                column("ID", Doc::id)
                column("Name", Doc::name)
                column("Status", Doc::status)
                column("Pages", Doc::pages)
                column("Cost", Doc::cost)
            }
        }

    }
}
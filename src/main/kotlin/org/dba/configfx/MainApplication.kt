package org.dba.configfx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class MainApplication : Application() {
    override fun start(stage: Stage) {

        MongoManage.connect()

        val fxmlLoader = FXMLLoader(MainApplication::class.java.getResource("main.fxml"))
        val scene = Scene(fxmlLoader.load(), 750.0, 700.0)
        stage.title = "configFX"
        stage.scene = scene
        stage.show()
    }
    override fun stop() {
        super.stop()
        MongoManage.close()
    }
}

fun main() {
    Application.launch(MainApplication::class.java)
}
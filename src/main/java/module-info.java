
module org.dba.configfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires org.slf4j;
    requires org.mongodb.driver.kotlin.coroutine;
    requires kotlinx.coroutines.core;
    requires kotlinx.coroutines.javafx;


    opens org.dba.configfx to javafx.fxml;
    exports org.dba.configfx;
}
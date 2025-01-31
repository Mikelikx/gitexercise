module ehu.eus.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens ehu.eus.gitexercise to javafx.fxml;
    exports ehu.eus.gitexercise;
}
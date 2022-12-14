
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


import java.io.IOException;
//Main app kế thừa từ lớp Application có sẵn của javaFX
public class MainApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    // phương thức start để chạy chương trình với giao diện GUI
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DonHang.fxml")); //khi chạy ứng dụng chương trình sẽ mở giao diện được tạo tại file DonHang.fxml đầu tiên
        Scene scene = new Scene(root);
        primaryStage.setTitle("Quản lý đơn hàng cà phê"); //title của ứng dụng
        primaryStage.setScene(scene);
        System.out.println(System.getProperty("javafx.version"));
        primaryStage.show();
    }
}

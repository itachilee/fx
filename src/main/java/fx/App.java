package fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 * @author leon
 */
public class App  extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        launch(args);
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 创建一个标签，用于存放我们的Hello World文本，并设置让它在父容器中居中
        Label label = new Label("Hello"); label.setAlignment(Pos.CENTER);
        // 设置字体大小、颜色（当然我们也可以用css来设置，先这样写）
        // 或者顺带设置字体
        label.setFont(new Font("Arial", 30));
        label.setTextFill(Color.web("#FFFFFF"));
        label.setBackground(new Background(new BackgroundFill(Paint.valueOf("black"), null, null)));
        //tfOutPath是一个控件（controller）
        /**
         * 三步曲
         */
        // 1、初始化一个场景
        Scene scene = new Scene(label, 400, 300);
        // 2、将场景放入窗口
        primaryStage.setScene(scene);
        // 3、打开窗口
        primaryStage.show();

    }
}

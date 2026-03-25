package JavaFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploControles extends Application {

    @Override
    public void start(Stage palco){
        Label label = new Label("Ola mundo, sou uma etiqueta!");
        Button botao = new Button("clique aqui");
        TextField campo = new TextField(); // campo de texto p digitacao
        
        VBox layout = new VBox(label, botao, campo); 
        //cria uma div e coloca em ordem do que aparece primeiro na vertical, cima para baixo
        Scene cena = new Scene(layout, 300,200); 
        //define que a cena sera no formato layout, 300pixels x 200pixels

        palco.setScene(cena);
        palco.show();
    } 
    public static void main(String[] args) {
        launch(args);
    }
}


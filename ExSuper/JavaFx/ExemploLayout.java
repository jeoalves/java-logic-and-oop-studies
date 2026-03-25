package JavaFx;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;


public class ExemploLayout extends Application{

    @Override
    public void start(Stage palco){ //Stage e uma classe de javafx, sobreesc. metodo start de applic.
        Button button1 = new Button("Botao 1");
        Button button2 = new Button("Botao 2");
        Button button3 = new Button("Botao 3");
        Button button4 = new Button("Botao 4");
        HBox hbox = new HBox(button1, button2); //cria um box horizontal com dois botoes 
        hbox.setAlignment(Pos.CENTER); // alinha o box ao centro 

        VBox vbox = new VBox(button3, button4); //cria um box vertical com dois botoes 
        vbox.setAlignment(Pos.CENTER); // alinha o box ao centro

        BorderPane borderPane = new BorderPane(); // cria um borderpane(uma div)
        borderPane.setTop(hbox); //coloca ele alinhado ao topo com o hbox dentro
        borderPane.setCenter(vbox); // coloca alinhado ao centro com vbox dentro

        Scene cena = new Scene(borderPane, 300, 300); //a cena e um pop up 300px(hori) x 300px(vert)
        palco.setScene(cena); //palco e da classe Stage - monta a cena
        palco.show();          //mostra a cena

    }
    public static void main(String[] args) {
        launch(args);       //carrega
    }
    
}

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.animation.*;
import javafx.util.Duration;

public class RelogioDigital extends Application {
    final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void start(Stage palco){
        //Etiquetas
        Label rotuloLabel = new Label();
        rotuloLabel.setStyle("-fx-font-size: 24pt; -fx-text-fill: yellow;");

        //Criacao KeyFrame
        KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO,e -> {rotuloLabel.setText(LocalDateTime.now().format(FORMATADOR));});

        //Novo keyFrame que define intervalo de atualizacao
        KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));

        //Criacao da Timeline e add keyframes:
        Timeline relogio = new Timeline();
        relogio.getKeyFrames().addAll(keyFrameAtualizar,keyFrameIntervalo);
        
        //Definindo peridiocidade de atualizacao do relogio(indefinidamente)
        relogio.setCycleCount(Animation.INDEFINITE);
        relogio.play();//INICIA

        //Layout vertical - itens na sequencia que aparecem verticalmente
        VBox layout = new VBox(rotuloLabel); 
            layout.setStyle("-fx-background-color: black;");
            layout.setAlignment(Pos.CENTER);

            //Cena e palco
        Scene cena = new Scene(layout, 300,100);
            palco.setTitle("Relogio Digital");
            palco.setScene(cena);
            palco.show();

    }
    public static void main(String[] args) {
        launch(args);

    }

    
}
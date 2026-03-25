import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class CalculadoraIMC extends Application{
    @Override
    public void start(Stage palco){
        //Etiquetas
        Label etiquetaPeso = new Label("Digite seu peso: ");
        Label etiquetaAltura = new Label("Digite sua altura: ");
        
        //Campo digitavel
        TextField campoPeso = new TextField("Peso em kg");
        TextField campoAltura = new TextField("Altura em metros");

        Label etiquetaResultado = new Label("Resultado");

        //Botao para calcular IMC
        Button botaoCalcular = new Button("Calcular IMC");
            botaoCalcular.setOnAction(e -> {
            double peso = Double.parseDouble(campoPeso.getText());
            double altura = Double.parseDouble(campoAltura.getText());

            double imc = peso/ (altura*altura);
            etiquetaResultado.setText(String.format("Seu IMD e %.2f ", imc));// concatenacao texto % indica inicio da concat.
                        // 2 indica duas casas decimais e F = float
                        // apos a , o campo que devera ser subst ex= imc
            });
    //Layout vertical - itens na sequencia que aparecem verticalmente
        VBox layout = new VBox(10, etiquetaPeso, campoPeso, etiquetaAltura, campoAltura, botaoCalcular, etiquetaResultado); //10px espacamento
            layout.setPadding(new Insets(10));
            layout.setAlignment(Pos.CENTER);

    //Cena e palco
        Scene cena = new Scene(layout, 300, 250);
            palco.setTitle("Calculadora IMC");
            palco.setScene(cena);
            palco.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

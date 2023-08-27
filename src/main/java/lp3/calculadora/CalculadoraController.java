/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lp3.calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;



/**
 * FXML Controller class
 *
 * @author adils
 */
public class CalculadoraController implements Initializable {

    String conta = "0";
    //@FXML
    //private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0,
            //multiplica, soma, subtracao, dividir, igual;
    
    @FXML
    private TextArea visor;
    @FXML
    private TextArea visorOperacao;
    
    @FXML
    private void handleNum0Click(MouseEvent event){mostraVisor("0");}   
    @FXML
    private void handleNum1Click(MouseEvent event){mostraVisor("1");}  
    @FXML
    private void handleNum2Click(MouseEvent event) {mostraVisor("2");}
    @FXML
    private void handleNum3Click(MouseEvent event) {mostraVisor("3");}
    @FXML
    private void handleNum4Click(MouseEvent event) {mostraVisor("4");}
    @FXML
    private void handleNum5Click(MouseEvent event) {mostraVisor("5");}
    @FXML
    private void handleNum6Click(MouseEvent event) {mostraVisor("6");}
    @FXML
    private void handleNum7Click(MouseEvent event) {mostraVisor("7");}
    @FXML
    private void handleNum8Click(MouseEvent event) {mostraVisor("8");}
    @FXML
    private void handleNum9Click(MouseEvent event) {mostraVisor("9");}
    @FXML
    private void handleSomaClick(MouseEvent event) {mostraVisor("+");}
    @FXML
    private void handleSubtracaoClick(MouseEvent event) {mostraVisor("-");}
    @FXML
    private void handleMultiplicacaoClick(MouseEvent event) {mostraVisor("*");}
    @FXML
    private void handleDivisaoClick(MouseEvent event) {mostraVisor("/");}
    @FXML
    private void handlePontoClick(MouseEvent event) {mostraVisor(".");}
    @FXML
    private void handleParenteseAbreClick(MouseEvent event) {mostraVisor("(");}
    @FXML
    private void handleParenteseFechaClick(MouseEvent event) {mostraVisor(")");}
    @FXML
    private void handleDelClick(MouseEvent event) {mostraVisor("del");}
    @FXML
    private void handleAcClick(MouseEvent event) {mostraVisor("ac");}


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Expression expression = new ExpressionBuilder("2.5*2").build();
        //double result = expression.evaluate();
        //System.out.println(result);
    }
    
    public void mostraVisor(String numero){
        String textoAtual = visor.getText();
        String textoOperacao = visorOperacao.getText();
        String novoTexto = ""/*inicializar*/;

        
        if(numero.equals("del")){
            String del = textoAtual.substring(0, textoAtual.length() - 1);
            novoTexto = del;
        }
        else if(numero.equals("ac")){
            novoTexto = "";
            visorOperacao.setText("");
        }   
        else novoTexto = textoAtual + numero;  
        
        visor.setText(novoTexto);
        conta = novoTexto;
    }
    
    public void resultado(){/*Botão igual*/
        Expression expression = new ExpressionBuilder(conta).build();
        double result = expression.evaluate();
        visor.setText(String.valueOf(result));
        visorOperacao.setText(conta);
        System.out.println(result);       
    }

}

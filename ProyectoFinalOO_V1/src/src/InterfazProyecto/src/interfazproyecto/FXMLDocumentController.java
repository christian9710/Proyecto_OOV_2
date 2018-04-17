/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazproyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author unicomer
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txtrazonSocial;

    @FXML
    private TextField txtCedulaJuridica;

    @FXML
    private TextField txtubicacion;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtlogo;

    @FXML
    private TextField txtTelefono;

    @FXML
    private Button buttonRegistrar;

    

    private void registrar(ActionEvent event) {
        
    
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

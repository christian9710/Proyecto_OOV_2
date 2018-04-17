/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.InterfazProyecto.src.interfazproyecto;

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
    private TextField tipo;

    @FXML
    private TextField ubicacion;

    @FXML
    private TextField pnombre;

    @FXML
    private TextField direccion;

    @FXML
    private TextField identificacion;

    @FXML
    private TextField nombre;

    @FXML
    private TextField puesto;

    @FXML
    private TextField razonSocial;

    @FXML
    private TextField cedulaJuridica;

    @FXML
    private TextField correo;

    @FXML
    private Button agregarContacEmpre;

    @FXML
    private TextField logo;

    @FXML
    private TextField telefono;
    
    
    @FXML
    void event(ActionEvent event) {

    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

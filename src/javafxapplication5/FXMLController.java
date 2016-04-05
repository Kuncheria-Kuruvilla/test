/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Ameen
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label label;
    @FXML
    private Slider volSlider;
    @FXML
    private ImageView albumArt;
    @FXML
    private ImageView backGround;
    @FXML
    private ProgressBar pBar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandregister;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLDocument4Controller implements Initializable {

    @FXML
    private TextField NoKendaraan;
    @FXML
    private TextField hargaParkir;
    @FXML
    private TextField jamMasuk;
    @FXML
    private RadioButton Roda2;
    @FXML
    private RadioButton roda4;
    @FXML
    private TextField totalBayar;
    @FXML
    private TextField lamaParkir;
    @FXML
    private Button idProses;
    @FXML
    private Button idLogOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void roda2(ActionEvent event) {
        
        hargaParkir.setText("2000");
	jamMasuk.setText("07.00 WIB");    
    }
    
    @FXML
    private void roda4(ActionEvent event) {
        
        hargaParkir.setText("5000");
	jamMasuk.setText("07.00 WIB");
    }

    @FXML
    private void proses(ActionEvent event) {
         
        String no = NoKendaraan.getText();
        String harga = hargaParkir.getText();
        String masuk = jamMasuk.getText();
        String lama = lamaParkir.getText();
        String total = totalBayar.getText();    
       
        int rod2 = Integer.parseInt(hargaParkir.getText());
        int rod4= Integer.parseInt(lamaParkir.getText());
        int hasilnya = rod2*rod4;
          
        int hasil = 0;
        if(Roda2.isSelected());
            hasil = rod2*5000;
        if(roda4.isSelected());
            hasil = rod4*8000;
        
        totalBayar.setText(""+hasilnya);
    }
     @FXML
    void clear(ActionEvent event) {
        NoKendaraan.setText("");
	jamMasuk.setText("");
	lamaParkir.setText("");
	hargaParkir.setText("");
	totalBayar.setText("");
	Roda2.setSelected(false);
	roda4.setSelected(false);
    }
    
    @FXML
    void logOut(ActionEvent event) {
            
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);   
         if (selectedOption == JOptionPane.YES_OPTION) {System.exit(0);}
    }
}


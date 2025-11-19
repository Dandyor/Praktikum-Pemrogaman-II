package Controller;

import Model.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML private TableView<Mahasiswa> tabelMahasiswa;
    @FXML private TableColumn<Mahasiswa, String> colNim;
    @FXML private TableColumn<Mahasiswa, String> colNama;

    @FXML private TextField txtNim;
    @FXML private TextField txtNama;

    private ObservableList<Mahasiswa> data = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colNim.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getNim()));
        colNama.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getNama()));

        // Data awal (seperti pada gambar)
        data.addAll(
                new Mahasiswa("20000001", "jhon"),
                new Mahasiswa("20000002", "jerry"),
                new Mahasiswa("20000003", "jovi"),
                new Mahasiswa("20000004", "arjuna"),
                new Mahasiswa("20000005", "aldi"),
                new Mahasiswa("20000006", "Putra"),
                new Mahasiswa("20000007", "dede"),
                new Mahasiswa("20000008", "richard"),
                new Mahasiswa("20000009", "philip"),
                new Mahasiswa("20000010", "Joko")
        );

        tabelMahasiswa.setItems(data);

        tabelMahasiswa.setOnMouseClicked(e -> {
            Mahasiswa m = tabelMahasiswa.getSelectionModel().getSelectedItem();
            if (m != null) {
                txtNim.setText(m.getNim());
                txtNama.setText(m.getNama());
            }
        });
    }

    @FXML
    public void tambahData() {
        data.add(new Mahasiswa(txtNim.getText(), txtNama.getText()));
        txtNim.clear();
        txtNama.clear();
    }

    @FXML
    public void updateData() {
        Mahasiswa m = tabelMahasiswa.getSelectionModel().getSelectedItem();
        if (m != null) {
            m.setNim(txtNim.getText());
            m.setNama(txtNama.getText());
            tabelMahasiswa.refresh();
        }
    }

    @FXML
    public void hapusData() {
        Mahasiswa m = tabelMahasiswa.getSelectionModel().getSelectedItem();
        if (m != null) data.remove(m);
    }
}

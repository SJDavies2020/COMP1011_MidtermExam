import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AthleteController implements Initializable {

    @FXML
    private TableView<AthleteModel> tableView;

    @FXML
    private TableColumn<AthleteModel, Integer> id;

    @FXML
    private TableColumn<AthleteModel, String> FName;

    @FXML
    private TableColumn<AthleteModel, String> LNAme;

    @FXML
    private TableColumn<AthleteModel, Integer> YOB;

    @FXML
    private TableColumn<AthleteModel, Double> r1;

    @FXML
    private TableColumn<AthleteModel, Double> r2;

    @FXML
    private TableColumn<AthleteModel, Double> comb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    public void getAthletes()
    {
        id.setCellValueFactory(new PropertyValueFactory<AthleteModel,Integer>("id"));
        FName.setCellValueFactory(new PropertyValueFactory<AthleteModel,String>("FirstName"));
        YOB.setCellValueFactory(new PropertyValueFactory<AthleteModel,Integer>("LastName"));
        r1.setCellValueFactory(new PropertyValueFactory<AthleteModel,Double>("run1"));
        r2.setCellValueFactory(new PropertyValueFactory<AthleteModel,Double>("run2"));

        try {
            tableView.getItems().addAll(DBUtil.getAllAthletes());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtUsername;
    public TextField txtOutputUsername;
    public TextField txtOutputUsernameFillWithEnter;

    public void btnPrintOnAction(ActionEvent actionEvent) {
        txtOutputUsername.setText(txtUsername.getText());
    }

    public void txtUsernameInputOnAction(ActionEvent actionEvent) {
        txtOutputUsernameFillWithEnter.setText(txtUsername.getText());
    }
}

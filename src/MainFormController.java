import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {
    public TextField txtUsername;
    public TextField txtOutputUsername;
    public TextField txtOutputUsernameFillWithEnter;
    public TextField txtOutputUsernameWithKeyPress;
    public TextField txtOutputUsernameWithKeyReleased;

    public void btnPrintOnAction(ActionEvent actionEvent) {
        txtOutputUsername.setText(txtUsername.getText());
    }

    public void txtUsernameInputOnAction(ActionEvent actionEvent) {
        txtOutputUsernameFillWithEnter.setText(txtUsername.getText());
    }

    public void txtUserNameKeyPressOnAction(KeyEvent keyEvent) {
        txtOutputUsernameWithKeyPress.setText(txtUsername.getText());
    }

    public void txtUserNameKeyReleasedOnAction(KeyEvent keyEvent) {
        txtOutputUsernameWithKeyReleased.setText(txtUsername.getText());
    }
}

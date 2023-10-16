package interface_adapter.clear_users;

import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;

// TODO Complete me seems good
public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(String username, String password) {
        ClearInputData clearInputData = new ClearInputData(
                username, password);

        clearUseCaseInteractor.execute(clearInputData);
    }
}

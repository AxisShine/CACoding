package use_case.clear_users;

// TODO Complete me seems good

import entity.User;
import entity.UserFactory;

import java.time.LocalDateTime;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary userPresenter;
    final UserFactory userFactory;

    public SignupInteractor(ClearUserDataAccessInterface clearUserDataAccessObject,
                            ClearOutputBoundary clearOutputBoundary,
                            UserFactory userFactory) {
        this.clearUserDataAccessObject = clearUserDataAccessObject;
        this.userPresenter = clearOutputBoundary;
        this.userFactory = userFactory;
    }

    public ClearInteractor() {
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        LocalDateTime now = LocalDateTime.now();

        String[] usernames = clearUserDataAccessObject.clear();

        ClearOutputData clearOutputData = new ClearOutputData(usernames, now.toString(), false);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}

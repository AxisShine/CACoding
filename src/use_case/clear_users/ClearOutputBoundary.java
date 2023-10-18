package use_case.clear_users;

// TODO Complete me seems good

import use_case.signup.SignupOutputData;
public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData usernames);

    void prepareFailView(String error);
}

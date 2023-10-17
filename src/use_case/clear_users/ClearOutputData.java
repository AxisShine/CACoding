package use_case.clear_users;

// TODO Complete me seems good

public class ClearOutputData {
    private String[] usernames;

    private String creationTime;

    private boolean useCaseFailed;

    public ClearOutputData(String[] usernames, String creationTime, boolean useCaseFailed) {
        this.usernames = usernames;
        this.creationTime = creationTime;
        this.useCaseFailed = useCaseFailed;
    }

    public String[] getUsernames() {
        return usernames;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

}

package api.unRegistrationPost;

public class UnSuccessRegistration {

  private String error;

  public UnSuccessRegistration(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}
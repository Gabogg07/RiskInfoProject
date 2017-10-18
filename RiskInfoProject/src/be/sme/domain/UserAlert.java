package be.sme.domain;

public class UserAlert {
    private String name;
    private String note;
    private boolean verified;
    private User submitter;
    private Place place;
    private String riskId;

    public UserAlert(String name, String note, boolean verified, User submitter, Place place, String riskId) {
        this.name = name;
        this.note = note;
        this.verified = verified;
        this.submitter = submitter;
        this.place = place;
        this.riskId = riskId;
    }
}

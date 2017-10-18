package be.sme.repository;

import be.sme.domain.*;

import java.util.List;

public interface Repository {
    List<Risk> getAllRisks();
    User getUser(String username);
    void addUser(User user);
    void addRisk(Risk risk);
    List<UserAlert> getAllUserAlerts();
}

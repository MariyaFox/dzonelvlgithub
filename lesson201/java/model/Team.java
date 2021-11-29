package model;

import interfaces.Action;

public class Team {

    private String teamName;
    private  final Action[] teamMembers;

    public Team(String teamName, Action[] teamMembers) {

        this.teamName = teamName;
        if (teamMembers.length != 4) {
            throw new IllegalArgumentException("Неверное количество участников.");
        }
        this.teamMembers = teamMembers;

    }

}

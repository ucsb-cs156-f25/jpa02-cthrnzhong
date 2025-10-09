package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Catherine";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "cthrnzhong";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-14");
        team.addMember("PRATIMA REDDY");
        team.addMember("KEYI");
        team.addMember("CATHERINE");
        team.addMember("LOGAN CHRISTOPHER");
        team.addMember("DANIEL JUNHYUK");
        team.addMember("FERNANDO");
        return team;
    }
}

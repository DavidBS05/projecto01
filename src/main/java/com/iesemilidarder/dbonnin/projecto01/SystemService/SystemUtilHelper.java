package com.iesemilidarder.dbonnin.projecto01.SystemService;

public class SystemUtilHelper {
    private SystemUtilHelper() {
        //TODO: OS generalitzation
    }

    public static void consolePrint (String message) {
        System.out.println(message);
    }

    public static void logError(Exception e) {
        consolePrint("Error:"+ e);
    }
}

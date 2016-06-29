package com.google.firebase.codelab.friendlychat.utility;

/**
 * Created by vivek on 29/06/16.
 */
public class Utility {
    public static String getUserNameFromEmail(String email) {
        if (email.contains("@")) {
            return email.split("@")[0];
        } else {
            return email;
        }
    }
}

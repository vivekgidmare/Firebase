package com.google.firebase.codelab.friendlychat.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by vivek on 29/06/16.
 */
public class FragmentUserPosts extends FragmentPostList {
    public FragmentUserPosts() {
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        Query userPostQuery = databaseReference.child("user-posts").child(getUid());
        return userPostQuery;
    }
}

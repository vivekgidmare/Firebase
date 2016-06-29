package com.google.firebase.codelab.friendlychat.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by vivek on 29/06/16.
 */
public class FragmentRecentPosts extends FragmentPostList {
    public FragmentRecentPosts() {
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        Query recentPostQuery = databaseReference.child("posts").limitToFirst(100);
        return recentPostQuery;
    }
}

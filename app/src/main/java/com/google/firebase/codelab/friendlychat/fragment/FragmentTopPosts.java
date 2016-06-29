package com.google.firebase.codelab.friendlychat.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by vivek on 29/06/16.
 */
public class FragmentTopPosts extends FragmentPostList {
    public FragmentTopPosts() {
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        String userId = getUid();
        Query topPostQuery = databaseReference.child("user-posts").child(userId).orderByChild("starCount");
        return topPostQuery;
    }
}

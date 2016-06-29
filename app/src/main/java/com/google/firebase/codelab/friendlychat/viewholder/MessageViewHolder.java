package com.google.firebase.codelab.friendlychat.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.codelab.friendlychat.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by vivek on 29/06/16.
 */
public class MessageViewHolder extends RecyclerView.ViewHolder {
    public TextView messageTextView;
    public TextView messengerTextView;
    public CircleImageView messengerImageView;

    public MessageViewHolder(View v) {
        super(v);
        messageTextView = (TextView) itemView.findViewById(R.id.messageTextView);
        messengerTextView = (TextView) itemView.findViewById(R.id.messengerTextView);
        messengerImageView = (CircleImageView) itemView.findViewById(R.id.messengerImageView);
    }
}

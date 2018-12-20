package com.example.user.tes061212;

import android.view.View;

public class CustomeOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomeOnItemClickListener(int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position );
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}

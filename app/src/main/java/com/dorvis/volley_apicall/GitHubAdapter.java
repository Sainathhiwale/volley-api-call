package com.dorvis.volley_apicall;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GitHubAdapter extends RecyclerView.Adapter<GitHubAdapter.GithubViewHolder> {
    private Context context;
    private User [] data;

    public GitHubAdapter(Context context, User[] data) {
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public GithubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_item,parent,false);
        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GithubViewHolder holder, int position) {
        User user = data[position];
        holder.textView.setText(user.getLogin());
        Glide.with(holder.imgUser.getContext()).load(user.getAvatarUrl()).into(holder.imgUser);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imgUser;
        public GithubViewHolder(View itemView) {
            super(itemView);
            imgUser =(ImageView)itemView.findViewById(R.id.imgUser);
            textView =(TextView)itemView.findViewById(R.id.textUser);

        }
    }
}

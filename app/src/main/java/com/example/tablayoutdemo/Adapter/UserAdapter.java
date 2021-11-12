package com.example.tablayoutdemo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayoutdemo.Model.User;
import com.example.tablayoutdemo.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    List<User> userList;
    public UserAdapter(List<User> userList) {
        this.userList=userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_layout,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
      User user=userList.get(position);
      holder.imageView.setImageResource(user.getProfile());
      holder.message.setText(user.getMessage());
      holder.time.setText(user.getTime());
      holder.name.setText(user.getName());
      holder.arrow.setImageResource(user.getArrow());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView;
        ImageView arrow;
        TextView name,message,time;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            arrow=itemView.findViewById(R.id.tick);
            name=itemView.findViewById(R.id.name);
            message=itemView.findViewById(R.id.message);
            time=itemView.findViewById(R.id.time);
        }
    }
}

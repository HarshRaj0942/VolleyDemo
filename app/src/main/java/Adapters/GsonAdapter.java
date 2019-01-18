package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.harsh_raj.volleydemo.R;

import Viewholder.GsonViewHolder;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.harsh_raj.volleydemo.User;

public class GsonAdapter extends RecyclerView.Adapter<GsonViewHolder> {


    Context ctx;
    User [] data;
    public GsonAdapter(Context ctx, User [] data) {

        this.ctx=ctx;
        this.data=data;
    }

    @NonNull
    @Override
    public GsonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_format_user,parent,false);

        return new GsonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GsonViewHolder holder, int position) {

        User user = data[position];

        holder.titleUser.setText(user.getLogin());
        Glide.with(holder.imgUser.getContext()).load(user.getAvatarUrl()).into(holder.imgUser);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}

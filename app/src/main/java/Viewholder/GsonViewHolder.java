package Viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harsh_raj.volleydemo.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GsonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

   public ImageView imgUser;
   public TextView titleUser;
    public GsonViewHolder(@NonNull View itemView) {

        super(itemView);

        imgUser = itemView.findViewById(R.id.imgUser);
        titleUser = itemView.findViewById(R.id.titleUser);

    }

    @Override
    public void onClick(View v) {

    }
}

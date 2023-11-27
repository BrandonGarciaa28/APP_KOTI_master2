package com.example.happybirthday.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.happybirthday.Domain.FoodDomain; // Add this import statement
import com.example.happybirthday.R;

import java.util.ArrayList;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.viewholder> {
//FoodDomain
    ArrayList<FoodDomain> RecommendedDomains;
public RecommendedAdapter(ArrayList<FoodDomain>RecommendedDomains){
    this.RecommendedDomains=RecommendedDomains;

}
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_recommended, parent, false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.title.setText(RecommendedDomains.get(position).getTitle());
        holder.fee.setText(String.valueOf(RecommendedDomains.get(position).getFee()));



        int drawableResourceId = holder.itemView.getContext().getResources()
                .getIdentifier(RecommendedDomains.get(position).getPic(), "drawable",
                        holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return RecommendedDomains.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView title,fee;
        ImageView pic;
        ImageView addBtn;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTxt);
            pic = itemView.findViewById(R.id.pic);
            fee = itemView.findViewById(R.id.fee);
            addBtn = itemView.findViewById(R.id.addBtn);


        }
    }
}

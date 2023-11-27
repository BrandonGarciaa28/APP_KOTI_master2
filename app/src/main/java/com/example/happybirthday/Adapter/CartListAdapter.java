package com.example.happybirthday.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.happybirthday.Domain.FoodDomain;
import com.example.happybirthday.Helper.ManagementCart;
import com.example.happybirthday.Interface.ChangeNumberItemsListener;
import com.example.happybirthday.R;

import java.util.ArrayList;

public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.viewholder> {
    ArrayList<FoodDomain> listFoodSelected;
    private ManagementCart managementCart;
    ChangeNumberItemsListener changeNumberItemsListener;

public CartListAdapter(ArrayList<FoodDomain>listFoodSelected, Context context, ChangeNumberItemsListener changeNumberItemsListener){
    this.listFoodSelected=listFoodSelected;
    managementCart=new ManagementCart(context);
    this.changeNumberItemsListener=changeNumberItemsListener;



}
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_cart, parent, false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.title.setText(listFoodSelected.get(position).getTitle());
        holder.feeEachItem.setText("$"+ listFoodSelected.get(position).getFee());
        holder.totalEachItem.setText("$" + Math.round((listFoodSelected.get(position).getNumberInCart()*listFoodSelected.get(position).getFee())));
        holder.num.setText(String.valueOf(listFoodSelected.get(position).getNumberInCart()));


        int drawableResourceId = holder.itemView.getContext().getResources()
                .getIdentifier(listFoodSelected.get(position).getPic(), "drawable",
                        holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);

        holder.plusItem.setOnClickListener(view -> managementCart.plusNumberFood(listFoodSelected, position, () -> {
            notifyDataSetChanged();
            changeNumberItemsListener.changed();

        }));

        holder.minusItem.setOnClickListener(v -> managementCart.minusNumberFood(listFoodSelected, position, () -> {
            notifyDataSetChanged();
            changeNumberItemsListener.changed();
        }));
    }



    @Override
    public int getItemCount() {
        return listFoodSelected.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView title,feeEachItem;
        ImageView pic,plusItem,minusItem;
TextView totalEachItem,num;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTxt);
            pic = itemView.findViewById(R.id.pic);
            feeEachItem = itemView.findViewById(R.id.fee);
            totalEachItem = itemView.findViewById(R.id.totalEachItem);
            plusItem=itemView.findViewById(R.id.plusCardBtn);
            minusItem=itemView.findViewById(R.id.minusCardBtn);
            num=itemView.findViewById(R.id.numberItemTxt);



        }
    }
}

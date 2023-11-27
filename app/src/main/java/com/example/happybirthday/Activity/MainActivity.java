package com.example.happybirthday.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happybirthday.Adapter.CategoryAdapter;
import com.example.happybirthday.Adapter.RecommendedAdapter;
import com.example.happybirthday.Domain.CategoryDomain;
import com.example.happybirthday.Domain.FoodDomain;
import com.example.happybirthday.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2, adapter3;
    private RecyclerView recyclerViewCategory, recyclerViewCategory2, recyclerViewCategory3; // Se agregó recyclerViewCategory3
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        recyclerViewCategory();
        recyclerViewCategory2();
        recyclerViewCategory3(); // Se agregó la llamada a recyclerViewCategory3
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategory = findViewById(R.id.view1);
        recyclerViewCategory.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categorylist = new ArrayList<>();
        categorylist.add(new CategoryDomain("Tienda","cat_1"));
        categorylist.add(new CategoryDomain("Tienda2","cat_2"));
        categorylist.add(new CategoryDomain("Tienda3","cat_3"));
        categorylist.add(new CategoryDomain("Tienda4","cat_4"));
        categorylist.add(new CategoryDomain("Tienda5","cat_5"));

        adapter = new CategoryAdapter(categorylist);
        recyclerViewCategory.setAdapter(adapter);
    }

    private void recyclerViewCategory2() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategory2 = findViewById(R.id.view2);
        recyclerViewCategory2.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categorylist = new ArrayList<>();
        categorylist.add(new CategoryDomain("Tienda","cat_1"));
        categorylist.add(new CategoryDomain("Tienda2","cat_2"));
        categorylist.add(new CategoryDomain("Tienda3","cat_3"));
        categorylist.add(new CategoryDomain("Tienda4","cat_4"));
        categorylist.add(new CategoryDomain("Tienda5","cat_5"));

        adapter2 = new CategoryAdapter(categorylist);
        recyclerViewCategory2.setAdapter(adapter2);
    }

    private void recyclerViewCategory3() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategory3 = findViewById(R.id.view3);
        recyclerViewCategory3.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Tienda1","cat_1","description 1",12.10,5,20,1000));
        foodList.add(new FoodDomain("Tienda2","cat_2","description 2",12.20,51,201,10001));
        foodList.add(new FoodDomain("Tienda3","cat_3","description 3",12.30,52,202,10002));


        adapter3 = new RecommendedAdapter(foodList);
        recyclerViewCategory3.setAdapter(adapter3);
    }
}

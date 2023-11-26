package com.example.happybirthday.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happybirthday.Adapter.CategoryAdapter;
import com.example.happybirthday.Domain.CategoryDomain;
import com.example.happybirthday.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recyclerViewCategory,recyclerViewPopularList;
@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tiendas);
    getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
    recyclerViewCategory();

}

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategory=findViewById(R.id.view1);
        recyclerViewCategory.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categorylist=new ArrayList<>();
        categorylist.add(new CategoryDomain("Tienda","cat_1"));
        categorylist.add(new CategoryDomain("Tienda2","cat_2"));
        categorylist.add(new CategoryDomain("Tienda3","cat_3"));
        categorylist.add(new CategoryDomain("Tienda4","cat_4"));
        categorylist.add(new CategoryDomain("Tienda5","cat_5"));


        adapter=new CategoryAdapter(categorylist);
recyclerViewCategory.setAdapter(adapter);
}


}

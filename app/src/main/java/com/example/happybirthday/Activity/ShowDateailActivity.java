package com.example.happybirthday.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.happybirthday.Domain.FoodDomain;
import com.example.happybirthday.Helper.ManagementCart;
import com.example.happybirthday.R;

import org.w3c.dom.Text;

import java.security.PrivateKey;

public class ShowDateailActivity extends AppCompatActivity {
    private TextView addToCarBtn;
    private TextView titleTxt, feeTxt,descriptionTxt,numberOrderTxt;
    private ImageView plusBtn, minusBtn,picFood;
    
    private FoodDomain object;
    private int numberOrder=1;
    private ManagementCart managementCart;
    
@Override 
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_show_dateail);
    
    managementCart=new ManagementCart(this)
;
iniView();


}

    private void iniView() {



    }
}
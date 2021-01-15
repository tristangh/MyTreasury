package com.example.MyTreasury;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_view);

    }

    public void onButtonClick(View v) {
        //Log.d("Dashboard error : ", String.valueOf(v.getId()));
        if (v.getId() == R.id.loginpageshow_button) {
            Intent i = new Intent(Dashboard.this, Login.class);
            startActivity(i);
        }


        if (v.getId() == R.id.expenselistshow_button) {
            Intent i = new Intent(Dashboard.this, ExpenseList.class);
            startActivity(i);
        }


        if (v.getId() == R.id.addexpenseshow_button) {
            Intent i = new Intent(Dashboard.this, AddExpense.class);
            startActivity(i);
        }

        if (v.getId() == R.id.accountpageshow_button) {
            Intent i = new Intent(Dashboard.this, Account.class);
            startActivity(i);
        }

    }


}
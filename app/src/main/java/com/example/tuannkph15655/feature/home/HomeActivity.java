package com.example.tuannkph15655.feature.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tuannkph15655.R;
import com.example.tuannkph15655.feature.login.LoginActivity;
import com.example.tuannkph15655.feature.register.RegisterActivity;
import com.example.tuannkph15655.model.AccountResult;
import com.example.tuannkph15655.model.BookResult;
import com.example.tuannkph15655.model.RegisterResult;
import com.example.tuannkph15655.network.ApiService;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img_search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        img_search = findViewById(R.id.img_search);
        setListener();
    }

    private void setListener() {
        img_search.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_search:
                ApiService.API_SERVICE.register("tuannk33333333331", "tuan@gmail.como", "tuannk33331" ,"tuan1234").enqueue(new Callback<RegisterResult>() {
                    @Override
                    public void onResponse(Call<RegisterResult> call, Response<RegisterResult> response) {
                        Intent i;
                        Log.e("", "");
//                        i = new Intent(view.getContext(), LoginActivity.class);
//                        startActivity(i);
//                        Toast.makeText(view.getContext(), "Tạo tài khoản thành công", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<RegisterResult> call, Throwable t) {
                        Log.e("", "");
                    }
                });

//                ApiService.API_SERVICE.getListBook(1,  10, 2, 1 , "tap tiep theo").enqueue(new Callback<BookResult>() {
//                    @Override
//                    public void onResponse(Call<BookResult> call, Response<BookResult> response) {
//                        if(response != null) {
//
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<BookResult> call, Throwable t) {
//                        if(call != null) {
//
//                        }
//                    }
//                });
                break;
        }
    }
}
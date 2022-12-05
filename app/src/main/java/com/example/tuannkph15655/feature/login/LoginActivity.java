package com.example.tuannkph15655.feature.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tuannkph15655.R;
import com.example.tuannkph15655.feature.register.RegisterActivity;
import com.example.tuannkph15655.model.AccountResult;
import com.example.tuannkph15655.model.RegisterResult;
import com.example.tuannkph15655.network.ApiService;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.tv_login)
    TextView tv_login;
    @BindView(R.id.tv_register)
    TextView tv_register;
    @BindView(R.id.ic_back)
    ImageView ic_back;
    @BindView(R.id.ed_sdt)
    TextInputEditText ed_sdt;
    @BindView(R.id.etPassword)
    TextInputEditText etPassword;
    @BindView(R.id.lo_sdt)
    TextInputLayout lo_sdt;
    @BindView(R.id.etPasswordLayout)
    TextInputLayout etPasswordLayout;
    Context context;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setListener();
    }
    private void setListener() {
        tv_login.setOnClickListener(this);
        ed_sdt.setOnClickListener(this);
        etPassword.setOnClickListener(this);
        tv_register.setOnClickListener(this);
        ic_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login:
                String name = ed_sdt.getText().toString();
                String pass = etPassword.getText().toString();
                if(name.equals("")) {
                    lo_sdt.setError("tên đăng nhập không được trống!");
                    return;
                }

                if(pass.equals("")) {
                    etPasswordLayout.setError("Mật khẩu không được trống!");
                    return;
                }
//                ApiService.API_SERVICE.login(name, pass).enqueue(new Callback<RegisterResult>() {
//                    @Override
//                    public void onResponse(Call<RegisterResult> call, Response<RegisterResult> response) {
//                        Intent i;
//                        i = new Intent(view.getContext(), LoginActivity.class);
//                        startActivity(i);
////                        Toast.makeText(view.getContext(), "Tạo tài khoản thành công", Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<RegisterResult> call, Throwable t) {
//
//                    }
//                });
                break;
            case R.id.ed_sdt:
                Log.e("tag:  ", "cldsvick");
                break;

            case R.id.etPassword:
                Log.e("tag:  ", "cdslick");
                break;
            case R.id.tv_register:
                Intent i;
                i = new Intent(view.getContext(), RegisterActivity.class);
                startActivity(i);
                break;
            case R.id.ic_back:
//                mPresenter.back();
                break;
        }
    }
}
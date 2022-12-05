package com.example.tuannkph15655.feature.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tuannkph15655.R;
import com.example.tuannkph15655.feature.login.LoginActivity;
import com.example.tuannkph15655.model.AccountResult;
import com.example.tuannkph15655.model.RegisterResult;
import com.example.tuannkph15655.network.ApiService;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity implements  View.OnClickListener{

    @BindView(R.id.btn_register)
    TextView btn_register;
    @BindView(R.id.img_back)
    ImageView img_back;
    @BindView(R.id.ed_name)
    TextInputEditText ed_name;
    @BindView(R.id.ed_username)
    TextInputEditText ed_username;
    @BindView(R.id.ed_email)
    TextInputEditText ed_email;
    @BindView(R.id.ed_pass)
    TextInputEditText ed_pass;
    @BindView(R.id.ed_repass)
    TextInputEditText ed_repass;
    @BindView(R.id.lo_username)
    TextInputLayout lo_username;
    @BindView(R.id.lo_name)
    TextInputLayout lo_name;
    @BindView(R.id.lo_pass)
    TextInputLayout lo_pass;
    @BindView(R.id.lo_repass)
    TextInputLayout lo_repass;
    @BindView(R.id.lo_email)
    TextInputLayout lo_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setListener();
    }

    private void setListener() {
        btn_register.setOnClickListener(this);
        ed_name.setOnClickListener(this);
        ed_username.setOnClickListener(this);
        ed_pass.setOnClickListener(this);
        ed_repass.setOnClickListener(this);
        img_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                String name = ed_name.getText().toString();
                String username = ed_username.getText().toString();
                String pass = ed_pass.getText().toString();
                String rePass = ed_repass.getText().toString();
                String email = ed_email.getText().toString();
                if(name.equals("")) {
                    lo_name.setError("Tên không được trống!");
                    return;
                }

                if(email.equals("")) {
                    lo_email.setError("Email không được trống!");
                    return;
                }

                if(username.equals("")) {
                    lo_username.setError("Tên đăng nhập không được trống!");
                    return;
                }
                if(pass.equals("")) {
                    lo_pass.setError("Mật khẩu không được trống!");
                    return;
                }
                if(rePass.equals("")) {
                    lo_repass.setError("Mật khẩu xác nhận không được trống!");
                    return;
                }
                if(!pass.equals(rePass)) {
                    lo_repass.setError("Mật khẩu xác nhận không đúng!");
                    return;
                }
//                ApiService.API_SERVICE.register(name, email, username, pass).enqueue(new Callback<RegisterResult>() {
//                    @Override
//                    public void onResponse(Call<RegisterResult> call, Response<RegisterResult> response) {
//                        Intent i;
//                        i = new Intent(view.getContext(), LoginActivity.class);
//                        startActivity(i);
//                        Toast.makeText(view.getContext(), "Tạo tài khoản thành công", Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<RegisterResult> call, Throwable t) {
//
//                    }
//                });
                break;
            case R.id.img_back:
                finish();
                break;
        }
    }
}
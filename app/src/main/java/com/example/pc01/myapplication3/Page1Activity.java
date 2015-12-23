package com.example.pc01.myapplication3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import uk.co.senab.actionbarpulltorefresh.library.ActionBarPullToRefresh;
import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshLayout;

public class Page1Activity extends AppCompatActivity implements View.OnClickListener{

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private Button btn1;
    private EditText mEtPassword ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        mEtPassword = (EditText) findViewById(R.id.editText);

        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btnC = (Button) findViewById(R.id.btnClear);
        btnC.setOnClickListener(this);
        ImageButton btnD = (ImageButton) findViewById(R.id.btnDel);
        btnD.setOnClickListener(this);
        ImageButton btnS = (ImageButton) findViewById(R.id.imageButtonSubmit);
        btnS.setOnClickListener(this);

    }


    private void setViews(){
        // find view references...
        // set OnClickListener to each key view...
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                mEtPassword.append("0");
                break;
            case R.id.btn1:
                mEtPassword.append("1");
                break;
            case R.id.btn2:
                mEtPassword.append("2");
                break;
            case R.id.btn3:
                mEtPassword.append("3");
                break;
            case R.id.btn4:
                mEtPassword.append("4");
                break;
            case R.id.btn5:
                mEtPassword.append("5");
                break;
            case R.id.btn6:
                mEtPassword.append("6");
                break;
            case R.id.btn7:
                mEtPassword.append("7");
                break;
            case R.id.btn8:
                mEtPassword.append("8");
                break;
            case R.id.btn9:
                mEtPassword.append("9");
                break;
            case R.id.imageButtonSubmit:
                Toast toast = Toast.makeText(v.getContext(), mEtPassword.getText().toString(), Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.btnDel: {
                // delete one character
                String passwordStr = mEtPassword.getText().toString();
                if (passwordStr.length() > 0) {
                    String newPasswordStr = new StringBuilder(passwordStr)
                            .deleteCharAt(passwordStr.length() - 1).toString();
                    mEtPassword.setText(newPasswordStr);
                }
            }
            break;
            case R.id.btnClear:
                // clear password field
                mEtPassword.setText(null);
                break;
        }
    }


}

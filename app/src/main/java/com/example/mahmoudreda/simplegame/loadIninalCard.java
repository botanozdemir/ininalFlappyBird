package com.example.mahmoudreda.simplegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mahmoudreda.simplegame.request.LoadBalanceRequest;
import com.example.mahmoudreda.simplegame.rest.RestClient;

import java.util.Calendar;

//import com.example.mahmoudreda.simplegame.listener.LoadBalanceListener;

/**
 * Created by botanozdemir on 13.11.2017.
 */

public class loadIninalCard extends AppCompatActivity {

    Button b1;
    private TextView mScore;
    private EditText mNameEditText;
    private TextView mHint;
    private EditText mSurnameEditText;
    private TextView mTcknTextView;
    private EditText mTcknEditText;
    private TextView mSecretSurnameTextView;
    private EditText mSecretSurnameEditText;
    private TextView mBirthdayTextView;
    private TextView mBirthdaySpinnerTextView;
    private Button mNextButton;
    private TextView mNameInfoTextView;
    private TextView mSurnameInfoTextView;
    private TextView mTcknInfoTextView;
    private TextView mSecretSurnameInfoTextView;
    private TextView mNameErrorTextView;
    private TextView mSurnameErrorTextView;
    private TextView mTcknErrorTextView;
    private TextView mSecretSurnameErrorTextView;
    private Calendar calendar;
    private View.OnFocusChangeListener editTextFocusChangeListener;
    private boolean nextButtonClicked;
    private View.OnClickListener textViewOnClickListener;
//    private LoadBalanceListener loadBalanceListener;
    private int scorestr;
    private DialogFragment mProgressDialog;
    RestClient restClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerandload);

        b1 = (Button) findViewById(R.id.nextButton);
        mSecretSurnameTextView = (TextView) findViewById(R.id.secretSurnameTextView);
        mSecretSurnameEditText = (EditText) findViewById(R.id.secretSurnameEditText);
        mSecretSurnameInfoTextView = (TextView) findViewById(R.id.secretSurnameInfoTextView);
        mSecretSurnameErrorTextView = (TextView) findViewById(R.id.secretSurnameErrorTextView);
        mScore = (TextView) findViewById(R.id.Score);
        mHint = (TextView) findViewById(R.id.infor);
        restClient = new RestClient();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        scorestr = bundle.getInt("score");
        String score = String.valueOf(scorestr);
        mScore.setText("Skor: " + score + " Puan");
        double amount = scorestr * 0.10;
        String amounrStr = String.valueOf(amount);
        mHint.setText("Kazancınız " + amounrStr + " TL dir. Her puan başına 10 kuruş kazanırsınız.");
        final LoadBalanceRequest loadBalanceRequest = new LoadBalanceRequest();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mSecretSurnameEditText.length() != 13)
                {
                    Toast.makeText(loadIninalCard.this, "Geçersiz bir barkod numarası girdiniz!", Toast.LENGTH_SHORT).show();
                }
                else {
//                restClient.loadBalance(loadBalanceListener, loadBalanceRequest);
                    Intent intent = new Intent(getApplicationContext(), SuccessActivity.class);
                    startActivity(intent);
                }

            }
        });
    }

//    @Override
//    public void loadBalanceConnectionStart() {
//
//    }
//
//    @Override
//    public void loadBalanceConnectionEnd(BaseResponse<LoadBalanceResponse> baseResponse) {
//
//        if (baseResponse.isSuccessful()) {
//
//        }
//    }
}

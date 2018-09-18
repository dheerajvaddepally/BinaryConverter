package com.example.binaryconverter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.binaryconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        mBinding.one.setOnClickListener(v -> mBinding.enteredNumber.append("1"));
        mBinding.two.setOnClickListener(v -> mBinding.enteredNumber.append("2"));
        mBinding.three.setOnClickListener(v -> mBinding.enteredNumber.append("3"));
        mBinding.four.setOnClickListener(v -> mBinding.enteredNumber.append("4"));
        mBinding.five.setOnClickListener(v -> mBinding.enteredNumber.append("5"));
        mBinding.six.setOnClickListener(v -> mBinding.enteredNumber.append("6"));
        mBinding.seven.setOnClickListener(v -> mBinding.enteredNumber.append("7"));
        mBinding.eight.setOnClickListener(v -> mBinding.enteredNumber.append("8"));
        mBinding.nine.setOnClickListener(v -> mBinding.enteredNumber.append("9"));
        mBinding.zero.setOnClickListener(v -> mBinding.enteredNumber.append("0"));
        mBinding.convertButton.setOnClickListener(v -> convertToBinary());
        mBinding.clearButton.setOnClickListener(v -> {
            mBinding.enteredNumber.setText("");
            mBinding.binaryResult.setText("");
        });
    }

    private void convertToBinary() {
        int enteredNumber = Integer.parseInt(mBinding.enteredNumber.getText().toString());
        String binaryResult = Integer.toBinaryString(enteredNumber);
        mBinding.binaryResult.setText(binaryResult);
    }
}

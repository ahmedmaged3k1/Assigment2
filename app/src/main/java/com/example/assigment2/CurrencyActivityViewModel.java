package com.example.assigment2;

import static android.content.ContentValues.TAG;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CurrencyActivityViewModel extends ViewModel {
    public MutableLiveData<String> egyptianPound = new MutableLiveData<>("0") ;
    public MutableLiveData<String> dollar = new MutableLiveData<>("0") ;
    public MutableLiveData<String> convertedCurrency = new MutableLiveData<>() ;
    public CurrencyConverter currencyConverter = new CurrencyConverter() ;

    public void convert(){

        if (dollar.getValue().equals("0")&&egyptianPound.getValue().equals("0")){
            convertedCurrency.setValue("No Number Entered");
        }

       else if (dollar.getValue().equals("0"))
        {
            currencyConverter.setEgyPound(Float.parseFloat(egyptianPound.getValue()));
            convertedCurrency.setValue(String.valueOf(currencyConverter.convertToDollar()));

        }
        else    if (egyptianPound.getValue().equals("0"))
        {
            currencyConverter.setDollar(Float.parseFloat(dollar.getValue()));
            convertedCurrency.setValue(String.valueOf(currencyConverter.convertToEgy()));
        }

        

    }

    public void clear(View view){
        dollar.setValue("0");
        convertedCurrency.setValue("0");
        egyptianPound.setValue("0");

    }

}

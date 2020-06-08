package com.example.livedatawithviewmodel;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;
public class MainActivityViewModel extends ViewModel {

    private String TAG = this.getClass().getSimpleName();
    private MutableLiveData<String> myRandomNumber;
    
    public MutableLiveData<String> getNumber(){
        Log.d( TAG, "getNumber: " );
        if (myRandomNumber == null){
            myRandomNumber = new MutableLiveData<>();
            createNumber();
        }
        return myRandomNumber;
    }

    public void createNumber() {
        Log.d( TAG, "createNumber: " );
        Random random = new Random(  );
        myRandomNumber.setValue("Number: " + (random.nextInt(10-1)+1)  );
    }

}

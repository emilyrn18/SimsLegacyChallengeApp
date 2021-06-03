package com.example.simslegacychallenge.ui.famtree;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FamTreeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FamTreeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
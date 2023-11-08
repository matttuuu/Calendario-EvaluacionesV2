package com.example.calendarioexamenes_idra.ui.testFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class testViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public testViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esto es un fragmento de prueba");
    }

    public LiveData<String> getText() {
        return mText;
    }

}

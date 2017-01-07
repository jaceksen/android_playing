package pl.jaceksen.playing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        tu określamy jaki layout będzie widoczny
//        layout jest w app/res/layout
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.note_layout);
    }
}

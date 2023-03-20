package com.example.hw3_2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
 FragmentContainerView fragmentContainerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateToFirstFragment();
    }
    private void navigateToFirstFragment() {
        getSupportFragmentManager()
                .beginTransaction().
                add(R.id.fragment_container_view,new FirstFragment())
                .commit();
    }
}
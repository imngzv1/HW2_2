package com.example.hw3_2;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FourthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getBudle();
        navigateToFifth();
    }
    private void navigateToFifth() {
        FifthFragment fragment=new FifthFragment();
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view,fragment)
                .commit();
    }
    private void getBudle() {
        if (getArguments()!= null) {
            String arguments=getArguments().getString("arguments");
            System.out.println(arguments);
        }
    }
}
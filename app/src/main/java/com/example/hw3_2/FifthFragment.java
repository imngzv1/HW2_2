package com.example.hw3_2;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class FifthFragment extends Fragment {
    private TextView txt_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt_view=requireActivity().findViewById(R.id.text_view);
        Bundle bundle= new Bundle();
        if (getArguments() !=null) {
            String nameOfArray=getArguments().getString("name_key");
            System.out.println(nameOfArray);
        }
        if (getArguments()!= null) {
            String numbers=getArguments().getString("number_key");
            System.out.println(numbers);
        }
        if (getArguments()!= null) {
            String arguments=getArguments().getString("arguments");
            System.out.println(arguments);
        }
    }
}





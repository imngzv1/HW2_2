package com.example.hw3_2;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {
    AppCompatButton buttonNavigation;
    AppCompatButton buttonNavgationTwo;
    AppCompatButton buttonNavgationThree;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        clickListeners();
    }
    private void findViews() {
        buttonNavigation = requireActivity().findViewById(R.id.button_fr_1);
        buttonNavgationTwo=requireActivity().findViewById(R.id.button_fr_2);
        buttonNavgationThree=requireActivity().findViewById(R.id.button_fr_3);
    }
    private void clickListeners() {
        buttonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSecondFragment();
            }
        });
        buttonNavgationTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToThirdFragment();
            }
        });
        buttonNavgationThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFourthFragment();
                navigateToFifthFragment();
            }
        });
    }
    private void navigateToSecondFragment() {
        String[] myString = new String[]{"Hi", "Hello", "Bye", "Good Night", "Morning"};
        int n = (int) Math.floor(Math.random() * myString.length);
        SecondFragment secondFragment = new SecondFragment();
        FifthFragment fifthFragment=new FifthFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name_key", myString[n]);
        secondFragment.setArguments(bundle);
        fifthFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, secondFragment)
                .commit();
    }
    private void navigateToThirdFragment() {
        ThirdFragment thirdFragment= new ThirdFragment();
        Bundle bundle=new Bundle();
        int [] numbers= new int[]{1,10,11,12,14,18,200,2000,23333};
        for (int numbeForEach:numbers) {
            if (numbeForEach % 2 == 0) {
                System.out.println(numbeForEach);
            }
            bundle.putString("number_key", String.valueOf(numbeForEach));
            thirdFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_view, thirdFragment)
                    .commit();
        }
    }
    private void navigateToFourthFragment(){
        FourthFragment fourthFragment= new FourthFragment();
        FifthFragment fifthFragment=new FifthFragment();
        Bundle bundle= new Bundle();
    bundle.putString("arguments",Boolean.toString(true)+" "+Boolean.toString(false)+" "+
            Double.toString(12.15)+" "+Float.toString((float) 155.12));
        fourthFragment.setArguments(bundle);
        fifthFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.fragment_container_view,fourthFragment)
            .commit();
    }
    private void navigateToFifthFragment() {
        FifthFragment fifthFragment = new FifthFragment();
        Bundle bundle = new Bundle();
        String[] myString = new String[]{"Hi", "Hello", "Bye", "Good Night", "Morning"};
        int n = (int) Math.floor(Math.random() * myString.length);

        bundle.putString("name_key", myString[n]);
        fifthFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, fifthFragment)
                .commit();

        int [] numbers= new int[]{1,10,11,12,14,18,200,2000,23333};
        for (int numbeForEach:numbers) {
            if (numbeForEach % 2 == 0) {
                System.out.println(numbeForEach);
            }
            bundle.putString("number_key", String.valueOf(numbeForEach));
            fifthFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_view, fifthFragment)
                    .commit();

            bundle.putString("arguments", Boolean.toString(true) + " " + Boolean.toString(false) + " " +
                    Double.toString(12.15) + " " + Float.toString((float) 155.12));
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_view,fifthFragment)
                    .commit();
        }
    }
}
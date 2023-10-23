package com.enjamamulhoque.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating car instance using dagger
        CarComponent component = DaggerCarComponent.create();

        // getting car instance without taking care of what are the components that it needs
        // because dagger do this for us
        car = component.getCar();

        // now calling car method
        car.drive();
    }
}
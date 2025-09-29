package com.example.lab01_1a;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private LinearLayout llNameContainer, llAddressContainer, llParentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createNameContainer();
        createAddressContainer();
        createParentContainer();

        setContentView(llParentContainer);
    }

    private void createNameContainer() {
        llNameContainer = new LinearLayout(this);
        llNameContainer.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        llNameContainer.setOrientation(LinearLayout.HORIZONTAL);

        TextView tvName = new TextView(this);
        tvName.setText("Name: ");
        llNameContainer.addView(tvName);

        TextView tvNameValue = new TextView(this);
        tvNameValue.setText("Minh Nguyen");
        llNameContainer.addView(tvNameValue);
    }

    private void createAddressContainer() {
        llAddressContainer = new LinearLayout(this);
        llAddressContainer.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        llAddressContainer.setOrientation(LinearLayout.HORIZONTAL);

        TextView tvAddress = new TextView(this);
        tvAddress.setText("Address:");
        llAddressContainer.addView(tvAddress);

        TextView tvAddressValue = new TextView(this);
        tvAddressValue.setText("Vinhomes Grand Park");
        llAddressContainer.addView(tvAddressValue);
    }

    private void createParentContainer() {
        llParentContainer = new LinearLayout(this);
        llParentContainer.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        llParentContainer.setOrientation(LinearLayout.VERTICAL);

        llParentContainer.addView(llNameContainer);
        llParentContainer.addView(llAddressContainer);
    }
}
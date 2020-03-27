package com.efarrar.custombutton;

/** NOTES for PROJECT
 * URL 1: https://codinginflow.com/tutorials/android/custom-button-with-shapedrawables
 * URL 2: https://www.youtube.com/watch?v=Z1w3y0saKjY
 * Step 1: Configured the 3 button state xml files (button_default, button_pressed, button_disabled)
 * For this the selector is set to shape
 * Step 2: Configured custom_button.xml to set the state and assign the proper drawable
 * In this step the order of the items matter; see notes in this XML
 * Step 3: Configure the activity_main.xml;
 * Step 4: Configure the behavior in Activity to set the listeners for the button and switch
 * Step 5: Test
 * Step 6: add new style to styles.xml to set the button style globally. Once CustomButton style is created
 * add buttonStyle in global style so all buttons have this style
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button customButton = findViewById(R.id.custom_button);
        Switch switchEnableButton = findViewById(R.id.switch_enable_button);

        /**listener for the button that just delivers a toast notification  */
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });


        /** listner for switch to enable of disable the customButton  */
        switchEnableButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    customButton.setEnabled(true);
                }else {
                    customButton.setEnabled(false);
                }

            }
        });

    }
}

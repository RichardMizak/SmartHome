package sk.kasv.izak.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_light;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button_light=findViewById(R.id.Lights);

    button_light.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivity2();
        }
    });

    }
    public void openActivity2(){
        Intent intent=new Intent(this, Activity_2.class);
        startActivity(intent);
    }
}
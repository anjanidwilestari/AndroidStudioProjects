package polinema.ac.id.dtschapter03_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideAssign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_assign);
    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideAssign.this, WelcomeBack.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideAssign.this, WelcomeBack.class);
        startActivity(i);
    }
}
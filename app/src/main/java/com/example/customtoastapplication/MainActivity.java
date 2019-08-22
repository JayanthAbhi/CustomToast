package com.example.customtoastapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.customtoastapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CustomToastMVP.CustomToastView {

    private ActivityMainBinding mActivityMainBinding;
    private View mToastLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mActivityMainBinding.setPresenter(new CustomToastPresenterImpl(this));
        inflateToastLayout();
    }

    private void inflateToastLayout() {
        LayoutInflater layoutInflater = getLayoutInflater();
        mToastLayout = layoutInflater.inflate(R.layout.layout_custom_toast,
                (ViewGroup) findViewById(R.id.cl_layout_custom_toast));
    }

    @Override
    public void displayCustomToast() {
        Toast customToast = new Toast(getApplicationContext());
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.setGravity(Gravity.CENTER, 0, 0);
        customToast.setView(mToastLayout);
        customToast.show();
    }

    @Override
    public void displayLeftToast() {
        Toast leftToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_left), Toast.LENGTH_LONG);
        leftToast.setGravity(Gravity.LEFT, 0, 0);
        leftToast.show();
    }

    @Override
    public void displayRightToast() {
        Toast rightToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_right), Toast.LENGTH_LONG);
        rightToast.setGravity(Gravity.RIGHT, 0, 0);
        rightToast.show();
    }

    @Override
    public void displayBottomToast() {
        Toast bottomToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_bottom), Toast.LENGTH_LONG);
        bottomToast.setGravity(Gravity.BOTTOM, 0, 0);
        bottomToast.show();
    }

    @Override
    public void displayTopToast() {
        Toast topToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_top), Toast.LENGTH_LONG);
        topToast.setGravity(Gravity.TOP, 0, 0);
        topToast.show();
    }

    @Override
    public void displayBottomLeftToast() {
        Toast bottomLeftToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_bottom_left), Toast.LENGTH_LONG);
        bottomLeftToast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
        bottomLeftToast.show();
    }

    @Override
    public void displayBottomRightToast() {
        Toast bottomRightToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_bottom_right), Toast.LENGTH_LONG);
        bottomRightToast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
        bottomRightToast.show();
    }

    @Override
    public void displayTopLeftToast() {
        Toast topLeftToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_top_left), Toast.LENGTH_LONG);
        topLeftToast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
        topLeftToast.show();
    }

    @Override
    public void displayTopRightToast() {
        Toast topRightToast = Toast.makeText(getApplicationContext(), this.getResources()
                .getString(R.string.text_toast_at_top_right), Toast.LENGTH_LONG);
        topRightToast.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
        topRightToast.show();
    }
}

package com.example.customtoastapplication;

public class CustomToastPresenterImpl implements CustomToastMVP.CustomToastPresenter {

    private CustomToastMVP.CustomToastView mCustomToastView;

    public CustomToastPresenterImpl(CustomToastMVP.CustomToastView customToastView) {
        mCustomToastView = customToastView;
    }

    @Override
    public void showToastButtonOnClickListener() {
        mCustomToastView.displayCustomToast();
    }

    @Override
    public void leftToastButtonClickListener() {
        mCustomToastView.displayLeftToast();
    }

    @Override
    public void rightToastButtonClickListener() {
        mCustomToastView.displayRightToast();
    }

    @Override
    public void bottomToastButtonClickListener() {
        mCustomToastView.displayBottomToast();
    }

    @Override
    public void topToastButtonClickListener() {
        mCustomToastView.displayTopToast();
    }

    @Override
    public void bottomLeftButtonClickListener() {
        mCustomToastView.displayBottomLeftToast();
    }

    @Override
    public void bottomRightButtonClickListener() {
        mCustomToastView.displayBottomRightToast();
    }

    @Override
    public void topLeftButtonClickListener() {
        mCustomToastView.displayTopLeftToast();
    }

    @Override
    public void topRightButtonClickListener() {
        mCustomToastView.displayTopRightToast();
    }
}

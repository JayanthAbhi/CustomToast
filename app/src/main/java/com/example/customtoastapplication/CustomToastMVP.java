package com.example.customtoastapplication;

public interface CustomToastMVP {

    interface CustomToastView {

        void displayCustomToast();

        void displayLeftToast();

        void displayRightToast();

        void displayBottomToast();

        void displayTopToast();

        void displayBottomLeftToast();

        void displayBottomRightToast();

        void displayTopLeftToast();

        void displayTopRightToast();
    }

    interface CustomToastPresenter {

        void showToastButtonOnClickListener();

        void leftToastButtonClickListener();

        void rightToastButtonClickListener();

        void bottomToastButtonClickListener();

        void topToastButtonClickListener();

        void bottomLeftButtonClickListener();

        void bottomRightButtonClickListener();

        void topLeftButtonClickListener();

        void topRightButtonClickListener();
    }
}

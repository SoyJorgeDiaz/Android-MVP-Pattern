package co.com.diaz.loginmvp.interactors;

import android.os.Handler;

import co.com.diaz.loginmvp.interfaces.ILoginInteractor;
import co.com.diaz.loginmvp.listeners.IOnLoginFinishedListener;

/**
 * Created by SoyJorgeDiaz on 29/12/2017.
 */

public class LoginInteractorImpl implements ILoginInteractor {
    @Override
    public void validateCredentials(final IOnLoginFinishedListener listener, final String username, final String password) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (username.length() > 0 && password.length() > 0){
                    listener.onSuccess();
                }else {
                    listener.onError();
                }
            }
        }, 3000);
    }
}

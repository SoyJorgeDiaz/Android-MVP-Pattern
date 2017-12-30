package co.com.diaz.loginmvp.interfaces;

import co.com.diaz.loginmvp.listeners.IOnLoginFinishedListener;

/**
 * Created by SoyJorgeDiaz on 28/12/2017.
 */

public interface ILoginInteractor {
    void validateCredentials(IOnLoginFinishedListener listener, String username, String password);
}

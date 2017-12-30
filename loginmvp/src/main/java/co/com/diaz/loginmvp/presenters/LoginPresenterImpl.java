package co.com.diaz.loginmvp.presenters;

import co.com.diaz.loginmvp.interactors.LoginInteractorImpl;
import co.com.diaz.loginmvp.interfaces.ILoginInteractor;
import co.com.diaz.loginmvp.interfaces.ILoginPresenter;
import co.com.diaz.loginmvp.interfaces.ILoginView;

/**
 * Created by SoyJorgeDiaz on 29/12/2017.
 */

public class LoginPresenterImpl implements ILoginPresenter {

    private ILoginView iLoginView;
    private ILoginInteractor iLoginInteractor;

    public LoginPresenterImpl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        iLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void attempLogin(String username, String password) {

    }
}

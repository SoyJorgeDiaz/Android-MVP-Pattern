package co.com.diaz.loginmvp.interfaces;

/**
 * Created by SoyJorgeDiaz on 28/12/2017.
 */

public interface ILoginView {
    void showProgress();
    void hideProgress();
    void accessSuccessful();
    void accessDenied();
}

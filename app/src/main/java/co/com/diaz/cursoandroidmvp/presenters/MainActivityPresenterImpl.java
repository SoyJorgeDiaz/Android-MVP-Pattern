package co.com.diaz.cursoandroidmvp.presenters;

import co.com.diaz.cursoandroidmvp.interactors.MainActivityInteractorImpl;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityInteractor;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityPresenter;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityView;

/**
 * Created by SoyJorgeDiaz on 27/12/2017.
 */

public class MainActivityPresenterImpl implements IMainActivityPresenter{

    private IMainActivityView iView;
    private IMainActivityInteractor iInteractor;

    public MainActivityPresenterImpl(IMainActivityView iView) {
        this.iView = iView;
        iInteractor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResult(String s) {

    }

    @Override
    public void addText(String s) {

    }
}

package co.com.diaz.cursoandroidmvp.interactors;

import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityInteractor;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityPresenter;
import co.com.diaz.cursoandroidmvp.presenters.MainActivityPresenterImpl;

/**
 * Created by SoyJorgeDiaz on 27/12/2017.
 */

public class MainActivityInteractorImpl implements IMainActivityInteractor{

    private IMainActivityPresenter iPresenter;
    private String data;

    public MainActivityInteractorImpl(MainActivityPresenterImpl presenterImpl) {
        this.iPresenter = presenterImpl;
    }

    @Override
    public void addText(String s) {
        data = "El texto ingresado es:\n" + s;
        iPresenter.showResult(data);
    }
}

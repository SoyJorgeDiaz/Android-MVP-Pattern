package co.com.diaz.cursoandroidmvp.interactors;

import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityInteractor;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityPresenter;

/**
 * Created by SoyJorgeDiaz on 27/12/2017.
 */

public class MainActivityInteractorImpl implements IMainActivityInteractor{

    private IMainActivityPresenter iPresenter;

    public MainActivityInteractorImpl(IMainActivityPresenter iPresenter) {
        this.iPresenter = iPresenter;
    }

    @Override
    public void addText(String s) {

    }
}

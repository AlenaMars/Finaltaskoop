package org.example.View;

import org.example.Operations.Model;
import org.example.Presentation.Presenter;

public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
}
package com.yurwar.trainingcourse.controller;

import com.yurwar.trainingcourse.model.Model;
import com.yurwar.trainingcourse.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        view.print(model.getRepeatableNumberMap());
    }
}

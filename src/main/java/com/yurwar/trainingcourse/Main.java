package com.yurwar.trainingcourse;

import com.yurwar.trainingcourse.controller.Controller;
import com.yurwar.trainingcourse.model.Model;
import com.yurwar.trainingcourse.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }
}

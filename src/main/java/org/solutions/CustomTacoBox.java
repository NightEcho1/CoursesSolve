package org.solutions;

public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }


    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if ((tacosRemaining() - 1) <= 0) {
            this.tacos = 0;
        } else {
            this.tacos -= 1;
        }
    }
}

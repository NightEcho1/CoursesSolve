package org.solutions;

public class Container {
    private int size;

    public Container() {
        this.size = 0;
    }

    public int contains() {
        return size;
    }

    public void add(int amount) {
        if ((amount >= 0) && (this.size + amount > 100)) {
            this.size = 100;
        } else if (!(amount < 0)) {
            this.size += amount;
        }
    }

    public void move(int amount, Container target) {
        if (amount < 0) {
            return;
        }

        int movable = Math.min(amount, this.size);
        int freeSpace = 100 - target.size;

        int actuallyMoved = Math.min(movable, freeSpace);

        this.size -= actuallyMoved;
        target.size += actuallyMoved;
    }

    public void remove(int amount) {
        if ((amount >= 0) && (amount > this.size)) {
            this.size = 0;
        } else if (amount >= 0) {
            this.size -= amount;
        }
    }

    @Override
    public String toString() {
        return this.size + "/100";
    }
}

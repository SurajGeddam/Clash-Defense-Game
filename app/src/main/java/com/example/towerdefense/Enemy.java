package com.example.towerdefense;

import android.view.View;
import android.widget.Toast;

public class Enemy {
    private int movementSpeed;
    private int timeBetween;
    private int damage;
    private int health;
    private String type;
    private int layout;
    private View view;

    //create view for the enemy (image)

    public Enemy(String type, View view) {
        this(type);
        this.setView(view);
    }

    public Enemy(String type) {
        if (type.equals("witch")) {
            setLayout(R.layout.witch);
            setMovementSpeed(20000);
            setTimeBetween(5000);
            setDamage(30);
            setHealth(100);
        } else if (type.equals("wizard")) {
            setLayout(R.layout.wizard);
            setMovementSpeed(20000);
            setTimeBetween(5000);
            setDamage(50);
            setHealth(70);
        } else if (type.equals("archer")) {
            setLayout(R.layout.archer);
            setMovementSpeed(20000);
            setTimeBetween(5000);

            setDamage(10);
            setHealth(50);
        } else {
            setLayout(R.layout.archer);
            setMovementSpeed(100);
            setTimeBetween(100);

            setDamage(0);
            setHealth(0);
        }
    }



    public void attack(Player player) {
        player.setMonumentHealth(player.getMonumentHealth() - this.damage);
    }
    //use Player.setMonumentHealth based on tower's damage
    //Update text
    //Check if momnument is below 0, if it is endGame()
    //Despawn the enemy object

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTimeBetween() {
        return timeBetween;
    }

    public void setTimeBetween(int timeBetween) {
        this.timeBetween = timeBetween;
    }
}
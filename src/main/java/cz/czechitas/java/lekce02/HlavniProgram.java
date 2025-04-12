package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    domecek();
    zofka.turnLeft(45);
    zofka.move(38);
    zofka.turnLeft(90);
    zofka.move(38);

    zofka.penUp();
    zofka.turnRight(45);
    zofka.move(100);
    zofka.penDown();
    domecek();
    strecha();
    zofka.turnRight(15);
    nohy();
    zofka.turnRight(70);
    zofka.penUp();
    zofka.move(50);
    zofka.turnRight(50);
    zofka.penDown();
    nohy();
  }

  public void domecek() {
    zofka.penDown();
    for (int i = 0; i < 4; i++) {
      zofka.turnLeft(90);
      zofka.move(50);
    }
  }


  public void strecha() {
    zofka.turnLeft(45);
    zofka.move(38);
    zofka.turnLeft(90);
    zofka.move(38);
  }


  public void nohy() {
    zofka.move(20);
    zofka.turnRight(120);
    zofka.penUp();
    zofka.move(25);
    zofka.turnRight(120);
    zofka.penDown();
    zofka.move(20);
  }
}

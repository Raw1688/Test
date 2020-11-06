package com.xb.parttern.factory;

public class DrinkFactory {
  public static final int SPRITE = 1;
  public static final int COCO = 2;
  public static final int SIX_BOOM = 3;

  public static Drink makeDrink(int type) {
    if (type == SPRITE) {
      return new Sprite();
    } else if (type == COCO) {
      return new Coco();
    } else if (type == SIX_BOOM) {
      return new SixBoom();
    } else {
      return null;
    }
  }
}

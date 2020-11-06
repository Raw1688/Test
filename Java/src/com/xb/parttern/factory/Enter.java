package com.xb.parttern.factory;

public class Enter {
  public static void main(String[] args) {
    Drink drink = DrinkFactory.makeDrink(DrinkFactory.SPRITE);
    drink.taste();
    Drink drink1 = DrinkFactory.makeDrink(DrinkFactory.COCO);
    drink1.taste();
    Drink drink2 = DrinkFactory.makeDrink(DrinkFactory.SIX_BOOM);
    drink2.taste();
  }
}

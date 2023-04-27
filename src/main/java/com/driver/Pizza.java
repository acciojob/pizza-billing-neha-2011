package com.driver;

public class Pizza {

    public int cheesePrice;
    public int basePrice;
    public int toppingPrice;
    public int paperBagPrice;
    public int totalPrice;
    public String bill;
    boolean isCheeseAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;
    boolean isToppingsAdded;


    public Pizza(Boolean isVeg){
        if(isVeg){basePrice  = 300;
            toppingPrice = 70;

        }
        else{
            basePrice = 400;
            toppingPrice = 120;
        }
      paperBagPrice = 20;
        cheesePrice = 80;

        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        totalPrice = basePrice;
        bill = "Base price of the Pizza :" + "basePrice + \n";


    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            totalPrice = totalPrice + toppingPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false){
            totalPrice = totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
       if(isBillGenerated == false) {
           if (isCheeseAdded == true) {
               bill = bill + "Extra Cheese Added :  " + cheesePrice + "\n";
           }
           if (isToppingsAdded == true){
       }
           if(isPaperBagAdded == true){
               bill = bill + "Paperbag Added :" + paperBagPrice + "\n";
           }
           bill = bill  + "Total Price :" + totalPrice + "\n";
           isBillGenerated = true;
       }
       return bill;
    }
}

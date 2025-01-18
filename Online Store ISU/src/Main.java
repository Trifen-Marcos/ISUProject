import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int quantity = 0;
        int paymentdue = 0;
        int iphonecount = 0;
        int macbookcount = 0;
        int ipadcount = 0;
        int harrypottercount = 0;
        int lordoftheringscount = 0;
        int catcherintheryecount = 0;
        int chesscount = 0;
        int monopolycount = 0;
        int riskcount = 0;


        System.out.println("Welcome to your online shopping experience");

        //Choosing what category you would like to purchase from
        while (true) {
            System.out.println("Please choose from one of the following options:");
            System.out.println("Type 1 to shop for electronics, Type 2 to shop for books and Type 3 to shop for games");
            int typeofshop = sc.nextInt();
            if (typeofshop == 1) {
                //Getting a list of products to choose from
                int Iphone16 = (int) (Math.random() * (100 - 45 + 1) + 45);
                int IpadPro = (int) (Math.random() * (100 - 45 + 1) + 45);
                int Macbook = (int) (Math.random() * (100 - 45 + 1) + 45);


                System.out.println("Type 1 to shop for an Iphone 16 , 2 to shop for an IPad Pro and 3 to shop for a Macbook and type 4 to go back to the previous menu");
                int product = sc.nextInt();
                //Shopping for product number one

                if (product == 1) {

                    System.out.println("You have chosen to shop for an Iphone 16 the stock of this product is " + Iphone16 + " The price for this product is 1000 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();

                    paymentdue = (1000 * quantity);
                    while (quantity > Iphone16) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= Iphone16) {
                            iphonecount = iphonecount + quantity;
                            paymentdue = (1000 * quantity);
                            System.out.println("You cart contains " + iphonecount + " this will cost you " + paymentdue + " Please type 1 to pay your order if you would like to remove an item from your cart type 2");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                iphonecount = iphonecount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 1000 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " iphones for a total cost of " + paymentdue + " dollars please type one to pay");
                                paid = sc.nextInt();
                            }



                                if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 2 to continue shopping");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;


                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {

                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {

                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {

                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {

                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {

                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {

                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {

                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {

                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);

                                        if (order == 0) {
                                            System.out.println("thank you for shopping with us today");

                                        }


                                    }
                                }
                            }


                        }
                    }
                }

                // Shopping for Product number two
                else if (product == 2) {
                    System.out.println("You have chosen to shop for an Ipad Pro the stock of this product is " + IpadPro + " The price for this product is 500 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();
                    paymentdue = paymentdue + (500 * quantity);
                    while (quantity > IpadPro) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= IpadPro) {
                            ipadcount = ipadcount + quantity;
                            paymentdue = (500 * quantity);
                            System.out.println("You cart contains " + ipadcount + " this will cost you " + paymentdue + "Type one to pay or two if you would like to remove something from your cart" );
                             int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                ipadcount = ipadcount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 500 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + " dollars please type one to pay");
                                paid = sc.nextInt();
                            }
                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;
                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {
                                            macbookcount = 0;
                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {
                                            ipadcount = 0;
                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {
                                            harrypottercount = 0;
                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {
                                            lordoftheringscount = 0;
                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {
                                            catcherintheryecount = 0;
                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {
                                            chesscount = 0;
                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {
                                            monopolycount = 0;
                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {
                                            riskcount = 0;
                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);
                                    }
                                    if (order == 0) {
                                        System.out.println("thank you for shopping with us today");
                                    }
                                }
                            }
                        }
                    }
                }


                // Shopping for product number three
                 else if (product == 3) {
                    System.out.println("You have chosen to shop for a Macbook the stock of this product is " + Macbook + " The price for this product is 2000 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu..");
                    quantity = sc.nextInt();
                    paymentdue = paymentdue + (2000 * quantity);
                    while (quantity > Macbook) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= Macbook) {
                            paymentdue = (2000 * quantity);
                            macbookcount = macbookcount + quantity;
                            System.out.println("You cart contains " + macbookcount + " this will cost you " + paymentdue + "Type one to pay and two to remove items from your cart");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                macbookcount = macbookcount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 2000 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " macbooks for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }
                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;
                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {
                                            macbookcount = 0;
                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {
                                            ipadcount = 0;
                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {
                                            harrypottercount = 0;
                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {
                                            lordoftheringscount = 0;
                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {
                                            catcherintheryecount = 0;
                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {
                                            chesscount = 0;
                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {
                                            monopolycount = 0;
                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {
                                            riskcount = 0;
                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);


                                    }
                                }
                            }
                        }

                    }
                }
                else if (product == 4 || quantity == 0) {
                    return;}
            } else if (typeofshop == 2) {
                int HarryPotter = (int) (Math.random() * (100 - 45 + 1) + 45);
                int LordofTherings = (int) (Math.random() * (100 - 45 + 1) + 45);
                int Catcherintherye = (int) (Math.random() * (100 - 45 + 1) + 45);
                System.out.println("Type 1 to shop for a copy of Harry Potter , 2 to shop for a copy of Lord of The Rings and 3 to shop for a copy of Catcher in The Rye and type 4 to go back to the main menu.");
                int product = sc.nextInt();

                //Shopping for product number one

                if (product == 1) {

                    System.out.println("You have chosen to shop for a copy of Harry Potter the stock of this product is " + HarryPotter + " The price for this product is 10 dollars type 0 to go back to the previous menu");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();

                    paymentdue = (10 * quantity);
                    while (quantity > HarryPotter) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= HarryPotter) {
                            iphonecount = harrypottercount + quantity;
                            paymentdue = (10 * quantity);
                            System.out.println("You cart contains " + harrypottercount + " this will cost you " + paymentdue + " Please type 1 to pay your order if you would like to remove an item from your cart type 2");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                harrypottercount = harrypottercount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 10 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }

                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;


                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {

                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {

                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {

                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {

                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {

                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {

                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {

                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {

                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);

                                        if (order == 0) {
                                            System.out.println("thank you for shopping with us today");

                                        }


                                    }
                                }
                            }


                        }
                    }
                }

                // Shopping for Product number two
                else if (product == 2) {
                    System.out.println("You have chosen to shop for a copy of Lord of The Rings the stock of this product is " + LordofTherings + " The price for this product is 50 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();
                    paymentdue = paymentdue + (50 * LordofTherings);
                    while (quantity > LordofTherings) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= LordofTherings) {
                            lordoftheringscount = lordoftheringscount + quantity;
                            paymentdue = (50 * quantity);
                            System.out.println("You cart contains " + lordoftheringscount + " this will cost you " + paymentdue + " Type 1 to pay and type 2 to remove something from your cart");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                harrypottercount = harrypottercount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 50 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }
                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;
                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {
                                            macbookcount = 0;
                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {
                                            ipadcount = 0;
                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {
                                            harrypottercount = 0;
                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {
                                            lordoftheringscount = 0;
                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {
                                            catcherintheryecount = 0;
                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {
                                            chesscount = 0;
                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {
                                            monopolycount = 0;
                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {
                                            riskcount = 0;
                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);
                                    }
                                    if (order == 0) {
                                        System.out.println("thank you for shopping with us today");
                                    }
                                }
                            }
                        }
                    }
                }


                // Shopping for product number three
                if (product == 3) {
                    System.out.println("You have chosen to shop for a copy of Catcher in The Rye the stock of this product is " + Catcherintherye + " The price for this product is 20 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();
                    paymentdue = paymentdue + (20 * quantity);
                    while (quantity > Catcherintherye) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= Catcherintherye) {
                            paymentdue = (20 * quantity);
                            catcherintheryecount = catcherintheryecount + quantity;
                            System.out.println("You cart contains " + catcherintheryecount + " this will cost you " + paymentdue + "Please type 1 to pay and type 2 to remove something from your cart");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                harrypottercount = harrypottercount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 20 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }
                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;
                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {
                                            macbookcount = 0;
                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {
                                            ipadcount = 0;
                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {
                                            harrypottercount = 0;
                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {
                                            lordoftheringscount = 0;
                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {
                                            catcherintheryecount = 0;
                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {
                                            chesscount = 0;
                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {
                                            monopolycount = 0;
                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {
                                            riskcount = 0;
                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);
                                    }
                                    if (order == 0) {
                                        System.out.println("thank you for shopping with us today");
                                    } else if (product == 4) {
                                        return;
                                    }
                                }
                            }
                        }
                        else if (product == 4 || quantity == 0) {
                            return;}
                    }
                }
            } else if (typeofshop == 3) {
                int RISK = (int) (Math.random() * (100 - 45 + 1) + 45);
                int CHESS = (int) (Math.random() * (100 - 45 + 1) + 45);
                int Monopoly = (int) (Math.random() * (100 - 45 + 1) + 45);
                System.out.println("Type 1 to shop for a copy of RISK , 2 to shop for a Chess Set and 3 to shop for a copy of Monopoly and type 4 to go back to the main menu.");
                int product = sc.nextInt();



                //Shopping for product number one

                if (product == 1) {

                    System.out.println("You have chosen to shop for a copy of RISK the stock of this product is " + RISK + " The price for this product is 45 dollars type 0 to go back to the previous menu");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();

                    paymentdue = (45 * quantity);
                    while (quantity > RISK) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= RISK) {
                            riskcount = riskcount + quantity;
                            paymentdue = (1000 * quantity);
                            System.out.println("You cart contains " + riskcount + " this will cost you " + paymentdue + " Please type 1 to pay your order if you would like to remove an item from your cart type 2");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                harrypottercount = harrypottercount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 45 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }

                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;


                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {

                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {

                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {

                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {

                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {

                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {

                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {

                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {

                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);

                                        if (order == 0) {
                                            System.out.println("thank you for shopping with us today");

                                        }


                                    }
                                }
                            }


                        }
                    }
                }

                // Shopping for Product number two
                else if (product == 2) {
                    System.out.println("You have chosen to shop for a chess set the stock of this product is " + CHESS + " The price for this product is 50 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu..");
                    quantity = sc.nextInt();
                    paymentdue = paymentdue + (50 * CHESS);
                    while (quantity > CHESS) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= CHESS) {
                            chesscount = CHESS + quantity;
                            paymentdue = (50 * quantity);
                            System.out.println("You cart contains " + chesscount + " this will cost you " + paymentdue + "type 1 to pay and type two to remove items from your cart");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                harrypottercount = harrypottercount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 50 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }
                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;
                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {
                                            macbookcount = 0;
                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {
                                            ipadcount = 0;
                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {
                                            harrypottercount = 0;
                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {
                                            lordoftheringscount = 0;
                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {
                                            catcherintheryecount = 0;
                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {
                                            chesscount = 0;
                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {
                                            monopolycount = 0;
                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {
                                            riskcount = 0;
                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);
                                    }
                                    if (order == 0) {
                                        System.out.println("thank you for shopping with us today");
                                    }
                                }
                            }
                        }
                    }
                }


                // Shopping for product number three
                if (product == 3) {
                    System.out.println("You have chosen to shop for a copy of Monopoly the stock of this product is " + Monopoly + " The price for this product is 20 dollars");
                    System.out.println("Please type the quantity of this product you wish to order and type 0 to go back to the main menu.");
                    quantity = sc.nextInt();
                    paymentdue = paymentdue + (20 * quantity);
                    while (quantity > Monopoly) {
                        System.out.println("The requested amount is larger then the stock please enter a different quantity ");
                        quantity = sc.nextInt();
                        if (quantity <= Monopoly) {
                            paymentdue = (20 * quantity);
                            monopolycount = monopolycount + quantity;
                            System.out.println("You cart contains " + monopolycount + " this will cost you " + paymentdue + "type 1 to pay for your cart and type 2 remove an item from your cart");
                            int paid = sc.nextInt();
                            if (paid == 2) {
                                System.out.println("You would like to remove some of this item from your cart please type how much you would like to remove");
                                int removefromcart = sc.nextInt();
                                harrypottercount = harrypottercount - removefromcart;
                                quantity = quantity - removefromcart;
                                paymentdue = 20 * quantity;
                                System.out.println(" Your cart now consists of " + quantity + " ipads for a total cost of " + paymentdue + "dollars please type one to pay");
                                paid = sc.nextInt();
                            }
                            if (paid == 1) {
                                System.out.println("Thank you for shopping with us type 1 to access the administrator features or 4 to back to the menu");
                                typeofshop = sc.nextInt();
                                if (typeofshop == 1) {
                                    System.out.println("You are an administrator please enter your password (Hint: 12345)");
                                    int passcode = sc.nextInt();
                                    while (passcode != 12345) {
                                        System.out.println("Please renter your password");
                                        passcode = sc.nextInt();
                                    }
                                    System.out.println("These are your unfilled orders:");
                                    System.out.println("Order 1 " + iphonecount);
                                    System.out.println("Order 2 " + macbookcount);
                                    System.out.println("Order 3 " + ipadcount);
                                    System.out.println("Order 4 " + harrypottercount);
                                    System.out.println("Order 5 " + lordoftheringscount);
                                    System.out.println("Order 6 " + catcherintheryecount);
                                    System.out.println("Order 7 " + chesscount);
                                    System.out.println("Order 8 " + monopolycount);
                                    System.out.println("Order 9 " + riskcount);
                                    System.out.println("Type the order number to mark as finished type 0 to stop shipping orders.");
                                    int order = sc.nextInt();
                                    boolean iphoneorders = false;
                                    boolean macbookorders = false;
                                    boolean ipadorders = false;
                                    boolean harrypotterorders = false;
                                    boolean lordoftheringsorders = false;
                                    boolean catcherintheryeorders = false;
                                    boolean chessorders = false;
                                    boolean monopolyorders = false;
                                    boolean riskorders = false;

                                    while (order != 0) {
                                        if (order == 1) {
                                            iphoneorders = true;
                                            iphonecount = 0;
                                            System.out.println("You  have shipped all Iphones please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 2) {
                                            macbookcount = 0;
                                            macbookorders = true;
                                            System.out.println("You have shipped all Macbooks please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 3) {
                                            ipadcount = 0;
                                            ipadorders = true;
                                            System.out.println("You have shipped all IPads please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 4) {
                                            harrypottercount = 0;
                                            harrypotterorders = true;
                                            System.out.println("You have shipped all copies of Harry Potter please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 5) {
                                            lordoftheringscount = 0;
                                            lordoftheringsorders = true;
                                            System.out.println("You have shipped all copies of Lord of The Rings please type the next order you would like to ship");
                                            order = sc.nextInt();

                                        } else if (order == 6) {
                                            catcherintheryecount = 0;
                                            catcherintheryeorders = true;
                                            System.out.println("You have shipped all copies of Catcher In the Rye please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 7) {
                                            chesscount = 0;
                                            chessorders = true;
                                            System.out.println("You have shipped all sets of Chess please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 8) {
                                            monopolycount = 0;
                                            monopolyorders = true;
                                            System.out.println("You have shipped all sets of Monopoly please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        } else if (order == 9) {
                                            riskcount = 0;
                                            riskorders = true;
                                            System.out.println("You have shipped all sets of Risk please type the next order you would like to ship");
                                            order = sc.nextInt();
                                        }
                                        System.out.println("Order 1 Iphones " + iphonecount);
                                        System.out.println("Order 2 Macbooks " + macbookcount);
                                        System.out.println("Order 3  Ipads " + ipadcount);
                                        System.out.println("Order 4 Harry Potter" + harrypottercount);
                                        System.out.println("Order 5 Lord of the rings " + lordoftheringscount);
                                        System.out.println("Order 6 Catcher in the rye" + catcherintheryecount);
                                        System.out.println("Order 7 Chess " + chesscount);
                                        System.out.println("Order 8 Monopoly " + monopolycount);
                                        System.out.println("Order 9 Risk " + riskcount);
                                    }
                                    if (order == 0) {
                                        System.out.println("thank you for shopping with us today");
                                    } else if (product == 4) {
                                        return;
                                    }
                                    if (typeofshop < 3){
                                        System.out.println("Invalid output enter again");
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }


            }


        }
    }
}





























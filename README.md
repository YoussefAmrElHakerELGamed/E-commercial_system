it's a college first year project, a E-commercial system for like a super market 

it's composed of 8 classes and main class

Product class: a base class for all other products having the basic parameters for a product 
      like the product id, product name and product price and having all setters and getters ready for use
      
  inherited from it >>
  
  > BookProduct class: a Book product class from the name having the related parameters for a book.
    like the book author and publisher. as usual there are setters and getters for all parameters in that class.
  
  > ClothingProduct class: inherited from the Product class and having the cloth size and fabric material. the setters and getters are there as well.
  
  > ElectronicProduct class: inherited from Product as well, having the electronic device brand and warranty period as a parameters, and with no doubt there are setter and getter for your convenient.

"any super market needs a cart"
for this fact the project has a Cart Class.
            >Cart class: having cart parameters cart id, the number of product in it and the product in it, having a more complex composition from the previous classes adding              >>addProduct and removeProduct methods for editing the products list and calculate price method for -you guessed it🥳- calculating the total price and finally the               >>>place order method for completing the purchase process. there are setters and getters (as a matter of fact, i don't know why a keep telling you that untill now 🙂)

"any business need someone to buy his merchandise 💵💵"
for this we need a customer.
>Customer class: having the parameters of any normal human being id, name and address.

"the time for the order"
here the order class comes into place.
>Order class: having customer id , products list and the total price parameters, having a special method print order info that is, for printing the final receipt.



here it comes the MAIN Class for all the hard work
      first, we make a new cart , customer and there products that is a book product
      , a clothing product and a electronic product.
      after that, we follow with printing the program tital and setting the cart and customer parameters in a separate method each.
      printing the main Manu to select what product to purchase.
      in the end we confirm the user to purchase or not if yes we print the order and author wise exiting after greating the user.

and in the end that was a quick look at this simple program and think you for your time. 🤝
                                                                                                                                                            --Youssef Amr--

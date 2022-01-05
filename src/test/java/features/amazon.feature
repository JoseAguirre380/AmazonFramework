Feature: Amazon Test
    General test for amazon web page


    Scenario: Validate total amount of price for Notebook
       Given Go to https://www.amazon.com/
       Then Validate all menu items are present (the ones in black with black backgorund)
       And Go to All
       And Go to Best sellers
       When Print all Elements in the left menu
       And Go to the search box
       And Search for notebook 34
       When Print the price for the 3 first elements listed
       When Store the price of the first one
       And Click on the first one to go to the details page
       Then Once in the details page, validate both prices are the same
       And Click Add To Cart
       Then Verify all 3 price amounts are the same
       And Go to the cart
       Then On the number of items dropdown select 20 and validate the Total amount is Unit Price * 20 and cost after savings is correct




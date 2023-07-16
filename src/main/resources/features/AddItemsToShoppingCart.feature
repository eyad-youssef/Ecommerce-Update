@smoke
  Feature: add items to the shopping cart
    Scenario: user could add different products to Shopping cart
      Given user has logged in
      When user chooses a product
      And  user adds to cart
      And user adds product details
      Then user finalises adding product

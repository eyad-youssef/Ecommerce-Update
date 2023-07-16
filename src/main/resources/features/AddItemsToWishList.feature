@smoke
  Feature: add items to wishlist
    Scenario: user could add different products to Wishlist
      Given user has loggedin
      When user choose a product
      And  user adds to wishlist
      And user add product details
      Then user finalises adding product to wishlist
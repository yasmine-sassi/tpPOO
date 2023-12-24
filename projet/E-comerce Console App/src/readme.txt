The UserService manages user authentication by comparing provided credentials w
ith stored user data. It controls user access to the system based on roles.

The Product class acts as an abstract base class for different 
product categories (MakeupProduct, HouseProduct, ElectronicProduct)

ProductService class provides functionalities for managing the inventory, including 
adding, updating, deleting, and filtering products based on categories and price ranges.

The ShoppingCart class manages a user's cart, allowing the addition, updating, 
and removal of items.

The Order class handles creating and displaying orders, calculating the total amount, 
and facilitating the checkout process.

the additional feature chosen:
-discount:a list of discount code that can be applied to take 10% off
-prizes to users that purchased an amount greater than 200

my testing class:
The code starts by authenticating users based on provided usernames and 
passwords using the UserService.
After authentication, the application displays different menus based 
on the user's role (admin or customer).
The showAdminMenu and showCustomerMenu functions facilitate interactions 
based on the user's role.
Admins can manage products (add, update, delete), while customers can 
view/search/filter products, manage their cart, place orders, and proceed with checkout.


regarding the OOP implementation:
the project contains Encapsulation/Inheritance/Polymorphism/Composition
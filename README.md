# homeFactory
This repository should contain the java sourcecode of the project work which is prepared for a university course about design patterns. homeFactory is an imaginary ordering system which belongs to an imaginary business (operations strictly in home office) where customers can order a variety of products e.g. 3d printed objects, mugs and t-shirts.

## Patterns to implement
A lot of design patterns are involved in the project in order to create maintainable and neat software architecture. These design patterns are Command Pattern, Simple Factory Pattern, Template Method Pattern and Decorator Pattern.

Customers will design their object and issue an order (ModelOrder or MugOrder) and the operator (Invoker) delivers these orders to the  production department (Receiver). The production department works with ModelFactory for 3d models and with MugFactory for mug printing. To do this, the producer uses makeModel() and makeMug() methods (Simple Factory Pattern).

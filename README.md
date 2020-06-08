# homeFactory
This repository should contain the java sourcecode of the project work which is prepared for a university course about design patterns. homeFactory is an imaginary ordering system which belongs to an imaginary business (operations strictly in home office) where customers can order a variety of products e.g. mugs and t-shirts.

## Patterns to implement
A lot of design patterns are involved in the project in order to create maintainable and neat software architecture. These design patterns are Command Pattern, Simple Factory Pattern and Decorator Pattern.

Customers will design their object and submit an order (MugOrder) and the assistant (Invoker) delivers these orders to the  maker (Receiver). The production department works with MugFactory for mug printing. To do this, the producer uses makeMug() methods (Simple Factory Pattern).

Special features e.g. screenprinting or inkjetprinting can be added. This functionality will be provided by the Decorator Pattern.


## Xacml Camel project. ##

this project aims to adapt Camel DSEL semantics to the XACML 3.0 JAXP object model 

#### todo: ####

- [x] map a policyType XML declaration as a Context to start/stop and route requests to.
- [x] map a TargetType XML Declaration as a Route.
- [x] map a RuleType XML declaration to a Context or Component (thin slice done).
- [x] map sequences of AnyOf XML declaration to a series of predicates joined with OR (in policyviz).
- [x] map sequences AllOf XML declaration to a series of predicates joined with AND (in policyviz).
- [x] fashion a blackboard system of variable state scoping with spring-util map
- [x] design route abstractions to accommodate Apply,Function,Expression,ObligationExpression,etc. elements (thin slice done)
- [x] Comprehensive Xacml Bindings
- [ ] Comprehensive Xacml Function Implementations -- trivially implemented as new features need coverage


A Simple XACML Rule (visualized):
![alt text](https://cloud.githubusercontent.com/assets/73514/5986262/c5e29686-a8a6-11e4-82ba-741a98c41ce5.png "Simple Example")

A More complex Permission hierarchy:
![alt text](https://cloud.githubusercontent.com/assets/73514/6047457/ae3c3616-ac5e-11e4-93c5-fe912bfb6156.png "Complex XACML Rules")

 

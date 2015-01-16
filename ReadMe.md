
## Xacml Camel project. ##

this project aims to adapt Camel DSEL semantics to the XACML 3.0 JAXP object model 

#### todo: ####

 [ ] map a policyType XML declaration as a Context to start/stop and route requests to.

 [ ] map a TargetType XML Declaration as a Route.

 [ ] map a RuleType XML declaration to a Context or Component, unsure at this time.

 [ ] map sequences of AnyOf XML declaration to a series of predicates joined with OR.

 [ ] map sequences AllOf XML declaration to a series of predicates joined with AND.

 [ ] figure out how to fashion a blackboard system of variable state scoping and reference for  Variable*,Attribute*,etc. elements

 [ ] design route abstractions to accommodate Apply,Function,Expression,ObligationExpression,etc. elements

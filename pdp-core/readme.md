
pdp goals:

1. parse policy (PolicyType or PolicyDefType)
1. define camel routing graph for each scoped attribute
1. parse external context definition providing additional beans identified by policy inference (PIPs)
1. for each routed request:
    new instantiate camel context to receive the values defined in policy from request
    route to decision-combiner
    wrap result as Response jaxp proxy
1.  

/**
 *
 * if {@link specified.XacmlFunctionProto} enum elements compose a .h file, then this package provides .cxx for the
 * compiler to bind functions to those function prototypes.
 *
 * the first time a {@link specified.XacmlFunctionProto} is called and executes {@link specified.XacmlFunctionProto#apply}, the registration of that element iterates this package for the first matching {@link specified.BindXacmlFunctions} or {@link specified.BindUri} element to provide apply()
 */
package specified.impl;
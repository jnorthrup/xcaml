/*
 * MIT License
 * 
 * Copyright (c) 2014 Klemm Software Consulting, Mirko Klemm
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.kscs.util.jaxb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author mirko 2014-04-02
 */
@SuppressWarnings("unchecked")
public final class BuilderUtilities {
  public static <T> T getBuilder(final Class<T> declaredBuilderType, final Object instance,
      final Object... args) {
    for (final Class<?> innerClass : instance.getClass().getDeclaredClasses()) {
      if ("Builder".equals(innerClass.getSimpleName())) {
        for (final Constructor<?> constructor : innerClass.getConstructors()) {
          if (constructor.getParameterTypes().length == args.length) {
            try {
              return (T) constructor.newInstance(args);
            } catch (final InstantiationException e) {
              throw new RuntimeException(e);
            } catch (final IllegalAccessException e) {
              throw new RuntimeException(e);
            } catch (final InvocationTargetException e) {
              throw new RuntimeException(e);
            }
          }
        }
      }
    }
    return null;
  }

}

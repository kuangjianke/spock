/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spockframework.mock;

import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

/**
 * A ...
 *
 * @author Peter Niederwieser
 */
public class EqualArgumentConstraint implements IArgumentConstraint {
  private final Object arg;

  public EqualArgumentConstraint(Object arg) {
    this.arg = arg;
  }

  public boolean isSatisfiedBy(Object arg) {
    return DefaultTypeTransformation.compareEqual(this.arg, arg);
  }
}
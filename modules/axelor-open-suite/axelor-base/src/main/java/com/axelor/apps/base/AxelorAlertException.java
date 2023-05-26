/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2005-2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.axelor.apps.base;

import com.axelor.db.Model;

public class AxelorAlertException extends AxelorException {

  private static final long serialVersionUID = 1L;

  public AxelorAlertException(int category, String message, Object... messageArgs) {
    super(category, message, messageArgs);
  }

  public AxelorAlertException(int category, String message) {
    super(category, message);
  }

  public AxelorAlertException(Throwable cause, int category) {
    super(cause, category);
  }

  public AxelorAlertException(
      Throwable cause, int category, String message, Object... messageArgs) {
    super(cause, category, message, messageArgs);
  }

  public AxelorAlertException(Throwable cause, int category, String message) {
    super(cause, category, message);
  }

  public AxelorAlertException(
      Class<? extends Model> refClass, int category, String message, Object... messageArgs) {
    super(refClass, category, message, messageArgs);
  }

  public AxelorAlertException(Class<? extends Model> refClass, int category, String message) {
    super(refClass, category, message);
  }

  public AxelorAlertException(Throwable cause, Class<? extends Model> refClass, int category) {
    super(cause, refClass, category);
  }

  public AxelorAlertException(
      Throwable cause,
      Class<? extends Model> refClass,
      int category,
      String message,
      Object... messageArgs) {
    super(cause, refClass, category, message, messageArgs);
  }

  public AxelorAlertException(
      Throwable cause, Class<? extends Model> refClass, int category, String message) {
    super(cause, refClass, category, message);
  }

  public AxelorAlertException(Model ref, int category, String message, Object... messageArgs) {
    super(ref, category, message, messageArgs);
  }

  public AxelorAlertException(Model ref, int category, String message) {
    super(ref, category, message);
  }

  public AxelorAlertException(Throwable cause, Model ref, int category) {
    super(cause, ref, category);
  }

  public AxelorAlertException(
      Throwable cause, Model ref, int category, String message, Object... messageArgs) {
    super(cause, ref, category, message, messageArgs);
  }

  public AxelorAlertException(Throwable cause, Model ref, int category, String message) {
    super(cause, ref, category, message);
  }
}

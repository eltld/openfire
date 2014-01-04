/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.plaso.thrift.gen;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TUSerRole implements org.apache.thrift.TEnum {
  SUPER_ADMIN(0),
  TEACHER_ALL(1),
  TEACHER_ADD_EXERCISE(2),
  TEACHER_CLASS_ONLY(3);

  private final int value;

  private TUSerRole(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TUSerRole findByValue(int value) { 
    switch (value) {
      case 0:
        return SUPER_ADMIN;
      case 1:
        return TEACHER_ALL;
      case 2:
        return TEACHER_ADD_EXERCISE;
      case 3:
        return TEACHER_CLASS_ONLY;
      default:
        return null;
    }
  }
}

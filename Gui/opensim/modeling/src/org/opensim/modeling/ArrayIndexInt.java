/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Specialization of ArrayIndexTraits for (signed) <code>int</code> used as an index. *
 */
public class ArrayIndexInt {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayIndexInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayIndexInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ArrayIndexInt obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_ArrayIndexInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int max_size() {
    return opensimSimbodyJNI.ArrayIndexInt_max_size();
  }

  public ArrayIndexInt() {
    this(opensimSimbodyJNI.new_ArrayIndexInt(), true);
  }

}

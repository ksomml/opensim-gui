/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a special type used for forcing invocation of a particularly<br>
 * dangerous constructor or method overload; don't use this unless you are an<br>
 * advanced user and know exactly what you're getting into. *
 */
public class TrustMe {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public TrustMe(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(TrustMe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(TrustMe obj) {
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
        opensimSimbodyJNI.delete_TrustMe(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TrustMe() {
    this(opensimSimbodyJNI.new_TrustMe(), true);
  }

}

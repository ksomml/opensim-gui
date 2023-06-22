/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class is identical to a RowVector_; it is used only to manage the C++ <br>
 *  rules for when copy constructors are called by introducing a separate type to<br>
 *  prevent certain allowed optimizations from occuring when we don't want them.<br>
 *  Despite the name, this may be an owner if a RowVector_ is recast to a <br>
 *  RowVectorView_. However, there are no owner constructors for RowVectorView_. 
 */
public class RowVectorViewVec6 extends RowVectorBaseVec6 {
  private transient long swigCPtr;

  public RowVectorViewVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorViewVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorViewVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(RowVectorViewVec6 obj) {
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
        opensimSimbodyJNI.delete_RowVectorViewVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVectorViewVec6(RowVectorViewVec6 r) {
    this(opensimSimbodyJNI.new_RowVectorViewVec6(RowVectorViewVec6.getCPtr(r), r), true);
  }

}

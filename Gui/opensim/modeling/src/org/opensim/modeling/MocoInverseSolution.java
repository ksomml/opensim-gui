/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class holds the solution from MocoInverse. 
 */
public class MocoInverseSolution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public MocoInverseSolution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoInverseSolution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoInverseSolution obj) {
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
        opensimMocoJNI.delete_MocoInverseSolution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MocoSolution getMocoSolution() {
    return new MocoSolution(opensimMocoJNI.MocoInverseSolution_getMocoSolution(swigCPtr, this), false);
  }

  public TimeSeriesTable getOutputs() {
    return new TimeSeriesTable(opensimMocoJNI.MocoInverseSolution_getOutputs(swigCPtr, this), true);
  }

  public MocoInverseSolution() {
    this(opensimMocoJNI.new_MocoInverseSolution(), true);
  }

}

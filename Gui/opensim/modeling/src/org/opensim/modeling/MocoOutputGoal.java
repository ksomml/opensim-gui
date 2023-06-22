/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This goal allows you to use model Outputs of type double, SimTK::Vec3, and<br>
 * SimTK::SpatialVec in the integrand of a goal. By default, when using vector type<br>
 * Outputs, the norm of the vector is minimized, but you can also minimize a<br>
 * specific element of a vector Output via `setOutputIndex()`. You can also specify<br>
 * the exponent of the value in the integrand via `setExponent()`.<br>
 * <br>
 * This goal supports both "Cost" (default) and "EndpointConstraint" modes. In<br>
 * "EndpointConstraint" mode, the integral of the Output value is constrained<br>
 * between user-specified bounds. By default, these bounds constrain the integral to<br>
 * zero; use 'updConstraintInfo()' to set custom bounds.<br>
 * 
 */
public class MocoOutputGoal extends MocoOutputBase {
  private transient long swigCPtr;

  public MocoOutputGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoOutputGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoOutputGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoOutputGoal obj) {
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
        opensimMocoJNI.delete_MocoOutputGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoOutputGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoOutputGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoOutputGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoOutputGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoOutputGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoOutputGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoOutputGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoOutputGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoOutputGoal() {
    this(opensimMocoJNI.new_MocoOutputGoal__SWIG_0(), true);
  }

  public MocoOutputGoal(String name) {
    this(opensimMocoJNI.new_MocoOutputGoal__SWIG_1(name), true);
  }

  public MocoOutputGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoOutputGoal__SWIG_2(name, weight), true);
  }

  /**
   *  Set if the goal should be divided by the displacement of the system's<br>
   *     center of mass over the phase. 
   */
  public void setDivideByDisplacement(boolean tf) {
    opensimMocoJNI.MocoOutputGoal_setDivideByDisplacement(swigCPtr, this, tf);
  }

  public boolean getDivideByDisplacement() {
    return opensimMocoJNI.MocoOutputGoal_getDivideByDisplacement(swigCPtr, this);
  }

  /**
   *  Set if the goal should be divided by the total mass of the model. 
   */
  public void setDivideByMass(boolean tf) {
    opensimMocoJNI.MocoOutputGoal_setDivideByMass(swigCPtr, this, tf);
  }

  public boolean getDivideByMass() {
    return opensimMocoJNI.MocoOutputGoal_getDivideByMass(swigCPtr, this);
  }

}

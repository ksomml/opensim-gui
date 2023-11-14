/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Minimize the sum of the absolute value of the controls raised to a given<br>
 * exponent, integrated over the phase. The default weight for each control is<br>
 * 1.0; this can be changed by calling setWeight() or editing the<br>
 * `control_weights` property in XML.<br>
 * The exponent must be an integer greater than or equal to 2,<br>
 * and is 2 by default.<br>
 * If conducting a predictive simulation, you likely want to set<br>
 * `divide_by_displacement` to true; otherwise, this cost is minimized by not<br>
 * moving. Dividing by displacement leads to a quantity similar to cost of<br>
 * transport.<br>
 * <br>
 * This goal is computed as follows:<br>
 * <br>
 *  
\frac{1}{d} \int_{t_i}^{t_f} \sum_{c \in C} w_c |x_c(t)|^p ~dt
<br>
 * We use the following notation:<br>
 * -   d : displacement of the system, if `divide_by_displacement` is<br>
 *   true; 1 otherwise.<br>
 * -   C : the set of control signals.<br>
 * -   w_c : the weight for control   c .<br>
 * -   x_c(t) : control signal   c .<br>
 * -   p : the `exponent`.<br>
 * <br>
 * If `p &gt; 2`, we first take the absolute value of the control; this is to properly<br>
 * handle odd exponents.<br>
 * 
 */
public class MocoControlGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoControlGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoControlGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoControlGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoControlGoal obj) {
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
        opensimMocoJNI.delete_MocoControlGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoControlGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoControlGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoControlGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoControlGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoControlGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoControlGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoControlGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoControlGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoControlGoal() {
    this(opensimMocoJNI.new_MocoControlGoal__SWIG_0(), true);
  }

  public MocoControlGoal(String name) {
    this(opensimMocoJNI.new_MocoControlGoal__SWIG_1(name), true);
  }

  public MocoControlGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoControlGoal__SWIG_2(name, weight), true);
  }

  /**
   *  Set the weight to use for the term in the cost associated with<br>
   *  `controlName` (the name or path of the corresponding actuator). To<br>
   *  remove a control from the cost function, set its weight to 0. If a<br>
   *  weight is already set for the requested state, then the provided<br>
   *  weight replaces the previous weight. Only controls with non-zero weights<br>
   *  that are associated with actuators for which appliesForce is True are<br>
   *  included in the cost function. Weights set here take precedence over<br>
   *  weights specified with a regular expression.
   */
  public void setWeightForControl(String controlName, double weight) {
    opensimMocoJNI.MocoControlGoal_setWeightForControl(swigCPtr, this, controlName, weight);
  }

  /**
   *  Set weights for all controls whose entire path matches the provided<br>
   *  regular expression pattern.<br>
   *  Multiple pairs of patterns and weights can be provided by calling this<br>
   *  function multiple times.<br>
   *  If a control matches multiple patterns, the weight associated with the<br>
   *  last pattern is used.
   */
  public void setWeightForControlPattern(String pattern, double weight) {
    opensimMocoJNI.MocoControlGoal_setWeightForControlPattern(swigCPtr, this, pattern, weight);
  }

  /**
   *  Set the exponent on the control signals.
   */
  public void setExponent(int exponent) {
    opensimMocoJNI.MocoControlGoal_setExponent(swigCPtr, this, exponent);
  }

  public double getExponent() {
    return opensimMocoJNI.MocoControlGoal_getExponent(swigCPtr, this);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * An abstract class for representing a function.<br>
 * <br>
 * A function is a relation between independent variables and a dependent<br>
 * value such that for any particular set of independent variables there is<br>
 * only one unique dependent value.  Values of the function and its derivatives<br>
 * are obtained by calling the calcValue() method.  The curve may or may not<br>
 * be finite or differentiable; the calcValue() method returns values between<br>
 * -`SimTK::Infinity` and `SimTK::Infinity`, or it returns `SimTK::NaN`<br>
 * (not a number) if the curve is not defined.<br>
 * Currently, functions of up to 3 variables (x,y,z) are supported.<br>
 * <br>
 * @author Frank C. Anderson
 */
public class Function extends OpenSimObject {
  private transient long swigCPtr;

  public Function(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.Function_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Function obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Function obj) {
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
        opensimCommonJNI.delete_Function(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Function safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.Function_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Function(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.Function_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.Function_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.Function_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Function(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.Function_getConcreteClassName(swigCPtr, this);
  }

  public void init(Function aFunction) {
    opensimCommonJNI.Function_init(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  public static Function makeFunctionOfType(Function aFunction, String aNewTypeName) {
    long cPtr = opensimCommonJNI.Function_makeFunctionOfType(Function.getCPtr(aFunction), aFunction, aNewTypeName);
    return (cPtr == 0) ? null : new Function(cPtr, false);
  }

  /**
   * Calculate the value of this function at a particular point.<br>
   * <br>
   * @param x the Vector of input arguments.<br>
   *          its size must equal the value returned by getArgumentSize().
   */
  public double calcValue(Vector x) {
    return opensimCommonJNI.Function_calcValue(swigCPtr, this, Vector.getCPtr(x), x);
  }

  /**
   * Calculate a partial derivative of this function at a particular point.  Which derivative to take is specified<br>
   * by listing the input components with which to take it.  For example, if derivComponents=={0}, that indicates<br>
   * a first derivative with respective to component 0.  If derivComponents=={0, 0, 0}, that indicates a third<br>
   * derivative with respective to component 0.  If derivComponents=={4, 7}, that indicates a partial second derivative with<br>
   * respect to components 4 and 7.<br>
   * <br>
   * @param derivComponents  the input components with respect to which the derivative should be taken.  Its size must be<br>
   *                         less than or equal to the value returned by getMaxDerivativeOrder().<br>
   * @param x                the Vector of input arguments.  Its size must equal the value returned by getArgumentSize().
   */
  public double calcDerivative(StdVectorInt derivComponents, Vector x) {
    return opensimCommonJNI.Function_calcDerivative(swigCPtr, this, StdVectorInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  /**
   * Get the number of components expected in the input vector.
   */
  public int getArgumentSize() {
    return opensimCommonJNI.Function_getArgumentSize(swigCPtr, this);
  }

  /**
   * Get the maximum derivative order this Function object can calculate.
   */
  public int getMaxDerivativeOrder() {
    return opensimCommonJNI.Function_getMaxDerivativeOrder(swigCPtr, this);
  }

  /**
   * Return a SimTK::Function that can be used natively by the<br>
   * underlying SimTK::System and its elements.
   */
  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimCommonJNI.Function_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a muscle modeling utility class containing kinematic equations that<br>
 *     describe the deformation of muscle fibers as they change length using a<br>
 *     fixed-width-parallelogram pennation model. This pennation model makes<br>
 *     several assumptions:<br>
 *     <li>Fibers are straight, parallel, of equal length, and coplanar.<br>
 *</li>     <li>The area and height of the parallelogram remains constant.</li><br>
 * <br>
 *     The parallelogram maintains a constant area and height by shearing as the<br>
 *     muscle fibers change length, as shown in the figure below. The constant-area<br>
 *     assumption is intended to mimic the constant-volume property of<br>
 *     incompressible biological muscle. For details, please refer to Zajac (1989)<br>
 *     and Millard et al. (2013).<br>
 * <br>
 *     <br>
 * <br>
 *     <img src="fig_MuscleFixedWidthPennationModel.png"/><br>
 * <br>
 *     <b>Conditions</b><br>
 *     {@literal 
    optimalFiberLength > 0
    0 <= optimalPennationAngle < Pi/2
    0 <= maximumPennationAngle <= Pi/2
    }<br>
 * <br>
 *     <b>Default Parameter Values</b><br>
 *     {@literal 
    optimalFiberLength ....... 0.1
    optimalPennationAngle .... 0.0
    maximumPennationAngle .... acos(0.1) = 84.3 degrees
    }<br>
 * <br>
 *     <b>Example</b><br>
 *     {@code 
    double optFibLen = 0.1;
    double optPenAng = SimTK::Pi/4.0;
    double maxPenAng = acos(0.001);
    MuscleFixedWidthPennationModel fibKin = MuscleFixedWidthPennationModel(optFibLen, optPenAng, maxPenAng);
    }<br>
 * <br>
 *     Note that this object should be updated through the set methods provided.<br>
 *     These set methods will take care of rebuilding the object correctly. If you<br>
 *     modify the properties directly, the object will not be rebuilt, and upon<br>
 *     calling any function, an exception will be thrown because the object is<br>
 *     out-of-date with its properties.<br>
 * <br>
 *     <b>References</b><br>
 *     <li>Zajac, F.E. (1989) %Muscle and tendon: properties, models, scaling, and<br>
 *         application to biomechanics and motor control. Critical Reviews in<br>
 *         Biomedical Engineering 17(4):359--411.<br>
 *</li>     <li>Millard, M., Uchida, T., Seth, A., Delp, S.L. (2013) Flexing<br>
 *         computational muscle: modeling and simulation of musculotendon dynamics.<br>
 *         ASME Journal of Biomechanical Engineering 135(2):021005.<br>
 *         http://dx.doi.org/10.1115/1.4023390.</li><br>
 * <br>
 *     @author Matt Millard
 */
public class MuscleFixedWidthPennationModel extends ModelComponent {
  private transient long swigCPtr;

  public MuscleFixedWidthPennationModel(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MuscleFixedWidthPennationModel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleFixedWidthPennationModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MuscleFixedWidthPennationModel obj) {
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
        opensimSimulationJNI.delete_MuscleFixedWidthPennationModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleFixedWidthPennationModel safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MuscleFixedWidthPennationModel_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleFixedWidthPennationModel(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MuscleFixedWidthPennationModel_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleFixedWidthPennationModel(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_optimal_fiber_length(MuscleFixedWidthPennationModel source) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_copyProperty_optimal_fiber_length(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_optimal_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_fiber_length(int i, double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_optimal_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_fiber_length(double value) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_append_optimal_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_optimal_fiber_length(double initValue) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_constructProperty_optimal_fiber_length(swigCPtr, this, initValue);
  }

  public double get_optimal_fiber_length() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_optimal_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_fiber_length(double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_optimal_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_pennation_angle_at_optimal(MuscleFixedWidthPennationModel source) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_copyProperty_pennation_angle_at_optimal(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_pennation_angle_at_optimal(int i) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pennation_angle_at_optimal(int i, double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_pennation_angle_at_optimal(double value) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_append_pennation_angle_at_optimal(swigCPtr, this, value);
  }

  public void constructProperty_pennation_angle_at_optimal(double initValue) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_constructProperty_pennation_angle_at_optimal(swigCPtr, this, initValue);
  }

  public double get_pennation_angle_at_optimal() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_pennation_angle_at_optimal__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_pennation_angle_at_optimal__SWIG_1(swigCPtr, this), false);
  }

  public void set_pennation_angle_at_optimal(double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_pennation_angle_at_optimal__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_maximum_pennation_angle(MuscleFixedWidthPennationModel source) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_copyProperty_maximum_pennation_angle(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_maximum_pennation_angle(int i) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_maximum_pennation_angle__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maximum_pennation_angle(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_maximum_pennation_angle__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maximum_pennation_angle(int i, double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_maximum_pennation_angle__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maximum_pennation_angle(double value) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_append_maximum_pennation_angle(swigCPtr, this, value);
  }

  public void constructProperty_maximum_pennation_angle(double initValue) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_constructProperty_maximum_pennation_angle(swigCPtr, this, initValue);
  }

  public double get_maximum_pennation_angle() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_maximum_pennation_angle__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maximum_pennation_angle() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_maximum_pennation_angle__SWIG_1(swigCPtr, this), false);
  }

  public void set_maximum_pennation_angle(double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_maximum_pennation_angle__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  The default constructor creates a fixed-width-parallelogram pennation<br>
   *     model with the default property values. 
   */
  public MuscleFixedWidthPennationModel() {
    this(opensimSimulationJNI.new_MuscleFixedWidthPennationModel__SWIG_0(), true);
  }

  /**
   *  Creates a fixed-width-parallelogram pennation model using the provided<br>
   *     parameters. 
   */
  public MuscleFixedWidthPennationModel(double optimalFiberLength, double optimalPennationAngle, double maximumPennationAngle) {
    this(opensimSimulationJNI.new_MuscleFixedWidthPennationModel__SWIG_1(optimalFiberLength, optimalPennationAngle, maximumPennationAngle), true);
  }

  /**
   *  @return The height of the fixed-width parallelogram. 
   */
  public double getParallelogramHeight() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getParallelogramHeight(swigCPtr, this);
  }

  /**
   *  @return The minimum possible fiber length. 
   */
  public double getMinimumFiberLength() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getMinimumFiberLength(swigCPtr, this);
  }

  /**
   *  @return The minimum possible fiber length along the tendon. 
   */
  public double getMinimumFiberLengthAlongTendon() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getMinimumFiberLengthAlongTendon(swigCPtr, this);
  }

  /**
   *  Calculates the pennation angle (the orientation of the parallelogram)<br>
   *     given the fiber length. 
   */
  public double calcPennationAngle(double fiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcPennationAngle(swigCPtr, this, fiberLength);
  }

  /**
   *  Calculates the length of the tendon given the cosine of the pennation<br>
   *     angle, the length of the fiber, and the length of the entire musculotendon<br>
   *     actuator. 
   */
  public double calcTendonLength(double cosPennationAngle, double fiberLength, double muscleLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcTendonLength(swigCPtr, this, cosPennationAngle, fiberLength, muscleLength);
  }

  /**
   *  Calculates the length of the fiber projected onto the axis of the<br>
   *     tendon. 
   */
  public double calcFiberLengthAlongTendon(double fiberLength, double cosPennationAngle) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberLengthAlongTendon(swigCPtr, this, fiberLength, cosPennationAngle);
  }

  /**
   *  Calculates the angular velocity of the parallelogram (i.e., the time<br>
   *     derivative of the pennation angle.<br>
   *     @param tanPennationAngle<br>
   *         The tangent of the pennation angle.<br>
   *     @param fiberLength<br>
   *         The length of the fiber (m).<br>
   *     @param fiberVelocity<br>
   *         The lengthening velocity of the fiber (m/s).<br>
   *     @return <br>
   *         The angular velocity of the parallelogram (rad/s).
   */
  public double calcPennationAngularVelocity(double tanPennationAngle, double fiberLength, double fiberVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcPennationAngularVelocity(swigCPtr, this, tanPennationAngle, fiberLength, fiberVelocity);
  }

  /**
   *     @param cosPennationAngle<br>
   *         The cosine of the pennation angle.<br>
   *     @param sinPennationAngle<br>
   *         The sine of the pennation angle.<br>
   *     @param pennationAngularVelocity<br>
   *         The angular velocity of the parallelogram (rad/s).<br>
   *     @param fiberLength<br>
   *         The length of the fiber (m).<br>
   *     @param fiberVelocity<br>
   *         The lengthening velocity of the fiber (m/s).<br>
   *     @param muscleVelocity<br>
   *         The lengthening velocity of the muscle path (m/s).<br>
   *     @return <br>
   *         The lengthening velocity of the tendon (m/s).
   */
  public double calcTendonVelocity(double cosPennationAngle, double sinPennationAngle, double pennationAngularVelocity, double fiberLength, double fiberVelocity, double muscleVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcTendonVelocity(swigCPtr, this, cosPennationAngle, sinPennationAngle, pennationAngularVelocity, fiberLength, fiberVelocity, muscleVelocity);
  }

  /**
   *     @param fiberLength<br>
   *         The length of the fiber (m).<br>
   *     @param fiberVelocity<br>
   *         The lengthening velocity of the fiber (m/s).<br>
   *     @param sinPennationAngle<br>
   *         The sine of the pennation angle.<br>
   *     @param cosPennationAngle<br>
   *         The cosine of the pennation angle.<br>
   *     @param pennationAngularVelocity<br>
   *         The angular velocity of the parallelogram (rad/s).<br>
   *     @return <br>
   *         The lengthening velocity of the fiber projected onto the axis of the<br>
   *         tendon (m/s).
   */
  public double calcFiberVelocityAlongTendon(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberVelocityAlongTendon(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity);
  }

  /**
   *     @param fiberLength<br>
   *         The length of the fiber (m).<br>
   *     @param fiberVelocity<br>
   *         The lengthening velocity of the fiber (m/s).<br>
   *     @param fiberAcceleration<br>
   *         The lengthening acceleration of the fiber (m/s^2).<br>
   *     @param sinPennationAngle<br>
   *         The sine of the pennation angle.<br>
   *     @param cosPennationAngle<br>
   *         The cosine of the pennation angle.<br>
   *     @param pennationAngularVelocity<br>
   *         The angular velocity of the parallelogram (rad/s).<br>
   *     @return <br>
   *         The angular acceleration of the parallelogram (rad/s^2).
   */
  public double calcPennationAngularAcceleration(double fiberLength, double fiberVelocity, double fiberAcceleration, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcPennationAngularAcceleration(swigCPtr, this, fiberLength, fiberVelocity, fiberAcceleration, sinPennationAngle, cosPennationAngle, pennationAngularVelocity);
  }

  /**
   *     @param fiberLength<br>
   *         The length of the fiber (m).<br>
   *     @param fiberVelocity<br>
   *         The lengthening velocity of the fiber (m/s).<br>
   *     @param fiberAcceleration<br>
   *         The lengthening acceleration of the fiber (m/s^2).<br>
   *     @param sinPennationAngle<br>
   *         The sine of the pennation angle.<br>
   *     @param cosPennationAngle<br>
   *         The cosine of the pennation angle.<br>
   *     @param pennationAngularVelocity<br>
   *         The angular velocity of the parallelogram (rad/s).<br>
   *     @param pennationAngularAcceleration<br>
   *         The angular acceleration of the parallelogram (rad/s^2).<br>
   *     @return <br>
   *         The acceleration of the fiber projected onto the axis of the tendon<br>
   *         (m/s^2).
   */
  public double calcFiberAccelerationAlongTendon(double fiberLength, double fiberVelocity, double fiberAcceleration, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double pennationAngularAcceleration) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberAccelerationAlongTendon(swigCPtr, this, fiberLength, fiberVelocity, fiberAcceleration, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, pennationAngularAcceleration);
  }

  /**
   *  Calculates the partial derivative of the fiber length along the tendon<br>
   *     with respect to the fiber length. 
   */
  public double calc_DFiberLengthAlongTendon_DfiberLength(double fiberLength, double sinPennationAngle, double cosPennationAngle, double DpennationAngle_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DFiberLengthAlongTendon_DfiberLength(swigCPtr, this, fiberLength, sinPennationAngle, cosPennationAngle, DpennationAngle_DfiberLength);
  }

  /**
   *  Calculates the partial derivative of the pennation angular velocity with<br>
   *     respect to the fiber length. 
   */
  public double calc_DPennationAngularVelocity_DfiberLength(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double DpennationAngle_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DPennationAngularVelocity_DfiberLength(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, DpennationAngle_DfiberLength);
  }

  /**
   *  Calculates the partial derivative of the fiber velocity along the tendon<br>
   *     with respect to the fiber length. 
   */
  public double calc_DFiberVelocityAlongTendon_DfiberLength(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double DpennationAngle_DfiberLength, double DpennationAngularVelocity_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DFiberVelocityAlongTendon_DfiberLength(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, DpennationAngle_DfiberLength, DpennationAngularVelocity_DfiberLength);
  }

  /**
   *  Calculates the partial derivative of the pennation angle with respect to<br>
   *     the fiber length. 
   */
  public double calc_DPennationAngle_DfiberLength(double fiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DPennationAngle_DfiberLength(swigCPtr, this, fiberLength);
  }

  /**
   *  Calculates the partial derivative of the tendon length with respect to<br>
   *     the fiber length. 
   */
  public double calc_DTendonLength_DfiberLength(double fiberLength, double sinPennationAngle, double cosPennationAngle, double DpennationAngle_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DTendonLength_DfiberLength(swigCPtr, this, fiberLength, sinPennationAngle, cosPennationAngle, DpennationAngle_DfiberLength);
  }

  /**
   *     @param muscleLength<br>
   *         The length of the musculotendon actuator (m).<br>
   *     @param tendonLength<br>
   *         The length of the tendon (m).<br>
   *     @return <br>
   *         The length of the fiber (m).
   */
  public double calcFiberLength(double muscleLength, double tendonLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberLength(swigCPtr, this, muscleLength, tendonLength);
  }

  /**
   *     @param cosPennationAngle<br>
   *         The cosine of the pennation angle.<br>
   *     @param muscleVelocity<br>
   *         The lengthening velocity of the musculotendon actuator (m/s).<br>
   *     @param tendonVelocity<br>
   *         The lengthening velocity of the tendon (m/s).<br>
   *     @return <br>
   *         The lengthening velocity of the fiber (m/s).
   */
  public double calcFiberVelocity(double cosPennationAngle, double muscleVelocity, double tendonVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberVelocity(swigCPtr, this, cosPennationAngle, muscleVelocity, tendonVelocity);
  }

}

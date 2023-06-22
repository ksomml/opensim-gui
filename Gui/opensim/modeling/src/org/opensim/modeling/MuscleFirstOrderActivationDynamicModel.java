/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a muscle modeling utility class that computes the time derivative of<br>
 *     activation using a first-order dynamic model. This activation model is a<br>
 *     modification of those used by Thelen (2003) and Winters (1995). The time<br>
 *     derivative of activation (/dt ) is calculated as follows:
    \f[ \frac{da}{dt} = \frac{u-a}{\tau(u,a)} 
    where  is excitation, \f$a  is activation, and \tau(u,a)  is a
    variable time constant:
     \tau(u,a) = t_{\rm{act}} (0.5 + 1.5a) \quad {\rm{if}}\ u > a 
     \tau(u,a) = t_{\rm{deact}} / (0.5 + 1.5a) \quad {\rm{otherwise}} 

    Since equilibrium muscle models typically have a numerical singularity in
    their state equations when activation is zero, we apply a lower activation
    bound (_{) to both activation and excitation.<br>
 * <br>
 *     @param tauActivation<br>
 *         Activation time constant. A typical value is 0.010 s (10 ms).<br>
 *     @param tauDeactivation<br>
 *         Deactivation time constant. A typical value is 0.040 s (40 ms).<br>
 *     @param minActivation<br>
 *         The minimum permissible activation. To avoid a numerical singularity at<br>
 *         a = 0, this value is typically set to between 0.01 and 0.1 for use with<br>
 *         an equilibrium muscle model.<br>
 *     @param muscleName<br>
 *         The name of the muscle to which this activation dynamic model belongs.<br>
 *         This string is used for reporting meaningful error messages.<br>
 * <br>
 *     <B>Conditions</B><br>
 *     \verbatim<br>
 *     tauActivation > 0<br>
 *     tauDeactivation > 0<br>
 *     0 <= minActivation < 1<br>
 *     <br>
 * <br>
 *     <b>Default Parameter Values</b><br>
 *     {@literal 
    tauActivation ...... 0.010
    tauDeactivation .... 0.040
    minActivation ...... 0.01
    }<br>
 * <br>
 *     <b>References</b><br>
 *     <li>Thelen, D.G. (2003) Adjustment of muscle mechanics model parameters to<br>
 *         simulate dynamic contractions in older adults. ASME Journal of<br>
 *         Biomechanical Engineering 125(1):70--77.<br>
 *</li>     <li>Winters, J.M. (1995) An improved muscle-reflex actuator for use in<br>
 *         large-scale neuromusculoskeletal models. Annals of Biomedical<br>
 *         Engineering 23(4):359--374.</li><br>
 * <br>
 *     @author Matt Millard
 */
public class MuscleFirstOrderActivationDynamicModel extends ModelComponent {
  private transient long swigCPtr;

  public MuscleFirstOrderActivationDynamicModel(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleFirstOrderActivationDynamicModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MuscleFirstOrderActivationDynamicModel obj) {
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
        opensimSimulationJNI.delete_MuscleFirstOrderActivationDynamicModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleFirstOrderActivationDynamicModel safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleFirstOrderActivationDynamicModel(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleFirstOrderActivationDynamicModel(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_activation_time_constant(MuscleFirstOrderActivationDynamicModel source) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_copyProperty_activation_time_constant(swigCPtr, this, MuscleFirstOrderActivationDynamicModel.getCPtr(source), source);
  }

  public double get_activation_time_constant(int i) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_get_activation_time_constant__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_activation_time_constant(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_upd_activation_time_constant__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_time_constant(int i, double value) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_set_activation_time_constant__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_time_constant(double value) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_append_activation_time_constant(swigCPtr, this, value);
  }

  public void constructProperty_activation_time_constant(double initValue) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_constructProperty_activation_time_constant(swigCPtr, this, initValue);
  }

  public double get_activation_time_constant() {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_get_activation_time_constant__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_activation_time_constant() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_upd_activation_time_constant__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_time_constant(double value) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_set_activation_time_constant__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_deactivation_time_constant(MuscleFirstOrderActivationDynamicModel source) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_copyProperty_deactivation_time_constant(swigCPtr, this, MuscleFirstOrderActivationDynamicModel.getCPtr(source), source);
  }

  public double get_deactivation_time_constant(int i) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_get_deactivation_time_constant__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_deactivation_time_constant(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_upd_deactivation_time_constant__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_deactivation_time_constant(int i, double value) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_set_deactivation_time_constant__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_deactivation_time_constant(double value) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_append_deactivation_time_constant(swigCPtr, this, value);
  }

  public void constructProperty_deactivation_time_constant(double initValue) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_constructProperty_deactivation_time_constant(swigCPtr, this, initValue);
  }

  public double get_deactivation_time_constant() {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_get_deactivation_time_constant__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_deactivation_time_constant() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_upd_deactivation_time_constant__SWIG_1(swigCPtr, this), false);
  }

  public void set_deactivation_time_constant(double value) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_set_deactivation_time_constant__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_minimum_activation(MuscleFirstOrderActivationDynamicModel source) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_copyProperty_minimum_activation(swigCPtr, this, MuscleFirstOrderActivationDynamicModel.getCPtr(source), source);
  }

  public double get_minimum_activation(int i) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_get_minimum_activation__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_minimum_activation(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_upd_minimum_activation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_minimum_activation(int i, double value) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_set_minimum_activation__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_minimum_activation(double value) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_append_minimum_activation(swigCPtr, this, value);
  }

  public void constructProperty_minimum_activation(double initValue) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_constructProperty_minimum_activation(swigCPtr, this, initValue);
  }

  public double get_minimum_activation() {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_get_minimum_activation__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_minimum_activation() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_upd_minimum_activation__SWIG_1(swigCPtr, this), false);
  }

  public void set_minimum_activation(double value) {
    opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_set_minimum_activation__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  The default constructor creates an activation dynamic model with the<br>
   *     default property values and assigns it a default name. *
   */
  public MuscleFirstOrderActivationDynamicModel() {
    this(opensimSimulationJNI.new_MuscleFirstOrderActivationDynamicModel__SWIG_0(), true);
  }

  /**
   *  Creates an activation dynamic model using the provided parameters. 
   */
  public MuscleFirstOrderActivationDynamicModel(double tauActivation, double tauDeactivation, double minActivation, String muscleName) {
    this(opensimSimulationJNI.new_MuscleFirstOrderActivationDynamicModel__SWIG_1(tauActivation, tauDeactivation, minActivation, muscleName), true);
  }

  /**
   *     @return Activation clamped to the range [minActivation, 1.0].
   */
  public double clampActivation(double activation) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_clampActivation(swigCPtr, this, activation);
  }

  /**
   *  Calculates the time derivative of activation. 
   */
  public double calcDerivative(double activation, double excitation) {
    return opensimSimulationJNI.MuscleFirstOrderActivationDynamicModel_calcDerivative(swigCPtr, this, activation, excitation);
  }

}

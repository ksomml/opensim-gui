/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  A goal is a term in the cost functional to be minimized, or a set of endpoint<br>
 * constraints that must lie within provided bounds. Goals depend on the<br>
 * phase's initial and final states and controls, and optionally on the<br>
 * integral of a quantity over the phase.<br>
 * Not all goals support endpoint constraint mode; see<br>
 * getSupportsEndpointConstraint(). If a goal does support endpoint constraint<br>
 * mode, then the default mode is available via getMode(). Use endpoint<br>
 * constraint mode if you require the goal to be met strictly and do not want<br>
 * to allow a trade-off between this goal and other goals.<br>
 * The calculation of the goal may differ between cost and endpoint constraint<br>
 * modes; cost mode may require that outputs are squared, for example.<br>
 * <br>
 * # Stage dependency<br>
 * Some goals require less of IntegrandInput and GoalInput than others. To<br>
 * ensure goals are computed efficiently, goals can specify a stage dependency,<br>
 * which tells solvers what to do when preparing IntegrandInput and GoalInput.<br>
 * Here are the expectations for each SimTK::Stage:<br>
 * <br>
 * - SimTK::Stage::Topology: the time field of IntegrandInput and<br>
 *     initial_time and final_time fields of GoalInput are available.<br>
 * - SimTK::Stage::Model: controls fields of IntegrandInput and<br>
 *     GoalInput are available.<br>
 * - SimTK::Stage::Instance: MocoParameters are applied to the model.<br>
 * - SimTK::Stage::Time: state variables (SimTK::State::getY(), etc.) are<br>
 *     available, and SimTK::Stage::getTime() is updated.<br>
 * - SimTK::Stage::Position: state, initial_state, and final_state can be used<br>
 *     to compute position-dependent quantities.<br>
 * - SimTK::Stage::Velocity: state, initial_state, and final_state can be used<br>
 *     to compute velocity-dependent quantities.<br>
 * - SimTK::Stage::Dynamics: state, initial_state, and final_state can be used<br>
 *     to compute force-dependent quantities.<br>
 * - SimTK::Stage::Acceleration: state, initial_state, and final_state can be<br>
 *     used to compute acceleration-dependent quantities, such as body<br>
 *     accelerations and joint reactions.<br>
 * <br>
 * ## Scale factors<br>
 * Goals may include an option to add scale factors to the MocoProblem using<br>
 * `appendScaleFactor()`, which takes a MocoScaleFactor object for its argument.<br>
 * A copy of this component is added to the Model internal to MocoProblemRep and<br>
 * its property value is optimized via a MocoParameter. Scale factor usage is<br>
 * specific to each MocoGoal (if used at all).<br>
 * <br>
 * <p alt="For developers"><br>
 * Every time the problem is solved, a copy of this goal is used. An individual<br>
 * instance of a goal is only ever used in a single problem. Therefore, there<br>
 * is no need to clear cache variables that you create in initializeImpl().<br>
 * Also, information stored in this goal does not persist across multiple<br>
 * solves.<br>
 * </p>
 */
public class MocoGoal extends OpenSimObject {
  private transient long swigCPtr;

  public MocoGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoGoal obj) {
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
        opensimMocoJNI.delete_MocoGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoGoal_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Set whether this goal is used in the problem.
   */
  public void setEnabled(boolean enabled) {
    opensimMocoJNI.MocoGoal_setEnabled(swigCPtr, this, enabled);
  }

  public boolean getEnabled() {
    return opensimMocoJNI.MocoGoal_getEnabled(swigCPtr, this);
  }

  /**
   *  In cost mode, the goal is multiplied by this weight. Use the weight to<br>
   *  control the relative importance of terms in the cost functional. The<br>
   *  weight is ignored (e.g., set to 1) in endpoint constraint mode.
   */
  public void setWeight(double weight) {
    opensimMocoJNI.MocoGoal_setWeight(swigCPtr, this, weight);
  }

  public double getWeight() {
    return opensimMocoJNI.MocoGoal_getWeight(swigCPtr, this);
  }

  /**
   *  Set the mode property to either 'cost' or 'endpoint_constraint'. This<br>
   *  should be set before initializing. Setting to 'endpoint_constraint' if<br>
   *  getSupportsEndpointConstraint() is false causes an exception during<br>
   *  initializing.
   */
  public void setMode(String mode) {
    opensimMocoJNI.MocoGoal_setMode(swigCPtr, this, mode);
  }

  /**
   *  This returns the default mode of the goal, unless the user overrode<br>
   *  the default using setMode().
   */
  public String getModeAsString() {
    return opensimMocoJNI.MocoGoal_getModeAsString(swigCPtr, this);
  }

  public MocoGoal.Mode getMode() {
    return MocoGoal.Mode.swigToEnum(opensimMocoJNI.MocoGoal_getMode(swigCPtr, this));
  }

  public boolean getModeIsCost() {
    return opensimMocoJNI.MocoGoal_getModeIsCost(swigCPtr, this);
  }

  public boolean getModeIsEndpointConstraint() {
    return opensimMocoJNI.MocoGoal_getModeIsEndpointConstraint(swigCPtr, this);
  }

  /**
   *  Types of goals have a class-level default for whether they are enforced<br>
   *  as a cost or endpoint constraint.
   */
  public MocoGoal.Mode getDefaultMode() {
    return MocoGoal.Mode.swigToEnum(opensimMocoJNI.MocoGoal_getDefaultMode(swigCPtr, this));
  }

  /**
   *  Can this goal be used in endpoint constraint mode?
   */
  public boolean getSupportsEndpointConstraint() {
    return opensimMocoJNI.MocoGoal_getSupportsEndpointConstraint(swigCPtr, this);
  }

  /**
   *  Get bounds for the constraints that are enforced when using this goal in<br>
   *  endpoint constraint mode.<br>
   *  This info is ignored if getSupportsEndpointConstraint() is false.
   */
  public SWIGTYPE_p_MocoConstraintInfo getConstraintInfo() {
    return new SWIGTYPE_p_MocoConstraintInfo(opensimMocoJNI.MocoGoal_getConstraintInfo(swigCPtr, this), false);
  }

  public SWIGTYPE_p_MocoConstraintInfo updConstraintInfo() {
    return new SWIGTYPE_p_MocoConstraintInfo(opensimMocoJNI.MocoGoal_updConstraintInfo(swigCPtr, this), false);
  }

  /**
   *  Set the vector of endpoint constraint bounds for this MocoGoal. This<br>
   *  vector must have length equal to the number of outputs for this goal,<br>
   *  otherwise an exception is thrown.<br>
   *  This info is ignored if getSupportsEndpointConstraint() is false.
   */
  public void setEndpointConstraintBounds(StdVectorMocoBounds bounds) {
    opensimMocoJNI.MocoGoal_setEndpointConstraintBounds(swigCPtr, this, StdVectorMocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Get the vector of the endpoint constraint bounds for this MocoGoal.<br>
   *  Note: the return value is constructed fresh on every call from<br>
   *  the internal property. Avoid repeated calls to this function.
   */
  public StdVectorMocoBounds getEndpointConstraintBounds() {
    return new StdVectorMocoBounds(opensimMocoJNI.MocoGoal_getEndpointConstraintBounds(swigCPtr, this), true);
  }

  /**
   *  Get the length of the return value of calcGoal().
   */
  public int getNumOutputs() {
    return opensimMocoJNI.MocoGoal_getNumOutputs(swigCPtr, this);
  }

  /**
   *  Get the number of integrals required by this cost.<br>
   *  This returns either 0 (for a strictly-endpoint cost) or 1.<br>
   *  initializeOnModel() has been invoked.
   */
  public int getNumIntegrals() {
    return opensimMocoJNI.MocoGoal_getNumIntegrals(swigCPtr, this);
  }

  /**
   *  Obtain the stage that this goal depends on. Solvers can use this to more<br>
   *  efficiently decide how to set the IntegrandInput and GoalInput. See the<br>
   *  MocoGoal class description for details about the different stages. The<br>
   *  stage dependency is the same for both modes of the goal (cost and<br>
   *  endpoint constraint).
   */
  public Stage getStageDependency() {
    return new Stage(opensimMocoJNI.MocoGoal_getStageDependency(swigCPtr, this), true);
  }

  /**
   *  Perform error checks on user input for this goal, and cache<br>
   *  quantities needed when computing the goal value.<br>
   *  This function must be invoked before invoking calcIntegrand() or<br>
   *  calcGoal().
   */
  public void initializeOnModel(Model model) {
    opensimMocoJNI.MocoGoal_initializeOnModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  /**
   *  Get a vector of the MocoScaleFactors added to this MocoGoal.<br>
   *  Note: the return value is constructed fresh on every call from<br>
   *  the internal property. Avoid repeated calls to this function.
   */
  public SWIGTYPE_p_std__vectorT_OpenSim__MocoScaleFactor_t getScaleFactors() {
    return new SWIGTYPE_p_std__vectorT_OpenSim__MocoScaleFactor_t(opensimMocoJNI.MocoGoal_getScaleFactors(swigCPtr, this), true);
  }

  /**
   *  Print the name type and mode of this goal. In cost mode, this prints the<br>
   *  weight.
   */
  public void printDescription() {
    opensimMocoJNI.MocoGoal_printDescription(swigCPtr, this);
  }

  /**
   *  Set if the goal should be divided by the displacement of the system's<br>
   *  center of mass over the phase.<br>
   *  Note: Increases the stage dependency of this goal to <br>
   *  SimTK::Stage::Position, if it is not already equal or higher.
   */
  public void setDivideByDisplacement(boolean tf) {
    opensimMocoJNI.MocoGoal_setDivideByDisplacement(swigCPtr, this, tf);
  }

  public boolean getDivideByDisplacement() {
    return opensimMocoJNI.MocoGoal_getDivideByDisplacement(swigCPtr, this);
  }

  /**
   *  Set if the goal should be divided by the phase duration.<br>
   *  Note: Increases the stage dependency of this goal to <br>
   *  SimTK::Stage::Topology, if it is not already equal or higher
   */
  public void setDivideByDuration(boolean tf) {
    opensimMocoJNI.MocoGoal_setDivideByDuration(swigCPtr, this, tf);
  }

  public boolean getDivideByDuration() {
    return opensimMocoJNI.MocoGoal_getDivideByDuration(swigCPtr, this);
  }

  /**
   *  Set if the goal should be divided by the model's mass.<br>
   *  Note: Increases the stage dependency of this goal to <br>
   *  SimTK::Stage::Instance, if it is not already equal or higher.
   */
  public void setDivideByMass(boolean tf) {
    opensimMocoJNI.MocoGoal_setDivideByMass(swigCPtr, this, tf);
  }

  public boolean getDivideByMass() {
    return opensimMocoJNI.MocoGoal_getDivideByMass(swigCPtr, this);
  }

  public final static class Mode {
    public final static MocoGoal.Mode Cost = new MocoGoal.Mode("Cost");
    public final static MocoGoal.Mode EndpointConstraint = new MocoGoal.Mode("EndpointConstraint");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Mode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Mode.class + " with value " + swigValue);
    }

    private Mode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Mode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Mode(String swigName, Mode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Mode[] swigValues = { Cost, EndpointConstraint };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}

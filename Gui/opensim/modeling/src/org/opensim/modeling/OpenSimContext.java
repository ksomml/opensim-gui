/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Class intended to keep the SimTK::State under an OpenSim model to make it possible<br>
 * to get/set values in the SimTK::State without exposing the SimTK::State class itself.<br>
 * <br>
 * The class provides convenient methods to get/set various state entries and query the <br>
 * state for cache values. The main function this class provides is an adaptor of various<br>
 * data types from Java and scripting supported primitive, wrapped and array types to the <br>
 * corresponding possibly templatized or SimTK native data types.<br>
 * <br>
 * Most methods of this class are implementated by delegating the call to the SimTK::State<br>
 * under the object, for example:<br>
 * Context::isDisabled(const Force&amp; force) -&gt; force.isDisabled(state)<br>
 * <br>
 * The class also provides convenient services to recreateSystem and realize to various stages.<br>
 * <br>
 * @author Ayman Habib &amp; Jack Middleton 
 */
public class OpenSimContext extends OpenSimObject {
  private transient long swigCPtr;

  public OpenSimContext(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.OpenSimContext_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(OpenSimContext obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(OpenSimContext obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_OpenSimContext(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static OpenSimContext safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.OpenSimContext_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new OpenSimContext(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.OpenSimContext_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimContext(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getConcreteClassName(swigCPtr, this);
  }

  public OpenSimContext(State s, Model model) {
    this(opensimActuatorsAnalysesToolsJNI.new_OpenSimContext(State.getCPtr(s), s, Model.getCPtr(model), model), true);
  }

  public void setState(State s) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setState(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setModel(Model m) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setModel(swigCPtr, this, Model.getCPtr(m), m);
  }

  /**
   *  Get reference to the single instance of SimTK::State maintained by the Context object *
   */
  public State getCurrentStateRef() {
    return new State(opensimActuatorsAnalysesToolsJNI.OpenSimContext_getCurrentStateRef(swigCPtr, this), false);
  }

  /**
   *  Return a "clone" of  the single instance of SimTK::State maintained by the Context object *
   */
  public State getCurrentStateCopy() {
    return new State(opensimActuatorsAnalysesToolsJNI.OpenSimContext_getCurrentStateCopy(swigCPtr, this), true);
  }

  public void recreateSystemAfterSystemExistsKeepStage() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_recreateSystemAfterSystemExistsKeepStage(swigCPtr, this);
  }

  public void recreateSystemAfterSystemExists() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_recreateSystemAfterSystemExists(swigCPtr, this);
  }

  public void resetStateToDefault() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_resetStateToDefault(swigCPtr, this);
  }

  public void transformPosition(PhysicalFrame body, double[] offset, double[] gOffset) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_transformPosition(swigCPtr, this, PhysicalFrame.getCPtr(body), body, offset, gOffset);
  }

  public Transform getTransform(PhysicalFrame body) {
    return new Transform(opensimActuatorsAnalysesToolsJNI.OpenSimContext_getTransform(swigCPtr, this, PhysicalFrame.getCPtr(body), body), true);
  }

  public void transform(PhysicalFrame ground, double[] d, PhysicalFrame body, double[] dragVectorBody) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_transform(swigCPtr, this, PhysicalFrame.getCPtr(ground), ground, d, PhysicalFrame.getCPtr(body), body, dragVectorBody);
  }

  public double getValue(Coordinate coord) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getValue(swigCPtr, this, Coordinate.getCPtr(coord), coord);
  }

  public boolean getLocked(Coordinate coord) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getLocked(swigCPtr, this, Coordinate.getCPtr(coord), coord);
  }

  public void setValue(Coordinate coord, double d, boolean enforceConstraints) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setValue__SWIG_0(swigCPtr, this, Coordinate.getCPtr(coord), coord, d, enforceConstraints);
  }

  public void setValue(Coordinate coord, double d) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setValue__SWIG_1(swigCPtr, this, Coordinate.getCPtr(coord), coord, d);
  }

  public void setClamped(Coordinate coord, boolean newValue) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setClamped(swigCPtr, this, Coordinate.getCPtr(coord), coord, newValue);
  }

  public boolean getClamped(Coordinate coord) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getClamped(swigCPtr, this, Coordinate.getCPtr(coord), coord);
  }

  public void setLocked(Coordinate coord, boolean newValue) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setLocked(swigCPtr, this, Coordinate.getCPtr(coord), coord, newValue);
  }

  public boolean isPrescribed(Coordinate coord) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_isPrescribed(swigCPtr, this, Coordinate.getCPtr(coord), coord);
  }

  public boolean isConstrained(Coordinate coord) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_isConstrained(swigCPtr, this, Coordinate.getCPtr(coord), coord);
  }

  public boolean isEnforced(Constraint constraint) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_isEnforced(swigCPtr, this, Constraint.getCPtr(constraint), constraint);
  }

  public void setIsEnforced(Constraint constraint, boolean isEnforced) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setIsEnforced(swigCPtr, this, Constraint.getCPtr(constraint), constraint, isEnforced);
  }

  public boolean appliesForce(Force force) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_appliesForce(swigCPtr, this, Force.getCPtr(force), force);
  }

  public void setAppliesForce(Force force, boolean applyForce) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setAppliesForce(swigCPtr, this, Force.getCPtr(force), force, applyForce);
  }

  public double getActivation(Muscle act) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getActivation(swigCPtr, this, Muscle.getCPtr(act), act);
  }

  public double getMuscleLength(Muscle act) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getMuscleLength(swigCPtr, this, Muscle.getCPtr(act), act);
  }

  public ArrayPathPoint getCurrentPath(Muscle act) {
    return new ArrayPathPoint(opensimActuatorsAnalysesToolsJNI.OpenSimContext_getCurrentPath(swigCPtr, this, Muscle.getCPtr(act), act), false);
  }

  public void copyMuscle(Muscle from, Muscle to) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_copyMuscle(swigCPtr, this, Muscle.getCPtr(from), from, Muscle.getCPtr(to), to);
  }

  public void replacePropertyFunction(OpenSimObject obj, Function aOldFunction, Function aNewFunction) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_replacePropertyFunction(swigCPtr, this, OpenSimObject.getCPtr(obj), obj, Function.getCPtr(aOldFunction), aOldFunction, Function.getCPtr(aNewFunction), aNewFunction);
  }

  public void setXFunction(MovingPathPoint mmp, Function newFunction) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setXFunction(swigCPtr, this, MovingPathPoint.getCPtr(mmp), mmp, Function.getCPtr(newFunction), newFunction);
  }

  public void setYFunction(MovingPathPoint mmp, Function newFunction) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setYFunction(swigCPtr, this, MovingPathPoint.getCPtr(mmp), mmp, Function.getCPtr(newFunction), newFunction);
  }

  public void setZFunction(MovingPathPoint mmp, Function newFunction) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setZFunction(swigCPtr, this, MovingPathPoint.getCPtr(mmp), mmp, Function.getCPtr(newFunction), newFunction);
  }

  public void setXCoordinate(MovingPathPoint mmp, Coordinate newCoord) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setXCoordinate(swigCPtr, this, MovingPathPoint.getCPtr(mmp), mmp, Coordinate.getCPtr(newCoord), newCoord);
  }

  public void setYCoordinate(MovingPathPoint mmp, Coordinate newCoord) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setYCoordinate(swigCPtr, this, MovingPathPoint.getCPtr(mmp), mmp, Coordinate.getCPtr(newCoord), newCoord);
  }

  public void setZCoordinate(MovingPathPoint mmp, Coordinate newCoord) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setZCoordinate(swigCPtr, this, MovingPathPoint.getCPtr(mmp), mmp, Coordinate.getCPtr(newCoord), newCoord);
  }

  public void setBody(AbstractPathPoint pathPoint, PhysicalFrame newBody) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setBody__SWIG_0(swigCPtr, this, AbstractPathPoint.getCPtr(pathPoint), pathPoint, PhysicalFrame.getCPtr(newBody), newBody);
  }

  public void setCoordinate(ConditionalPathPoint via, Coordinate newCoord) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setCoordinate(swigCPtr, this, ConditionalPathPoint.getCPtr(via), via, Coordinate.getCPtr(newCoord), newCoord);
  }

  public void setRangeMin(ConditionalPathPoint via, double d) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setRangeMin(swigCPtr, this, ConditionalPathPoint.getCPtr(via), via, d);
  }

  public void setRangeMax(ConditionalPathPoint via, double d) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setRangeMax(swigCPtr, this, ConditionalPathPoint.getCPtr(via), via, d);
  }

  public boolean replacePathPoint(GeometryPath p, AbstractPathPoint mp, AbstractPathPoint newPoint) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_replacePathPoint(swigCPtr, this, GeometryPath.getCPtr(p), p, AbstractPathPoint.getCPtr(mp), mp, AbstractPathPoint.getCPtr(newPoint), newPoint);
  }

  public void setLocation(PathPoint mp, int i, double d) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setLocation__SWIG_0(swigCPtr, this, PathPoint.getCPtr(mp), mp, i, d);
  }

  public void setLocation(PathPoint mp, Vec3 newLocation) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setLocation__SWIG_1(swigCPtr, this, PathPoint.getCPtr(mp), mp, Vec3.getCPtr(newLocation), newLocation);
  }

  public void setEndPoint(PathWrap mw, int newEndPt) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setEndPoint(swigCPtr, this, PathWrap.getCPtr(mw), mw, newEndPt);
  }

  public void addPathPoint(GeometryPath p, int menuChoice, PhysicalFrame body) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_addPathPoint(swigCPtr, this, GeometryPath.getCPtr(p), p, menuChoice, PhysicalFrame.getCPtr(body), body);
  }

  public boolean deletePathPoint(GeometryPath p, int menuChoice) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_deletePathPoint(swigCPtr, this, GeometryPath.getCPtr(p), p, menuChoice);
  }

  public boolean isActivePathPoint(AbstractPathPoint mp) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_isActivePathPoint(swigCPtr, this, AbstractPathPoint.getCPtr(mp), mp);
  }

  public void setStartPoint(PathWrap mw, int newStartPt) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setStartPoint(swigCPtr, this, PathWrap.getCPtr(mw), mw, newStartPt);
  }

  public void addPathWrap(GeometryPath p, WrapObject awo) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_addPathWrap(swigCPtr, this, GeometryPath.getCPtr(p), p, WrapObject.getCPtr(awo), awo);
  }

  public void moveUpPathWrap(GeometryPath p, int num) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_moveUpPathWrap(swigCPtr, this, GeometryPath.getCPtr(p), p, num);
  }

  public void moveDownPathWrap(GeometryPath p, int num) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_moveDownPathWrap(swigCPtr, this, GeometryPath.getCPtr(p), p, num);
  }

  public void deletePathWrap(GeometryPath p, int num) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_deletePathWrap(swigCPtr, this, GeometryPath.getCPtr(p), p, num);
  }

  public void setBody(Marker currentMarker, PhysicalFrame newBody, boolean b) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setBody__SWIG_1(swigCPtr, this, Marker.getCPtr(currentMarker), currentMarker, PhysicalFrame.getCPtr(newBody), newBody, b);
  }

  public void updateMarkerSet(Model model, MarkerSet aMarkerSet) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_updateMarkerSet(swigCPtr, this, Model.getCPtr(model), model, MarkerSet.getCPtr(aMarkerSet), aMarkerSet);
  }

  public void getCenterOfMassInGround(double[] com) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_getCenterOfMassInGround(swigCPtr, this, com);
  }

  public int step(Analysis analysis) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_step(swigCPtr, this, Analysis.getCPtr(analysis), analysis);
  }

  public boolean solveInverseKinematics(InverseKinematicsTool ikTool) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_solveInverseKinematics(swigCPtr, this, InverseKinematicsTool.getCPtr(ikTool), ikTool);
  }

  public void setStatesFromMotion(AnalyzeTool analyzeTool, Storage aMotion, boolean aInDegrees) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setStatesFromMotion(swigCPtr, this, AnalyzeTool.getCPtr(analyzeTool), analyzeTool, Storage.getCPtr(aMotion), aMotion, aInDegrees);
  }

  public void loadStatesFromFile(AnalyzeTool analyzeTool) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_loadStatesFromFile(swigCPtr, this, AnalyzeTool.getCPtr(analyzeTool), analyzeTool);
  }

  public boolean processModelScale(ModelScaler modelScaler, Model aModel, String aPathToSubject, double aFinalMass) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_processModelScale__SWIG_0(swigCPtr, this, ModelScaler.getCPtr(modelScaler), modelScaler, Model.getCPtr(aModel), aModel, aPathToSubject, aFinalMass);
  }

  public boolean processModelScale(ModelScaler modelScaler, Model aModel, String aPathToSubject) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_processModelScale__SWIG_1(swigCPtr, this, ModelScaler.getCPtr(modelScaler), modelScaler, Model.getCPtr(aModel), aModel, aPathToSubject);
  }

  public boolean processModelScale(ModelScaler modelScaler, Model aModel) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_processModelScale__SWIG_2(swigCPtr, this, ModelScaler.getCPtr(modelScaler), modelScaler, Model.getCPtr(aModel), aModel);
  }

  public boolean processModelMarkerPlacer(MarkerPlacer markerPlacer, Model aModel, String aPathToSubject) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_processModelMarkerPlacer__SWIG_0(swigCPtr, this, MarkerPlacer.getCPtr(markerPlacer), markerPlacer, Model.getCPtr(aModel), aModel, aPathToSubject);
  }

  public boolean processModelMarkerPlacer(MarkerPlacer markerPlacer, Model aModel) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_processModelMarkerPlacer__SWIG_1(swigCPtr, this, MarkerPlacer.getCPtr(markerPlacer), markerPlacer, Model.getCPtr(aModel), aModel);
  }

  public double computeMeasurementScaleFactor(ModelScaler modelScaler, Model aModel, MarkerData aMarkerData, Measurement aMeasurement) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_computeMeasurementScaleFactor(swigCPtr, this, ModelScaler.getCPtr(modelScaler), modelScaler, Model.getCPtr(aModel), aModel, MarkerData.getCPtr(aMarkerData), aMarkerData, Measurement.getCPtr(aMeasurement), aMeasurement);
  }

  public void replaceTransformAxisFunction(TransformAxis aDof, Function aFunction) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_replaceTransformAxisFunction(swigCPtr, this, TransformAxis.getCPtr(aDof), aDof, Function.getCPtr(aFunction), aFunction);
  }

  public static boolean isNaN(double v) {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_isNaN(v);
  }

  public double getTime() {
    return opensimActuatorsAnalysesToolsJNI.OpenSimContext_getTime(swigCPtr, this);
  }

  public static void getTransformAsDouble16(Transform aTransform, double[] flattened) {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_getTransformAsDouble16(Transform.getCPtr(aTransform), aTransform, flattened);
  }

  public void setPropertiesFromState() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setPropertiesFromState(swigCPtr, this);
  }

  /**
   * Create a new System under the model then realize it to the same stage it had
   */
  public void recreateSystemKeepStage() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_recreateSystemKeepStage(swigCPtr, this);
  }

  public void realizePosition() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_realizePosition(swigCPtr, this);
  }

  public void realizeVelocity() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_realizeVelocity(swigCPtr, this);
  }

  public void cacheModelAndState() {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_cacheModelAndState(swigCPtr, this);
  }

  public void restoreStateFromCachedModel() throws java.io.IOException {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_restoreStateFromCachedModel(swigCPtr, this);
  }

  public void setSocketConnecteePath(AbstractSocket socket, String newValue) throws java.io.IOException {
    opensimActuatorsAnalysesToolsJNI.OpenSimContext_setSocketConnecteePath(swigCPtr, this, AbstractSocket.getCPtr(socket), socket, newValue);
  }

}

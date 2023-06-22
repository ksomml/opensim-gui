/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for recording the basic actuator information for a model<br>
 * during a simulation.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class Actuation extends Analysis {
  private transient long swigCPtr;

  public Actuation(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.Actuation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Actuation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Actuation obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_Actuation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Actuation safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Actuation_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Actuation(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.Actuation_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.Actuation_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Actuation_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Actuation(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.Actuation_getConcreteClassName(swigCPtr, this);
  }

  public Actuation(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_Actuation__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public Actuation() {
    this(opensimActuatorsAnalysesToolsJNI.new_Actuation__SWIG_1(), true);
  }

  public Actuation(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_Actuation__SWIG_2(aFileName), true);
  }

  public Actuation(Actuation aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_Actuation__SWIG_3(Actuation.getCPtr(aObject), aObject), true);
  }

  public void setStorageCapacityIncrements(int aIncrement) {
    opensimActuatorsAnalysesToolsJNI.Actuation_setStorageCapacityIncrements(swigCPtr, this, aIncrement);
  }

  public Storage getForceStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Actuation_getForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getSpeedStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Actuation_getSpeedStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getPowerStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Actuation_getPowerStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.Actuation_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.Actuation_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}

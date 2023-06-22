/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a set of parameters describing how to place IMUs<br>
 * on a model to match placement of experimental sensors (IMUs)<br>
 * <br>
 * Calibrates a model by registering IMU frames whose orientations in the<br>
 * sensor world frame are specified, assuming the model's default pose is the<br>
 * calibration pose. The resultant model with IMU frames registered is optionally <br>
 * written to file. Optional properties are available to identify heading correction<br>
 * to line up the base IMU by its label in the orientation_file_for_calibration<br>
 * e.g. 'pelvis imu' and its heading axis as +/- 'x', 'y', or 'z', are used to <br>
 * align all the IMU data so that base imu's heading (forward) is in the X direction <br>
 * of OpenSim's ground frame. <br>
 * <br>
 * @author Ayman Habib, Ajay Seth
 */
public class IMUPlacer extends OpenSimObject {
  private transient long swigCPtr;

  public IMUPlacer(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.IMUPlacer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IMUPlacer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(IMUPlacer obj) {
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
        opensimSimulationJNI.delete_IMUPlacer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static IMUPlacer safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.IMUPlacer_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new IMUPlacer(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.IMUPlacer_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.IMUPlacer_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.IMUPlacer_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IMUPlacer(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.IMUPlacer_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_model_file(IMUPlacer source) {
    opensimSimulationJNI.IMUPlacer_copyProperty_model_file(swigCPtr, this, IMUPlacer.getCPtr(source), source);
  }

  public String get_model_file(int i) {
    return opensimSimulationJNI.IMUPlacer_get_model_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_model_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_model_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_model_file(int i, String value) {
    opensimSimulationJNI.IMUPlacer_set_model_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_model_file(String value) {
    return opensimSimulationJNI.IMUPlacer_append_model_file(swigCPtr, this, value);
  }

  public void constructProperty_model_file(String initValue) {
    opensimSimulationJNI.IMUPlacer_constructProperty_model_file(swigCPtr, this, initValue);
  }

  public String get_model_file() {
    return opensimSimulationJNI.IMUPlacer_get_model_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_model_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_model_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_model_file(String value) {
    opensimSimulationJNI.IMUPlacer_set_model_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_base_imu_label(IMUPlacer source) {
    opensimSimulationJNI.IMUPlacer_copyProperty_base_imu_label(swigCPtr, this, IMUPlacer.getCPtr(source), source);
  }

  public String get_base_imu_label(int i) {
    return opensimSimulationJNI.IMUPlacer_get_base_imu_label__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_base_imu_label(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_base_imu_label__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_base_imu_label(int i, String value) {
    opensimSimulationJNI.IMUPlacer_set_base_imu_label__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_base_imu_label(String value) {
    return opensimSimulationJNI.IMUPlacer_append_base_imu_label(swigCPtr, this, value);
  }

  public void constructProperty_base_imu_label(String initValue) {
    opensimSimulationJNI.IMUPlacer_constructProperty_base_imu_label(swigCPtr, this, initValue);
  }

  public String get_base_imu_label() {
    return opensimSimulationJNI.IMUPlacer_get_base_imu_label__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_base_imu_label() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_base_imu_label__SWIG_1(swigCPtr, this), false);
  }

  public void set_base_imu_label(String value) {
    opensimSimulationJNI.IMUPlacer_set_base_imu_label__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_base_heading_axis(IMUPlacer source) {
    opensimSimulationJNI.IMUPlacer_copyProperty_base_heading_axis(swigCPtr, this, IMUPlacer.getCPtr(source), source);
  }

  public String get_base_heading_axis(int i) {
    return opensimSimulationJNI.IMUPlacer_get_base_heading_axis__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_base_heading_axis(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_base_heading_axis__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_base_heading_axis(int i, String value) {
    opensimSimulationJNI.IMUPlacer_set_base_heading_axis__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_base_heading_axis(String value) {
    return opensimSimulationJNI.IMUPlacer_append_base_heading_axis(swigCPtr, this, value);
  }

  public void constructProperty_base_heading_axis(String initValue) {
    opensimSimulationJNI.IMUPlacer_constructProperty_base_heading_axis(swigCPtr, this, initValue);
  }

  public String get_base_heading_axis() {
    return opensimSimulationJNI.IMUPlacer_get_base_heading_axis__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_base_heading_axis() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_base_heading_axis__SWIG_1(swigCPtr, this), false);
  }

  public void set_base_heading_axis(String value) {
    opensimSimulationJNI.IMUPlacer_set_base_heading_axis__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_sensor_to_opensim_rotations(IMUPlacer source) {
    opensimSimulationJNI.IMUPlacer_copyProperty_sensor_to_opensim_rotations(swigCPtr, this, IMUPlacer.getCPtr(source), source);
  }

  public Vec3 get_sensor_to_opensim_rotations(int i) {
    return new Vec3(opensimSimulationJNI.IMUPlacer_get_sensor_to_opensim_rotations__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_sensor_to_opensim_rotations(int i) {
    return new Vec3(opensimSimulationJNI.IMUPlacer_upd_sensor_to_opensim_rotations__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_sensor_to_opensim_rotations(int i, Vec3 value) {
    opensimSimulationJNI.IMUPlacer_set_sensor_to_opensim_rotations__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_sensor_to_opensim_rotations(Vec3 value) {
    return opensimSimulationJNI.IMUPlacer_append_sensor_to_opensim_rotations(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_sensor_to_opensim_rotations(Vec3 initValue) {
    opensimSimulationJNI.IMUPlacer_constructProperty_sensor_to_opensim_rotations(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_sensor_to_opensim_rotations() {
    return new Vec3(opensimSimulationJNI.IMUPlacer_get_sensor_to_opensim_rotations__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_sensor_to_opensim_rotations() {
    return new Vec3(opensimSimulationJNI.IMUPlacer_upd_sensor_to_opensim_rotations__SWIG_1(swigCPtr, this), false);
  }

  public void set_sensor_to_opensim_rotations(Vec3 value) {
    opensimSimulationJNI.IMUPlacer_set_sensor_to_opensim_rotations__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_orientation_file_for_calibration(IMUPlacer source) {
    opensimSimulationJNI.IMUPlacer_copyProperty_orientation_file_for_calibration(swigCPtr, this, IMUPlacer.getCPtr(source), source);
  }

  public String get_orientation_file_for_calibration(int i) {
    return opensimSimulationJNI.IMUPlacer_get_orientation_file_for_calibration__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_orientation_file_for_calibration(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_orientation_file_for_calibration__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_file_for_calibration(int i, String value) {
    opensimSimulationJNI.IMUPlacer_set_orientation_file_for_calibration__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_orientation_file_for_calibration(String value) {
    return opensimSimulationJNI.IMUPlacer_append_orientation_file_for_calibration(swigCPtr, this, value);
  }

  public void constructProperty_orientation_file_for_calibration(String initValue) {
    opensimSimulationJNI.IMUPlacer_constructProperty_orientation_file_for_calibration(swigCPtr, this, initValue);
  }

  public String get_orientation_file_for_calibration() {
    return opensimSimulationJNI.IMUPlacer_get_orientation_file_for_calibration__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_orientation_file_for_calibration() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_orientation_file_for_calibration__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_file_for_calibration(String value) {
    opensimSimulationJNI.IMUPlacer_set_orientation_file_for_calibration__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_output_model_file(IMUPlacer source) {
    opensimSimulationJNI.IMUPlacer_copyProperty_output_model_file(swigCPtr, this, IMUPlacer.getCPtr(source), source);
  }

  public String get_output_model_file(int i) {
    return opensimSimulationJNI.IMUPlacer_get_output_model_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_output_model_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_output_model_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_output_model_file(int i, String value) {
    opensimSimulationJNI.IMUPlacer_set_output_model_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_output_model_file(String value) {
    return opensimSimulationJNI.IMUPlacer_append_output_model_file(swigCPtr, this, value);
  }

  public void constructProperty_output_model_file(String initValue) {
    opensimSimulationJNI.IMUPlacer_constructProperty_output_model_file(swigCPtr, this, initValue);
  }

  public String get_output_model_file() {
    return opensimSimulationJNI.IMUPlacer_get_output_model_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_output_model_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUPlacer_upd_output_model_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_output_model_file(String value) {
    opensimSimulationJNI.IMUPlacer_set_output_model_file__SWIG_1(swigCPtr, this, value);
  }

  public IMUPlacer() {
    this(opensimSimulationJNI.new_IMUPlacer__SWIG_0(), true);
  }

  /**
   *  Create an IMUPlacer based on a setup file 
   */
  public IMUPlacer(String setupFile) {
    this(opensimSimulationJNI.new_IMUPlacer__SWIG_1(setupFile), true);
  }

  /**
   *  Run the calibration method to place IMUs on the model,<br>
   *      Optionally visualize the model post calibration.
   */
  public boolean run(boolean visualizeResults) throws java.io.IOException {
    return opensimSimulationJNI.IMUPlacer_run__SWIG_0(swigCPtr, this, visualizeResults);
  }

  /**
   *  Run the calibration method to place IMUs on the model,<br>
   *      Optionally visualize the model post calibration.
   */
  public boolean run() throws java.io.IOException {
    return opensimSimulationJNI.IMUPlacer_run__SWIG_1(swigCPtr, this);
  }

  public void setModel(Model aModel) {
    opensimSimulationJNI.IMUPlacer_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  /**
   *  Retrieve the calibrated model. This method will throw if called before <br>
   *     the run method is invoked.
   */
  public Model getCalibratedModel() {
    return new Model(opensimSimulationJNI.IMUPlacer_getCalibratedModel(swigCPtr, this), false);
  }

}

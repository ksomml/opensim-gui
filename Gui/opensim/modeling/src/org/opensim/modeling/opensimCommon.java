/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class opensimCommon {
  public static void opensim_version_common(SWIGTYPE_p_int major, SWIGTYPE_p_int minor, SWIGTYPE_p_int build) {
    opensimCommonJNI.opensim_version_common(SWIGTYPE_p_int.getCPtr(major), SWIGTYPE_p_int.getCPtr(minor), SWIGTYPE_p_int.getCPtr(build));
  }

  public static void opensim_about_common(String key, int maxlen, String value) {
    opensimCommonJNI.opensim_about_common(key, maxlen, value);
  }

  public static String GetVersionAndDate() {
    return opensimCommonJNI.GetVersionAndDate();
  }

  public static String GetVersion() {
    return opensimCommonJNI.GetVersion();
  }

  public static String GetOSInfoVerbose() {
    return opensimCommonJNI.GetOSInfoVerbose();
  }

  public static String GetOSInfo() {
    return opensimCommonJNI.GetOSInfo();
  }

  public static String GetCompilerVersion() {
    return opensimCommonJNI.GetCompilerVersion();
  }

  /**
   *  Get a string with the current date and time formatted as %Y-%m-%dT%H%M%S<br>
   *  (year, month, day, "T", hour, minute, second). You can change the datetime<br>
   *  format via the `format` parameter.<br>
   *  If you specify "ISO", then we use the ISO 8601 extended datetime format<br>
   *  %Y-%m-%dT%H:%M:%S.<br>
   *  See https://en.cppreference.com/w/cpp/io/manip/put_time.<br>
   *  
   */
  public static String getFormattedDateTime(boolean appendMicroseconds, String format) {
    return opensimCommonJNI.getFormattedDateTime__SWIG_0(appendMicroseconds, format);
  }

  /**
   *  Get a string with the current date and time formatted as %Y-%m-%dT%H%M%S<br>
   *  (year, month, day, "T", hour, minute, second). You can change the datetime<br>
   *  format via the `format` parameter.<br>
   *  If you specify "ISO", then we use the ISO 8601 extended datetime format<br>
   *  %Y-%m-%dT%H:%M:%S.<br>
   *  See https://en.cppreference.com/w/cpp/io/manip/put_time.<br>
   *  
   */
  public static String getFormattedDateTime(boolean appendMicroseconds) {
    return opensimCommonJNI.getFormattedDateTime__SWIG_1(appendMicroseconds);
  }

  /**
   *  Get a string with the current date and time formatted as %Y-%m-%dT%H%M%S<br>
   *  (year, month, day, "T", hour, minute, second). You can change the datetime<br>
   *  format via the `format` parameter.<br>
   *  If you specify "ISO", then we use the ISO 8601 extended datetime format<br>
   *  %Y-%m-%dT%H:%M:%S.<br>
   *  See https://en.cppreference.com/w/cpp/io/manip/put_time.<br>
   *  
   */
  public static String getFormattedDateTime() {
    return opensimCommonJNI.getFormattedDateTime__SWIG_2();
  }

  /**
   *  Create a SimTK::Vector with the provided length whose elements are<br>
   *  uniformly spaced between start and end (same as Matlab's linspace()).<br>
   *  
   */
  public static Vector createVectorLinspace(int length, double start, double end) {
    return new Vector(opensimCommonJNI.createVectorLinspace(length, start, end), true);
  }

  /**
   *  Linearly interpolate y(x) at new values of x. The optional 'ignoreNaNs'<br>
   *  argument will ignore any NaN values contained in the input vectors and<br>
   *  create the interpolant from the non-NaN values only. Note that this option<br>
   *  does not necessarily prevent NaN values from being returned in 'newX', which<br>
   *  will have NaN for any values of newX outside of the range of x.<br>
   *  @throws Exception if x and y are different sizes, or x or y is empty.<br>
   *  
   */
  public static Vector interpolate(Vector x, Vector y, Vector newX, boolean ignoreNaNs) {
    return new Vector(opensimCommonJNI.interpolate__SWIG_0(Vector.getCPtr(x), x, Vector.getCPtr(y), y, Vector.getCPtr(newX), newX, ignoreNaNs), true);
  }

  /**
   *  Linearly interpolate y(x) at new values of x. The optional 'ignoreNaNs'<br>
   *  argument will ignore any NaN values contained in the input vectors and<br>
   *  create the interpolant from the non-NaN values only. Note that this option<br>
   *  does not necessarily prevent NaN values from being returned in 'newX', which<br>
   *  will have NaN for any values of newX outside of the range of x.<br>
   *  @throws Exception if x and y are different sizes, or x or y is empty.<br>
   *  
   */
  public static Vector interpolate(Vector x, Vector y, Vector newX) {
    return new Vector(opensimCommonJNI.interpolate__SWIG_1(Vector.getCPtr(x), x, Vector.getCPtr(y), y, Vector.getCPtr(newX), newX), true);
  }

  /**
   *  An OpenSim XML file may contain file paths that are relative to the<br>
   *  directory containing the XML file; use this function to convert that<br>
   *  relative path into an absolute path.<br>
   *  
   */
  public static String convertRelativeFilePathToAbsoluteFromXMLDocument(String documentFileName, String filePathRelativeToDirectoryContainingDocument) {
    return opensimCommonJNI.convertRelativeFilePathToAbsoluteFromXMLDocument(documentFileName, filePathRelativeToDirectoryContainingDocument);
  }

  /**
   *  Solve for the root of a scalar function using the bisection method.<br>
   *  If the values of calcResidual(left) and calcResidual(right) have the same<br>
   *  sign and the logger level is Debug (or more verbose), then this function<br>
   *  writes a file `solveBisection_residual_&lt;timestamp&gt;.sto` containing the<br>
   *  residual function.<br>
   *  @param calcResidual a function that computes the error<br>
   *  @param left lower bound on the root<br>
   *  @param right upper bound on the root<br>
   *  @param tolerance convergence requires that the bisection's "left" and<br>
   *      "right" are less than tolerance apart.<br>
   *  @param maxIterations abort after this many iterations.<br>
   *  
   */
  public static double solveBisection(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t calcResidual, double left, double right, double tolerance, int maxIterations) {
    return opensimCommonJNI.solveBisection__SWIG_0(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t.getCPtr(calcResidual), left, right, tolerance, maxIterations);
  }

  /**
   *  Solve for the root of a scalar function using the bisection method.<br>
   *  If the values of calcResidual(left) and calcResidual(right) have the same<br>
   *  sign and the logger level is Debug (or more verbose), then this function<br>
   *  writes a file `solveBisection_residual_&lt;timestamp&gt;.sto` containing the<br>
   *  residual function.<br>
   *  @param calcResidual a function that computes the error<br>
   *  @param left lower bound on the root<br>
   *  @param right upper bound on the root<br>
   *  @param tolerance convergence requires that the bisection's "left" and<br>
   *      "right" are less than tolerance apart.<br>
   *  
   */
  public static double solveBisection(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t calcResidual, double left, double right, double tolerance) {
    return opensimCommonJNI.solveBisection__SWIG_1(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t.getCPtr(calcResidual), left, right, tolerance);
  }

  /**
   *  Solve for the root of a scalar function using the bisection method.<br>
   *  If the values of calcResidual(left) and calcResidual(right) have the same<br>
   *  sign and the logger level is Debug (or more verbose), then this function<br>
   *  writes a file `solveBisection_residual_&lt;timestamp&gt;.sto` containing the<br>
   *  residual function.<br>
   *  @param calcResidual a function that computes the error<br>
   *  @param left lower bound on the root<br>
   *  @param right upper bound on the root<br>
   *  
   */
  public static double solveBisection(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t calcResidual, double left, double right) {
    return opensimCommonJNI.solveBisection__SWIG_2(SWIGTYPE_p_std__functionT_double_fdouble_const_RF_t.getCPtr(calcResidual), left, right);
  }

  /**
   *  Compute the 'k' nearest neighbors of two matrices 'x' and 'y'. 'x' and 'y'<br>
   *  should contain the same number of columns, but can have different numbers of<br>
   *  rows. The function returns a matrix with 'k' number of columns and the same<br>
   *  number of rows as 'y'. Each row in the output matrix contains 'k' distance<br>
   *  values, where the first column contains the distance to the nearest neighbor<br>
   *  in 'x', the second column contains the distance to the second nearest<br>
   *  neighbor in 'x', and so on.<br>
   *  
   */
  public static Matrix computeKNearestNeighbors(Matrix x, Matrix y, int k) {
    return new Matrix(opensimCommonJNI.computeKNearestNeighbors__SWIG_0(Matrix.getCPtr(x), x, Matrix.getCPtr(y), y, k), true);
  }

  /**
   *  Compute the 'k' nearest neighbors of two matrices 'x' and 'y'. 'x' and 'y'<br>
   *  should contain the same number of columns, but can have different numbers of<br>
   *  rows. The function returns a matrix with 'k' number of columns and the same<br>
   *  number of rows as 'y'. Each row in the output matrix contains 'k' distance<br>
   *  values, where the first column contains the distance to the nearest neighbor<br>
   *  in 'x', the second column contains the distance to the second nearest<br>
   *  neighbor in 'x', and so on.<br>
   *  
   */
  public static Matrix computeKNearestNeighbors(Matrix x, Matrix y) {
    return new Matrix(opensimCommonJNI.computeKNearestNeighbors__SWIG_1(Matrix.getCPtr(x), x, Matrix.getCPtr(y), y), true);
  }

  public static int getArray_CAPMIN() {
    return opensimCommonJNI.Array_CAPMIN_get();
  }

  public static String getObjectDEFAULT_NAME() {
    return opensimCommonJNI.ObjectDEFAULT_NAME_get();
  }

  public static int getStorage_DEFAULT_CAPACITY() {
    return opensimCommonJNI.Storage_DEFAULT_CAPACITY_get();
  }

  public static int getIO_STRLEN() {
    return opensimCommonJNI.IO_STRLEN_get();
  }

  /**
   *  Load an OpenSim (plugin) library, using a path to a library (relative or<br>
   * absolute) but *without* the file extension (.dll, .so, .dylib). This method<br>
   * will prefer a debug variant of the library if OpenSim was built in debug.<br>
   * <br>
   * In MATLAB/Python, we suggest you use LoadOpenSimLibraryExact instead of this<br>
   * function. If you insist on using this variant, see the examples below.<br>
   * <br>
   * To load a plugin in MATLAB, use the following:<br>
   * {@code 
  import org.opensim.modeling.*;
  opensimCommon.LoadOpenSimLibrary('<path>/osimMyPlugin');
  }<br>
   * Do NOT use MATLAB's `loadlibrary()`.<br>
   * <br>
   * To load a plugin in Python, use the following:<br>
   * {@code 
  import opensim
  opensim.LoadOpenSimLibrary('<path>/osimMyPlugin')
  }  
   */
  public static SWIGTYPE_p_void LoadOpenSimLibrary(String lpLibFileName, boolean verbose) {
    long cPtr = opensimCommonJNI.LoadOpenSimLibrary__SWIG_0(lpLibFileName, verbose);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  /**
   *  Uses LoadOpenSimLibrary(const std::string&amp;, bool), with verbosity. 
   */
  public static void LoadOpenSimLibrary(String aLibraryName) {
    opensimCommonJNI.LoadOpenSimLibrary__SWIG_1(aLibraryName);
  }

  /**
   *  Load an OpenSim (plugin) library using the exact path specified. Therefore,<br>
   * you must supply an exact path to the library (either relative or absolute),<br>
   * including the file extension (.dll, .so, .dylib). The only change that may<br>
   * be made to the path is to convert forward slashes to backslashes on Windows<br>
   * (and vice versa on UNIX).<br>
   * <br>
   * To load a plugin in MATLAB, use the following:<br>
   * {@code 
  import org.opensim.modeling.*;
  opensimCommon.LoadOpenSimLibraryExact('<path>/osimMyPlugin.dll');
  }<br>
   * Do NOT use MATLAB's `loadlibrary()`.<br>
   * <br>
   * To load a plugin in Python, use the following:<br>
   * {@code 
  import opensim
  opensim.LoadOpenSimLibraryExact('<path>/osimMyPlugin.dll')
  }<br>
   * <br>
   * Note: If your (plugin) library depends on other libraries, make sure they<br>
   * are available as well (e.g., by setting the appropriate values for<br>
   * environment variables like `PATH` (Windows), `LD_LIBRARY_PATH` (Linux), and<br>
   * `DYLD_LIBRARY_PATH` (macOS)).<br>
   * <br>
   * @return true if the library was successfully loaded; false otherwise. 
   */
  public static boolean LoadOpenSimLibraryExact(String exactPath, boolean verbose) {
    return opensimCommonJNI.LoadOpenSimLibraryExact__SWIG_0(exactPath, verbose);
  }

  /**
   *  Load an OpenSim (plugin) library using the exact path specified. Therefore,<br>
   * you must supply an exact path to the library (either relative or absolute),<br>
   * including the file extension (.dll, .so, .dylib). The only change that may<br>
   * be made to the path is to convert forward slashes to backslashes on Windows<br>
   * (and vice versa on UNIX).<br>
   * <br>
   * To load a plugin in MATLAB, use the following:<br>
   * {@code 
  import org.opensim.modeling.*;
  opensimCommon.LoadOpenSimLibraryExact('<path>/osimMyPlugin.dll');
  }<br>
   * Do NOT use MATLAB's `loadlibrary()`.<br>
   * <br>
   * To load a plugin in Python, use the following:<br>
   * {@code 
  import opensim
  opensim.LoadOpenSimLibraryExact('<path>/osimMyPlugin.dll')
  }<br>
   * <br>
   * Note: If your (plugin) library depends on other libraries, make sure they<br>
   * are available as well (e.g., by setting the appropriate values for<br>
   * environment variables like `PATH` (Windows), `LD_LIBRARY_PATH` (Linux), and<br>
   * `DYLD_LIBRARY_PATH` (macOS)).<br>
   * <br>
   * @return true if the library was successfully loaded; false otherwise. 
   */
  public static boolean LoadOpenSimLibraryExact(String exactPath) {
    return opensimCommonJNI.LoadOpenSimLibraryExact__SWIG_1(exactPath);
  }

}

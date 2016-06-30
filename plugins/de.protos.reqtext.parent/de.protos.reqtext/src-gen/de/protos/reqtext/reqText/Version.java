/**
 * generated by Xtext 2.10.0
 */
package de.protos.reqtext.reqText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.protos.reqtext.reqText.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.Version#getMinor <em>Minor</em>}</li>
 * </ul>
 *
 * @see de.protos.reqtext.reqText.ReqTextPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject
{
  /**
   * Returns the value of the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Major</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Major</em>' attribute.
   * @see #setMajor(int)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getVersion_Major()
   * @model
   * @generated
   */
  int getMajor();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.Version#getMajor <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Major</em>' attribute.
   * @see #getMajor()
   * @generated
   */
  void setMajor(int value);

  /**
   * Returns the value of the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minor</em>' attribute.
   * @see #setMinor(int)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getVersion_Minor()
   * @model
   * @generated
   */
  int getMinor();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.Version#getMinor <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minor</em>' attribute.
   * @see #getMinor()
   * @generated
   */
  void setMinor(int value);

} // Version

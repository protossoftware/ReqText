/**
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext.reqText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getName <em>Name</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getDescription <em>Description</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getState <em>State</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getVersion <em>Version</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getImage <em>Image</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getReference <em>Reference</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.SpecObject#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject()
 * @model
 * @generated
 */
public interface SpecObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(de.protos.reqtext.reqText.Class)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Class()
   * @model
   * @generated
   */
  de.protos.reqtext.reqText.Class getClass_();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(de.protos.reqtext.reqText.Class value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(Image)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Image()
   * @model containment="true"
   * @generated
   */
  Image getImage();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(Image value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(SpecObject)
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Reference()
   * @model
   * @generated
   */
  SpecObject getReference();

  /**
   * Sets the value of the '{@link de.protos.reqtext.reqText.SpecObject#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(SpecObject value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link de.protos.reqtext.reqText.SpecObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see de.protos.reqtext.reqText.ReqTextPackage#getSpecObject_Children()
   * @model containment="true"
   * @generated
   */
  EList<SpecObject> getChildren();

} // SpecObject

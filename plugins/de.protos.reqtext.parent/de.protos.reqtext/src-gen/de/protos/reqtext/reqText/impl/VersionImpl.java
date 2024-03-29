/**
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext.reqText.impl;

import de.protos.reqtext.reqText.ReqTextPackage;
import de.protos.reqtext.reqText.Version;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.protos.reqtext.reqText.impl.VersionImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link de.protos.reqtext.reqText.impl.VersionImpl#getMinor <em>Minor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version
{
  /**
   * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajor()
   * @generated
   * @ordered
   */
  protected static final int MAJOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajor()
   * @generated
   * @ordered
   */
  protected int major = MAJOR_EDEFAULT;

  /**
   * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinor()
   * @generated
   * @ordered
   */
  protected static final int MINOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinor()
   * @generated
   * @ordered
   */
  protected int minor = MINOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReqTextPackage.Literals.VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMajor()
  {
    return major;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMajor(int newMajor)
  {
    int oldMajor = major;
    major = newMajor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqTextPackage.VERSION__MAJOR, oldMajor, major));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinor()
  {
    return minor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinor(int newMinor)
  {
    int oldMinor = minor;
    minor = newMinor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqTextPackage.VERSION__MINOR, oldMinor, minor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReqTextPackage.VERSION__MAJOR:
        return getMajor();
      case ReqTextPackage.VERSION__MINOR:
        return getMinor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReqTextPackage.VERSION__MAJOR:
        setMajor((Integer)newValue);
        return;
      case ReqTextPackage.VERSION__MINOR:
        setMinor((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReqTextPackage.VERSION__MAJOR:
        setMajor(MAJOR_EDEFAULT);
        return;
      case ReqTextPackage.VERSION__MINOR:
        setMinor(MINOR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReqTextPackage.VERSION__MAJOR:
        return major != MAJOR_EDEFAULT;
      case ReqTextPackage.VERSION__MINOR:
        return minor != MINOR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (major: ");
    result.append(major);
    result.append(", minor: ");
    result.append(minor);
    result.append(')');
    return result.toString();
  }

} //VersionImpl
